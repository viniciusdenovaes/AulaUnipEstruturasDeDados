package teste;

import implementacoes.lista_array.ListaArray;
import implementacoes.lista_ligada.ListaLigada;
import lista_interface.Lista;

public class TesteListas {
	
	
	
	public static void main(String[] args) {
		Lista listaArray = new ListaArray();
		System.out.println("\nTestando Lista Array:");
		testaLista(listaArray);

		Lista listaLigada = new ListaLigada();
		System.out.println("\nTestando Lista Ligada:");
		testaLista(listaLigada);

	}
	
	public static void testaLista(Lista lista) {
		
		System.out.println("\nImprimindo tamanho da lista:");
		System.out.println(lista.size());
		
		System.out.println("\nAdicionando elementos na lista pushUltimo:");
		lista.pushUltimo(5);
		System.out.println("\nAdicionando elementos na lista pushUltimo:");
		lista.pushUltimo(3);
		System.out.println("\nAdicionando elementos na lista pushPrimeiro:");
		lista.pushPrimeiro(7);
		
		System.out.println("\nImprimindo tamanho da lista:");
		System.out.println(lista.size());
		
		System.out.println("\nIterando na lista:");
		for(int e: lista) 
			System.out.println(e);
		
		System.out.println("\nApagando segunda posicao:");
		lista.delete(1);
		
		System.out.println("\nIterando na lista:");
		for(int e: lista) 
			System.out.println(e);
		
		System.out.println("\nOlhando segunda posicao:");
		System.out.println(lista.get(1));
		
	}

}
