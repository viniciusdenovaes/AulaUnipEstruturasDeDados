package testes;

import implementacao.pilha.array.PilhaArray;
import interfaces.Pilha;

public class TestPilhaArray {
	
	public static void main(String[] args) {
		
		Pilha pilha = new PilhaArray();
		
		relatorioPilha(pilha);
		
		
		System.out.println("\nAdicionando elemento: 1, 2");
		pilha.push(1);
		pilha.push(2);
		
		relatorioPilha(pilha);
		
		System.out.println("pilha peek: " + pilha.peek());
		System.out.println("pilha pop: " + pilha.pop());
		System.out.println("pilha peek: " + pilha.peek());
		System.out.println("pilha pop: " + pilha.pop());
		
		
		System.out.println("\nAdicionando elemento: 3, 4, 5");
		pilha.push(3);
		pilha.push(4);
		pilha.push(5);
		
		
		relatorioPilha(pilha);
		
		System.out.println("\nAdicionando elemento: 6, 7, 8");
		pilha.push(6);
		pilha.push(7);
		pilha.push(8);
		
		relatorioPilha(pilha);
		
		System.out.println("pilha pop: " + pilha.pop());
		System.out.println("pilha pop: " + pilha.pop());
		System.out.println("pilha pop: " + pilha.pop());
		System.out.println("pilha pop: " + pilha.pop());
		System.out.println("pilha pop: " + pilha.pop());
		System.out.println("pilha pop: " + pilha.pop());
		relatorioPilha(pilha);
		System.out.println("o proximo pop, deve dar um erro e terminar o programa");
		System.out.println("pilha pop: " + pilha.pop());
		
	}
	
	static void relatorioPilha(Pilha p) {
		System.out.println("-----------------------");
		System.out.println("\nImprimindo pilha: " + p);
		System.out.println("\ttamanho: " + p.size());
		System.out.println("\tEsta vazia? " + p.isEmpty());
		System.out.println("-----------------------");
	}

}
