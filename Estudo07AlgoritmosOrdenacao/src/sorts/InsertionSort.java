package sorts;

public class InsertionSort implements SortMachine{

	@Override
	public int[] sort(int[] a) {
		
		for(int i=1; i<a.length; i++) {
			for(int j=i; j>0 && a[j]<a[j-1]; j--) {
				ArrayUtils.swap(a, j, j-1);
			}
		}
		
		return a;
	}

}
