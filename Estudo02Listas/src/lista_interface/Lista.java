package lista_interface;

public interface Lista extends Iterable<Integer>{
	
	int size();
	
	int get(int i);
	void set(int element, int index);
	
	void delete(int index);
	
	void pushUltimo(int e);
	void pushPrimeiro(int e);

}
