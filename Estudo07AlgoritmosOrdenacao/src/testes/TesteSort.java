package testes;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import arrayutils.ArrayCreator;
import sorts.ArrayUtils;
import sorts.InsertionSort;
import sorts.MergeSort;
import sorts.SelectionSort;
import sorts.SortMachine;

public class TesteSort {
	
	static final int testeQtd = 1_000;
	static final int arraysSize = 10_000;
	
	public static void main(String[] args) {
		runSorts();
	}
	
	// Retorna tempo em nanosegundos
	public static long timeSort(SortMachine sortMachine, int[] array) {
		
		if(array.length<20 && testeQtd<2) 
			System.out.println("Ordenando array " + ArrayUtils.aToString(array));
		
		Instant start = Instant.now();
		int[] aOrdenado = sortMachine.sort(array);
		Instant end = Instant.now();
		
		long timeElapsedNano = Duration.between(start, end).toNanos();
		
		if(array.length<20 && testeQtd<2) 
			System.out.println("array ordenado:" + ArrayUtils.aToString(array));
		
		if(!isSorted(aOrdenado)) 
			throw new AssertionError("SortMachine"+sortMachine+" nao ordenou o array: " + ArrayUtils.aToString(aOrdenado));
		
		return timeElapsedNano;
	}
	
	public static void runSorts() {
		List<SortMachine> sortMachines = List.of(
				new SelectionSort(), 
				new InsertionSort(),
				new MergeSort()
				);
		List<ArrayCreator> arrayCreators = List.of(
				// cria arrays completamente aleatorios
				new ArrayCreator(),
				// cria arrays quase aleatorios
				new ArrayCreator(new ArrayCreator.LowRandomShuffler())
				);
		
		mBenchTime(arrayCreators, sortMachines);
		
	}
	
	public static void mBenchTime(
			List<ArrayCreator> arrayCreators, 
			List<SortMachine> sortMachines
			) {
		
		for(var ac: arrayCreators)
			mBenchTimeArray(ac, sortMachines);
	}
	
	public static void mBenchTimeArray(
			ArrayCreator arrayCreator, 
			List<SortMachine> sortMachines
			) {
		
		System.out.println("criando " + testeQtd + " arrays de tamanho " + arraysSize);
		int[][] arrays = arrayCreator.createNRandomArrays(testeQtd, arraysSize);
		System.out.println("array shuffled com " + arrayCreator);
		
		for(var sm: sortMachines)
			mBenchTimeArray(sm, arrays);
	}
	
	
	public static void mBenchTimeArray(
			SortMachine sortMachine, 
			int[][] arrays) {
		
		System.out.println("ordenando com " + sortMachine.getClass().getName());
		
		long avgTime = 0;
		for(var a:arrays)
			avgTime += timeSort(sortMachine, a.clone()) / testeQtd;
		System.out.println("Tempo:" + avgTime + " nanosegundos");
		
	}
	
	public static boolean isSorted(int[] lista) {
		for(int i=1; i<lista.length; i++) 
			if(lista[i]<lista[i-1]) 
				return false;
		return true;
	}

}
