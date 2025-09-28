package implementacoes.lista_ligada;

import java.util.Iterator;

import estruturas.Node;
import lista_interface.Lista;

public class ListaLigada implements Lista{

	int tamanho = 0;
	Node primeiroNode = null;
	Node ultimoNode = null;
	
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
		int posicao = 0;
		Node res = primeiroNode;
		while(posicao<i) {
			res = res.next;
			posicao++;
		}
		return res;
	}

	@Override
	public void set(int element, int index) {
		getNode(index).elemento = element;
	}

	@Override
	public void delete(int index) {
		if(index==0)
			primeiroNode = primeiroNode.next;
		
		Node nodeAnterior = getNode(index-1);
		nodeAnterior.next = getNode(index).next;
		
		tamanho--;
	}

	@Override
	public void pushUltimo(int e) {
		if(tamanho==0) {
			putPrimeiroNode(e);
			return;
		}
		Node novoNode = new Node(e);
		ultimoNode.next = novoNode;
		ultimoNode = novoNode;
		
		tamanho++;
	}

	@Override
	public void pushPrimeiro(int e) {
		if(tamanho==0) {
			putPrimeiroNode(e);
			return;
		}
		
		Node novoNode = new Node(e, primeiroNode);
		primeiroNode = novoNode;
		
		tamanho++;
	}

	private void putPrimeiroNode(int e) {
		primeiroNode = ultimoNode = new Node(e);
		tamanho++;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return new ListaLigadaIterator();
	}
	
	class ListaLigadaIterator implements Iterator<Integer>{

		Node nodeAtual = primeiroNode;
		
		@Override
		public boolean hasNext() {
			return nodeAtual!=null;
		}

		@Override
		public Integer next() {
			int res = nodeAtual.elemento;
			nodeAtual = nodeAtual.next;
			return res;
		}
		
	}

}
