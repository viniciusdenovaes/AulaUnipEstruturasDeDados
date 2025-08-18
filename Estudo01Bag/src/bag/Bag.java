package bag;


/*
 * Colecao que guarda, no maximo, 4 elementos
 * ignora qualquer elemento adicionado posteriormente
 * */
public interface Bag extends Iterable<Integer>{
	
	static final int TAMANHO_MAX = 4;
	int size();
	void add(int e);

}
