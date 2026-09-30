package testes;

import sorts.InsertionSort;
import sorts.SelectionSort;
import sorts.SortUtils;

public class MainTeste {
	
	public static void main(String[] args) {
		testeArrayAleatorio();
		testeArrayQuasiNotAleatorio();
		
	}
	
	public static void testeArrayAleatorio() {
		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.println("Testando array totalmente aleatorios");
		System.out.println("-------------------------------------");
		System.out.println("");
		
		int[] a = SortUtils.createRandomArray(10_000);
		long selectionTime = TesteSort.testaSort(new SelectionSort(), a);
		System.out.println("Tempo para selection:" + selectionTime + " milisegundos");
		
		
		int[] b = SortUtils.createRandomArray(10_000);
		long insertionTime = TesteSort.testaSort(new InsertionSort(), b);
		System.out.println("Tempo para insertion:" + insertionTime + " milisegundos");
		
	}

	
	public static void testeArrayQuasiNotAleatorio() {
		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.println("Testando array quase nao aleatorios");
		System.out.println("-------------------------------------");
		System.out.println("");
		
		int[] a = SortUtils.createQuasiNotRandomArray(10_000);
		long selectionTime = TesteSort.testaSort(new SelectionSort(), a);
		System.out.println("Tempo para selection:" + selectionTime + " milisegundos");
		
		
		int[] b = SortUtils.createQuasiNotRandomArray(10_000);
		long insertionTime = TesteSort.testaSort(new InsertionSort(), b);
		System.out.println("Tempo para insertion:" + insertionTime + " milisegundos");
		
	}

}
