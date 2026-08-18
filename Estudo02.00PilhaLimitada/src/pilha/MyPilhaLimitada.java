package pilha;

import java.util.EmptyStackException;

public class MyPilhaLimitada implements Pilha{
	
	int tamanho = 0;
	int[] elementos;
	int capacidadeMaxima;
	
	public MyPilhaLimitada(int aCapacidadeMaxima) {
		this.capacidadeMaxima = aCapacidadeMaxima;
		elementos = new int[this.capacidadeMaxima];
	}
	
	@Override
	public boolean isEmpty() {
		return tamanho==0;
	}
	@Override
	public boolean isFull() {
		return tamanho==capacidadeMaxima;
	}

	@Override
	public int size() {
		return tamanho;
	}

	@Override
	public void push(int e) {
		if(tamanho>=capacidadeMaxima) return;
		
		elementos[tamanho] = e;
		tamanho++;
	}
	
	@Override
	public int pop() throws EmptyStackException {
		if(isEmpty()) {
			System.err.println("Tentando fazer pop em uma pilha vazia");
			throw new EmptyStackException();
		}
		int result = elementos[tamanho-1];
		tamanho--;
		return result;
	}
	
	@Override
	public String toString() {
		String res = "[";
		for(int i=0; i<tamanho; i++)
			res += elementos[i] + ", ";
		res += "]";
		return res;
	}

}
