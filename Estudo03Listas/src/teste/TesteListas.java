package teste;

import implementacoes.lista_array.ListaArray;
import lista_interface.Lista;

public class TesteListas {
	
	
	
	public static void main(String[] args) {
		Lista listaArray = new ListaArray();
		System.out.println("\n\nTestando Lista Array:");
		testaLista(listaArray);

	}
	
	public static void testaLista(Lista lista) {
		
		System.out.println("size: " + lista.size());
		System.out.println("isEmpty? " + lista.isEmpty());
		System.out.println(lista);
		
		System.out.println("push ultimo 1 2 3");
		lista.pushUltimo(1);
		lista.pushUltimo(2);
		lista.pushUltimo(3);
		System.out.println("size: " + lista.size());
		System.out.println("isEmpty? " + lista.isEmpty());
		System.out.println(lista);
		
		System.out.println("push primeiro 4 5 6");
		lista.pushPrimeiro(4);
		lista.pushPrimeiro(5);
		lista.pushPrimeiro(6);
		System.out.println(lista);
		
		System.out.println("pop ultimo: " + lista.popUltimo());
		System.out.println("pop primeiro: " + lista.popPrimeiro());
		System.out.println(lista);
		
		System.out.println("qual elemento esta na posicao 1? " + lista.get(1));
		System.out.println("Colocando o 10 naposicao 1");
		lista.set(1, 10);
		System.out.println(lista);
		
		System.out.println("inserindo o 20 na posicao 1");
		lista.insert(1, 20);
		System.out.println(lista);
		
		System.out.println("lista contem o 30? " + lista.contains(30));
		System.out.println("lista contem o 20? " + lista.contains(20));
		
		System.out.println("removendo o 20: " + lista.removeElement(20));
		System.out.println("lista contem o 20? " + lista.contains(20));
		System.out.println("removendo o 20: " + lista.removeElement(20));
		System.out.println("lista contem o 20? " + lista.contains(20));
		System.out.println(lista);
		
		System.out.println("removendo o elemento na posicao 1");
		lista.removeAt(1);
		System.out.println(lista);
		
		
	}

}
