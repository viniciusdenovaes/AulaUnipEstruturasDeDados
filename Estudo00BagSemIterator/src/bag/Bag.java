package bag;


/*
 * Colecao que guarda, no maximo, 5 elementos
 * ignora qualquer elemento adicionado posteriormente
 * */
public interface Bag{
	
	static final int TAMANHO_MAX = 5;
	boolean isEmpty();
	boolean isFull();
	int size();
	void add(int e);

}
