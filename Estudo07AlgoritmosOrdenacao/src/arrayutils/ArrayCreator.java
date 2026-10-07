package arrayutils;

import java.util.Random;

import sorts.ArrayUtils;

public class ArrayCreator {
	ArrayShuffler arrayShuffler = new RandomShuffler();
	public static Random rand = new Random(422);
	
	public ArrayCreator() {}
	public ArrayCreator(ArrayShuffler as) {
		this();
		this.arrayShuffler = as;
	}
	
	public int[][] createNRandomArrays(int arrayQt, int arraysSize){
		int[][] arrays = new int[arrayQt][];
		for(int i=0; i<arrayQt; i++) {
			arrays[i] = createRandomArray(arraysSize);
		}
		return arrays;
	}
	
	public int[] createRandomArray(int size) {
		int[] aOrdenado = new int[size];
		for(int i=0; i<aOrdenado.length; i++) {
			aOrdenado[i] = i;
		}
		return this.arrayShuffler.shuffle(aOrdenado);
	}
	
	
	// embaralha o array inplace usando Fisher-yates 
	static class RandomShuffler implements ArrayShuffler {
		@Override
		public int[] shuffle(int[] a) {
			for (int i=a.length-1; i>0; i--)
				ArrayUtils.swap(a, i, rand.nextInt(i + 1));
			return a;
		}
	}
	
	@Override
	public String toString() {
		return "Array Creator " + arrayShuffler.getClass().getName();
	}

	// embaralha fracamente o array inplace 
	public static class LowRandomShuffler implements ArrayShuffler {
		@Override
		public int[] shuffle(int[] a) {
			for (int i=1; i<a.length; i++)
				if(rand.nextBoolean())
					ArrayUtils.swap(a, i-1, i);
			return a;
		}
	}
}
