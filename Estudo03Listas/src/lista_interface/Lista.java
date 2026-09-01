package lista_interface;

public interface Lista{
	
	boolean isEmpty();
	int size();
	
	int get(int i);
	void set(int index, int element);
	
	void pushUltimo(int e);
	void pushPrimeiro(int e);
	int popUltimo();
	int popPrimeiro();
	
	void insert(int index, int element);
	void removeAt(int index);
	boolean removeElement(int element);
	boolean contains(int element);
	

}
