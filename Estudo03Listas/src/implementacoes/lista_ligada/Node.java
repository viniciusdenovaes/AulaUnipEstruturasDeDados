package implementacoes.lista_ligada;

public class Node {
	public int elemento;
	public Node next = null;
	
	public Node(int aElemento) {
		this.elemento = aElemento;
	}
	
	public Node(int aElemento, Node aNextNode) {
		this(aElemento);
		this.next = aNextNode;
	}
	
	@Override
	public String toString() {
		String res = ""+elemento+"->";
		res += next!=null?next.elemento:"null";
		return res;
	}

}
