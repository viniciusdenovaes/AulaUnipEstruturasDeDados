package sorts;

import java.util.Random;

public class SortUtils {
	
	// troca os elementos da posicao i e j do array a
	public static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	
	// Cria um array de tamanho size com elementos de 0 a size
	public static int[] createRandomArray(int size) {
		int[] aOrdenado = new int[size];
		for(int i=0; i<aOrdenado.length; i++) {
			aOrdenado[i] = i;
		}
		return shuffleArray(aOrdenado);
	}
	
	// embaralha o array inplace usando Fisher-yates 
	// retorna o array embaralhado
	public static int[] shuffleArray(int[] a) {
		Random rand = new Random();
		
		for (int i=a.length-1; i>0; i--) {
			int index = rand.nextInt(i + 1);
			swap(a, i, index);
        }
		
		return a;
	}
	

}
