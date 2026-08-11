package bag;

public class MyBag implements Bag{
	
	int tamanho = 0;
	int[] elementos = new int[Bag.TAMANHO_MAX];
	
	@Override
	public boolean isEmpty() {
		return tamanho==0;
	}
	@Override
	public boolean isFull() {
		return tamanho==Bag.TAMANHO_MAX;
	}


	@Override
	public int size() {
		return tamanho;
	}

	@Override
	public void add(int e) {
		if(tamanho>=TAMANHO_MAX) return;
		
		elementos[tamanho] = e;
		tamanho++;
	}
	
	@Override
	public String toString() {
		String res = "[";
		for(int i=0; i<tamanho; i++)
			res += elementos[i] + ", ";
		res += "]";
		return res;
	}


}
