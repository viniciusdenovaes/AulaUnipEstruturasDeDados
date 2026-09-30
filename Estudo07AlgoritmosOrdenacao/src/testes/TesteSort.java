package testes;

import java.time.Duration;
import java.time.Instant;

import sorts.SortMachine;
import sorts.SortUtils;

public class TesteSort {
	
	// Retorna tempo em milisegundos
	public static long testaSort(SortMachine sortMachine, int[] a) {
		
//		System.out.println("Array antes de ordenar");
//		System.out.println(SortUtils.aToString(a));
		System.out.println("Comecando ordenacao " + sortMachine.getClass().getName());
		
		Instant start = Instant.now();
		int[] aOrdenado = sortMachine.sort(a);
		Instant end = Instant.now();
		
		long timeElapsedMilli = Duration.between(start, end).toMillis();
		
		if(!isSorted(aOrdenado)) {
			throw new AssertionError("SortMachine"+sortMachine+" nao ordenou o array: " + SortUtils.aToString(aOrdenado));
		}
		System.out.println("array ordenado com sucesso em " + timeElapsedMilli + " mili segundos");
		
		return timeElapsedMilli;
	}
	
	public static boolean isSorted(int[] lista) {
		for(int i=1; i<lista.length; i++) 
			if(lista[i]<lista[i-1]) 
				return false;
		return true;
	}

}
