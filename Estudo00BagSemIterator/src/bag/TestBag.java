package bag;

public class TestBag {
	
	public static void main(String[] args) {
		
		Bag bag = new MyBag();
		
		System.out.println("\nImprimindo bag");
		System.out.println(bag);
		System.out.println("\nImprimindo tamanho");
		System.out.println(bag.size());
		System.out.println("\nEsta vazia?");
		System.out.println(bag.isEmpty());
		System.out.println("\nEsta cheia?");
		System.out.println(bag.isFull());
		
		System.out.println("\nAdicionando elemento: 1, 2");
		bag.add(1);
		bag.add(2);
		
		System.out.println("\nImprimindo bag");
		System.out.println(bag);
		System.out.println("\nImprimindo tamanho");
		System.out.println(bag.size());
		System.out.println("\nEsta vazia?");
		System.out.println(bag.isEmpty());
		System.out.println("\nEsta cheia?");
		System.out.println(bag.isFull());
		
		System.out.println("\nAdicionando elemento: 3, 4, 5");
		bag.add(3);
		bag.add(4);
		bag.add(5);
		
		System.out.println("\nImprimindo bag");
		System.out.println(bag);
		System.out.println("\nImprimindo tamanho");
		System.out.println(bag.size());
		System.out.println("\nEsta vazia?");
		System.out.println(bag.isEmpty());
		System.out.println("\nEsta cheia?");
		System.out.println(bag.isFull());
		
		
		System.out.println("\nAdicionando elemento: 6, 7");
		bag.add(6);
		bag.add(7);
		
		System.out.println("\nImprimindo bag");
		System.out.println(bag);
		System.out.println("\nImprimindo tamanho");
		System.out.println(bag.size());
		System.out.println("\nEsta vazia?");
		System.out.println(bag.isEmpty());
		System.out.println("\nEsta cheia?");
		System.out.println(bag.isFull());
		
		
	}

}
