package implementacoes.lista_array;

import lista_interface.Lista;

public class ListaArray implements Lista{
	
	int[] elementos = new int[2];
	int tamanho = 0;

	@Override
	public boolean isEmpty() {
		return tamanho==0;
	}

	@Override
	public int size() {
		return tamanho;
	}

	@Override
	public int get(int i) {
		return elementos[i];
	}

	@Override
	public void set(int index, int element) {
		elementos[index] = element;
	}

	@Override
	public void pushUltimo(int e) {
		if(tamanho>=elementos.length)
			resize(2*elementos.length);
		elementos[tamanho++] = e;
	}

	@Override
	public void pushPrimeiro(int e) {
		insert(0, e);
	}

	@Override
	public int popUltimo() {
		if(tamanho<elementos.length/2)
			resize(elementos.length/2);
		
		int res = elementos[tamanho-1];
		tamanho--;
		return res;
	}

	@Override
	public int popPrimeiro() {
		int res = elementos[0];
		removeAt(0);
		return res;
	}

	@Override
	public void insert(int index, int element) {
		if(tamanho>=elementos.length)
			resize(2*elementos.length);
		
		// passando os elemento depois de index um espaco para a direita
		for(int i=tamanho; i>index; i--)
			elementos[i] = elementos[i-1];
		
		elementos[index] = element;
		tamanho++;
	}

	@Override
	public void removeAt(int index) {
		// passando os elemento depois de index um espaco para a esquerda
		for(int i=index; i<tamanho; i++)
			elementos[i] = elementos[i+1];
		
		tamanho--;
	}

	@Override
	public boolean removeElement(int element) {
		int index = indexOf(element);
		if(index==-1)
			return false;
		else {
			removeAt(index);
			return true;
		}
	}

	@Override
	public boolean contains(int element) {
		return indexOf(element)!=-1;
	}
	
	// retorna o indice do elemento
	// retorna -1 caso o element nao esteja
	private int indexOf(int element) {
		
		for(int i=0; i<tamanho; i++)
			if(elementos[i] == element)
				return i;
		
		return -1;
	}
	
	private void resize(int novaCapacidade) {
		
		if(novaCapacidade<1)return;
		
		int[] novosElementos = new int[novaCapacidade];
		for(int i=0; i<tamanho; i++)
			novosElementos[i] = elementos[i];
		
		elementos = novosElementos;
	}
	
	
	@Override
	public String toString() {
		String res = "ListaArray[";
		for(int i=0; i<tamanho;i++)
			res+= elementos[i] + ", ";
		res += "] ";
		return res;
	}
	
	
}
