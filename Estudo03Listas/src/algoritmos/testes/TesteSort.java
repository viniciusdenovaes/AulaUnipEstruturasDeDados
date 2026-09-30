package algoritmos.testes;

import java.time.Duration;
import java.time.Instant;

import algoritmos.sorts.SortMachine;
import lista_interface.Lista;

public class TesteSort {
	
	// Retorna tempo em milisegundos
	public static long testaSort(SortMachine sortMachine, Lista lista) {
		Instant start = Instant.now();
		
		Lista listaOrdenada = sortMachine.sort(lista);
		
		Instant end = Instant.now();
		
		long timeElapsedMilli = Duration.between(start, end).toMillis();
		
		assert(isSorted(lista));
		
		return timeElapsedMilli;
	}
	public static boolean isSorted(Lista lista) {
		for(int i=1; i<lista.size(); i++) 
			if(lista.get(i)<lista.get(i-1)) 
				return false;
		return true;
	}

}
