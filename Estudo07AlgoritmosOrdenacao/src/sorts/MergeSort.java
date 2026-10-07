package sorts;

public class MergeSort implements SortMachine {
	
	private int[] aux;

	@Override
	public int[] sort(int[] a) {
		aux = new int[a.length];
		mergeSort(a, 0, a.length-1);
		return a;
	}
	
	// ordena de lo ateh hi
	//   o algoritmo inclui a posicao final hi
	private void mergeSort(int[] a, int lo, int hi) {
		// caso base 
		if(lo>=hi) return;
		int mid = lo + (hi-lo)/2;
		mergeSort(a, lo, mid);   // ordena a parte da esquerda
		mergeSort(a, mid+1, hi); // ordena a parte da direita
		merge(a, lo, mid, hi);   // faz o merge das duas
	}
	
	// faz o merge do array nas posicoes [lo..mid] e [mid+1..hi]
	//   perceba que o algoritmo inclue a posicao final
	private void merge(int[] a, int lo, int mid, int hi) {
		int i = lo, j = mid+1;
		
		// precisa fazer uma copia desta parte do array
		// pois vamos guardar o resultado no proprio array a
		for(int k=lo; k<=hi; k++)
			aux[k] = a[k];
		
		for(int k=lo; k<=hi; k++) {
			if     (i>mid)           a[k] = aux[j++];
			else if(j>hi)            a[k] = aux[i++];
			else if(aux[i] < aux[j]) a[k] = aux[i++];
			else                     a[k] = aux[j++];
		}
		
		
	}

}
