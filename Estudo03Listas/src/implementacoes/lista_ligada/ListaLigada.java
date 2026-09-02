package implementacoes.lista_ligada;

import lista_interface.Lista;

public class ListaLigada implements Lista{
	
	private int tamanho = 0;
	private Node head = null;
	private Node tail = null;

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
		return getNode(i).elemento;
	}
	
	private Node getNode(int i) {
		int index = 0;
		Node countNode = head;
		
		while(countNode!=null) {
			if(index == i) return countNode;
			
			countNode = countNode.next;
			index++;
			
		}
		
		throw new IndexOutOfBoundsException(i);
	}
	
	@Override
	public void set(int index, int aElement) {
		getNode(index).elemento = aElement;
	}

	@Override
	public void pushUltimo(int e) {
		
		Node novoNode = new Node(e);
		
		if(isEmpty()) {
			head = tail = novoNode;
		}else {
			tail.next = novoNode;
			tail = novoNode;
		}
		
		tamanho++;
	}

	@Override
	public void pushPrimeiro(int e) {
		Node novoNode = new Node(e);
		if(isEmpty()) {
			head = tail = novoNode;
		}else {
			novoNode.next = head;
			head = novoNode;
		}
		
		tamanho++;
		
	}

	@Override
	public int popUltimo() {
		int res = tail.elemento;
		if(tamanho == 1) {
			head = tail = null;
		}else {
			Node penultimo = getNode(tamanho-2);
			penultimo.next = null;
		}
		
		tamanho--;
		return res;
	}

	@Override
	public int popPrimeiro() {
		int res = head.elemento;
		
		if(tamanho == 1) {
			head = tail = null;
		}else {
			head = head.next;
		}
		
		tamanho--;
		return res;
	}

	@Override
	public void insert(int index, int element) {
		Node novoNode = new Node(element);
		if(index==0) {
			pushPrimeiro(element);
			return;
		}else {
			Node indexNode = getNode(index);
			Node anterior = getNode(index-1);
			anterior.next = novoNode;
			novoNode.next = indexNode;
			tamanho++;
		}
	}

	@Override
	public void removeAt(int index) {
		if(index==0) {
			if(tamanho==0)  
				head = tail = null;
			else 
				head = head.next;
		}else {
			Node anterior = getNode(index-1);
			anterior.next = anterior.next.next;
		}
		tamanho--;
	}

	@Override
	public boolean removeElement(int element) {
		int index = indexOf(element);
		
		if(index==-1)return false;
		
		removeAt(indexOf(element));
		return true;
	}

	@Override
	public boolean contains(int element) {
		return indexOf(element)!=-1;
	}
	
	private int indexOf(int e) {
		int index = 0;
		Node itNode = head;
		
		while(itNode!=null){
			if(itNode.elemento==e) return index;
			itNode = itNode.next;
			index++;
		}
		
		return -1;
	}
	
	@Override
	public String toString() {
		String res = "Lista Ligada[";
		Node itNode = head;
		while(itNode!=null) {
			res += itNode.elemento + ", ";
			itNode = itNode.next;
		}
		res += "]";
		return res;
	}

}
