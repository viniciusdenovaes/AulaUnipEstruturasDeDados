package algoritmos.testes;

import java.time.Duration;
import java.time.Instant;

import sorts.SortMachine;

public class TesteSort {
	
	// Retorna tempo em milisegundos
	public static long testaSort(SortMachine sortMachine, int[] a) {
		Instant start = Instant.now();
		int[] aOrdenado = sortMachine.sort(a);
		Instant end = Instant.now();
		
		long timeElapsedMilli = Duration.between(start, end).toMillis();
		
		assert(isSorted(aOrdenado));
		
		return timeElapsedMilli;
	}
	
	public static boolean isSorted(int[] lista) {
		for(int i=1; i<lista.length; i++) 
			if(lista[i]<lista[i-1]) 
				return false;
		return true;
	}

}
