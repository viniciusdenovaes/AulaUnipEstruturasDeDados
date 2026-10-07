package sorts;

public class ArrayUtils {
	
	// troca os elementos da posicao i e j do array a
	public static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	// array to string
	public static String aToString(int[] a) {
		String res = "";
		for(int e: a)
			res += e + ", ";
		res += "]";
		return res;
	}
	

}
