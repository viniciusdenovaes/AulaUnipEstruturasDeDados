package testes;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import entidades.Pato;

public class TestMapPatos {
	
	public static void main(String[] args) {
		
		List<Pato> patos = new LinkedList<>();
		Map<String, Pato> patosByName = new TreeMap<>();
		
		patos.add(new Pato("Beto", 0));
		patos.add(new Pato("Ana", 1));
		patos.add(new Pato("Carla", 3));
		patos.add(new Pato("Carla", 4));
		patos.add(new Pato("Carla", 5));
		patos.add(new Pato("ana", 6));
		patos.add(new Pato("Ana", 7));
		
		for(var p: patos) {
			patosByName.put(p.getNome(), p);
		}
		
		for(String nome: patosByName.keySet()) {
			System.out.println(nome);
			System.out.println(patosByName.get(nome));
		}
		
	}

}
