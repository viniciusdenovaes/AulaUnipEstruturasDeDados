package testes;

import implementacao.fila.array.FilaArray;
import interfaces.Fila;

public class TestFilaArray {
	
	public static void main(String[] args) {
		
		Fila fila = new FilaArray();
		
		relatorioFila(fila);
		
		
		System.out.println("\nAdicionando elemento: 1, 2");
		fila.push(1);
		fila.push(2);
		
		relatorioFila(fila);
		
		System.out.println("fila peek: " + fila.peek());
		System.out.println("fila pop: " + fila.pop());
		System.out.println("fila peek: " + fila.peek());
		System.out.println("fila pop: " + fila.pop());
		
		
		System.out.println("\nAdicionando elemento: 3, 4, 5");
		fila.push(3);
		fila.push(4);
		fila.push(5);
		
		
		relatorioFila(fila);
		
		System.out.println("\nAdicionando elemento: 6, 7, 8");
		fila.push(6);
		fila.push(7);
		fila.push(8);
		
		relatorioFila(fila);
		
		System.out.println("fila pop: " + fila.pop());
		System.out.println("fila pop: " + fila.pop());
		System.out.println("fila pop: " + fila.pop());
		System.out.println("fila pop: " + fila.pop());
		System.out.println("fila pop: " + fila.pop());
		System.out.println("fila pop: " + fila.pop());
		relatorioFila(fila);
		System.out.println("o proximo pop, deve dar um erro e terminar o programa");
		System.out.println("fila pop: " + fila.pop());
		
	}
	
	static void relatorioFila(Fila p) {
		System.out.println("-----------------------");
		System.out.println("\nImprimindo fila: " + p);
		System.out.println("\ttamanho: " + p.size());
		System.out.println("\tEsta vazia? " + p.isEmpty());
		System.out.println("-----------------------");
	}

}
