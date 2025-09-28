package implementacoes.lista_array;

import java.util.Iterator;

import lista_interface.Lista;

public class ListaArray implements Lista{

	int tamanho = 0;
	int tamanhoMaximo = 1;
	int[] elementos = new int[tamanhoMaximo];
	
	@Override
	public int size() {
		return tamanho;
	}

	@Override
	public int get(int i) {
		return elementos[i];
	}

	@Override
	public void set(int element, int index) {
		elementos[index] = element;
	}

	@Override
	public void delete(int index) {
		for(int i=index; i<tamanho-1; i++)
			elementos[i] = elementos[i+1];
		diminuiTamanho();
	}

	@Override
	public void pushUltimo(int e) {
		elementos[tamanho] = e;
		aumentaTamanho();
	}

	@Override
	public void pushPrimeiro(int e) {
		for(int i=tamanho; i>0; i--) 
			elementos[i] = elementos[i-1];
		elementos[0] = e;
		aumentaTamanho();
	}
	
	private void aumentaTamanho() {
		tamanho++;
		checkTamanhoMaximo();
	}
	
	private void diminuiTamanho() {
		tamanho--;
		checkTamanhoMaximo();
	}
	
	private void checkTamanhoMaximo() {
		if(tamanho>tamanhoMaximo-2)
			aumentaTamanhoMaximo();
		if(tamanho<tamanhoMaximo/4)
			diminuiTamanhoMaximo();
	}
	
	private void aumentaTamanhoMaximo() {
		setTamanhoMaximo(2*(tamanhoMaximo+1));
	}
	
	private void diminuiTamanhoMaximo() {
		setTamanhoMaximo(tamanhoMaximo/2 + 1);
	}
	
	private void setTamanhoMaximo(int n) {
		int[] novosElementos = new int[n];
		for(int i=0; i<tamanho; i++) {
			novosElementos[i] = elementos[i];
		}
		elementos = novosElementos;
	}

	@Override
	public String toString() {
		String res = "[";
		for(int e: elementos)
			res += ", ";
		res+="]";
		return res;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return new ListaArrayIterator();
	}
	
	class ListaArrayIterator implements Iterator<Integer>{

		int posicao = 0;
		
		@Override
		public boolean hasNext() {
			return posicao<tamanho;
		}

		@Override
		public Integer next() {
			int res = elementos[posicao];
			posicao++;
			return res;
		}
		
	}

}
