package testes;

import java.util.Set;
import java.util.TreeSet;

public class TestConjunto {
	
	public static void main(String[] args) {
		
		Set<Integer> numeros = new TreeSet<>();
		numeros.add(1);
		numeros.add(10);
		numeros.add(2);
		numeros.add(20);
		numeros.add(1);
		numeros.add(2);
		
		for(var e : numeros) {
			System.out.println(e);
		}
		
		
	}

}
