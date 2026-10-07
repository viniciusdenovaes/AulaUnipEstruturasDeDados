package testes;

import sorts.InsertionSort;
import sorts.MergeSort;
import sorts.SelectionSort;
import arrayutils.ArrayCreator;

/*
 * Disclaimer: este eh um teste de tempo de algumas funcoes em java
 * este teste nao eh completamente confiavel 
 * Um teste de tempo de um programa se chama benchmark
 * Fazer um benchmark em java eh complicado pois envolve varias caracteristicas
 *   especificas do java
 * O java pode fazer otimizacoes enquanto roda o programa, 
 *   pode passar garbage collector enquanto um teste roda e outro nao
 * Mais informacoes:
 * https://stackoverflow.com/questions/504103/how-do-i-write-a-correct-micro-benchmark-in-java
 * 
 * */

public class MainTeste {
	
	public static void main(String[] args) {
		testeArrayAleatorio();
		testeArrayQuasiNotAleatorio();
		
	}
	
	public static void testeArrayAleatorio() {
		
		int testeQtd = 1_000;
		int arraysSize = 10_000;
		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.println("criando " + testeQtd + " arrays de tamanho " + arraysSize);
		int[][] arrays = new ArrayCreator().createNRandomArrays(arraysSize, arraysSize);
		System.out.println("arrays criados");
		System.out.println("-------------------------------------");
		System.out.println("");
		
		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.println("Testando array totalmente aleatorios");
		System.out.println("-------------------------------------");
		System.out.println("");
		
		
		long avgSelectionTime = 0;
		for(var a:arrays)
			avgSelectionTime += TesteSort.timeSort(new SelectionSort(), a.clone()) / testeQtd;
		System.out.println("Tempo para selection:" + avgSelectionTime + " nanosegundos");
		
		
		long avgInsertionTime = 0;
		for(var a:arrays)
			avgInsertionTime += TesteSort.timeSort(new InsertionSort(), a.clone()) / testeQtd;
		System.out.println("Tempo para insertion:" + avgInsertionTime + " nanosegundo");
		
		long avgMergeTime = 0;
		for(var a:arrays)
			avgMergeTime += TesteSort.timeSort(new MergeSort(), a.clone()) / testeQtd;
		System.out.println("Tempo para mergeSort:" + avgMergeTime + " nanosegundo");
		
	}

	
	public static void testeArrayQuasiNotAleatorio() {
		
		int testeQtd = 1_000;
		int arraysSize = 10_000;
		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.println("criando " + testeQtd + " arrays de tamanho " + arraysSize);
		int[][] arrays = new ArrayCreator(
				new ArrayCreator.LowRandomShuffler()
				).createNRandomArrays(arraysSize, arraysSize);
		System.out.println("arrays criados");
		System.out.println("-------------------------------------");
		System.out.println("");
		
		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.println("Testando arrays quase nao embaralhados");
		System.out.println("-------------------------------------");
		System.out.println("");
		
		
		long avgSelectionTime = 0;
		for(var a:arrays)
			avgSelectionTime += TesteSort.timeSort(new SelectionSort(), a.clone()) / testeQtd;
		System.out.println("Tempo para selection:" + avgSelectionTime + " nanosegundos");
		
		
		long avgInsertionTime = 0;
		for(var a:arrays)
			avgInsertionTime += TesteSort.timeSort(new InsertionSort(), a.clone()) / testeQtd;
		System.out.println("Tempo para insertion:" + avgInsertionTime + " nanosegundo");
		
		long avgMergeTime = 0;
		for(var a:arrays)
			avgMergeTime += TesteSort.timeSort(new MergeSort(), a.clone()) / testeQtd;
		System.out.println("Tempo para mergeSort:" + avgMergeTime + " nanosegundo");
		
	}

}
