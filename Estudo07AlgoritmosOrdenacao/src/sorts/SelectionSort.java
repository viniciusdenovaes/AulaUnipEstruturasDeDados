package sorts;

public class SelectionSort implements SortMachine {

	@Override
	public int[] sort(int[] a) {
		for(int i=0; i<a.length; i++) {
			// procurando o minimo no intervalo i a a.length
			int minIndex = i;
			for(int j = i+1; j<a.length; j++) {
				if(a[minIndex]>a[j]) {
					minIndex = j;
				}
			}
			SortUtils.swap(a, i, minIndex);
		}
		return a;
	}
	

}
