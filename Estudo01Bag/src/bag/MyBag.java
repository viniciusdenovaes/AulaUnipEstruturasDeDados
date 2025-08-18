package bag;

import java.util.Iterator;

public class MyBag implements Bag{
	
	int tamanho = 0;
	int[] elementos = new int[4];

	@Override
	public int size() {
		return tamanho;
	}

	@Override
	public void add(int e) {
		if(tamanho>=TAMANHO_MAX) return;
		
		elementos[tamanho] = e;
		tamanho++;
	}
	
	@Override
	public String toString() {
		String res = "[";
		for(int e:this)
			res += e + ", ";
		res += "]";
		return res;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new MyBagIterator();
	}
	
	class MyBagIterator implements Iterator<Integer>{
		int i=0;

		@Override
		public boolean hasNext() {
			return i<tamanho;
		}

		@Override
		public Integer next() {
			int res = elementos[i];
			i++;
			return res;
		}
		
	}

}
