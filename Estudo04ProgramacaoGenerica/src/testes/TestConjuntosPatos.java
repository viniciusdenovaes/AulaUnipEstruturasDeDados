package testes;

import java.util.Set;
import java.util.TreeSet;

import entidades.Pato;

public class TestConjuntosPatos {
	
	public static void main(String[] args) {
		
		Set<Pato> patos = new TreeSet<>();
		
		patos.add(new Pato("Beto", 0));
		patos.add(new Pato("Ana", 1));
		patos.add(new Pato("Carla", 3));
		patos.add(new Pato("Carla", 4));
		patos.add(new Pato("Carla", 5));
		patos.add(new Pato("ana", 6));
		patos.add(new Pato("Ana", 7));
		
		for(var p: patos) {
			System.out.println(p);
		}
		
	}

}
