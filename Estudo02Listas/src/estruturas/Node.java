package estruturas;

public class Node {
	
	public int elemento;
	public Node next = null;
	
	public Node() {}
	
	public Node(int aElemento) {
		this();
		this.elemento = aElemento;
	}

	public Node(int aElemento, Node aNext) {
		this(aElemento);
		this.next = aNext;
	}
	
	@Override
	public String toString() {
		return "Node: " + elemento;
	}

}
