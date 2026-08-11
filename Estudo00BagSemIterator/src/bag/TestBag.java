package bag;

public class TestBag {
	
	public static void main(String[] args) {
		
		Bag bag = new MyBag();
		
		System.out.println("\nImprimindo bag: " + bag);
		System.out.println("\ttamanho: " + bag.size());
		System.out.println("\tEsta vazia? " + bag.isEmpty());
		System.out.println("\tEsta cheia? " + bag.isFull());
		System.out.println("-----------------------");
		
		System.out.println("\nAdicionando elemento: 1, 2");
		bag.add(1);
		bag.add(2);
		
		System.out.println("\nImprimindo bag: " + bag);
		System.out.println("\ttamanho: " + bag.size());
		System.out.println("\tEsta vazia? " + bag.isEmpty());
		System.out.println("\tEsta cheia? " + bag.isFull());
		System.out.println("-----------------------");
		
		System.out.println("\nAdicionando elemento: 3, 4, 5");
		bag.add(3);
		bag.add(4);
		bag.add(5);
		
		System.out.println("\nImprimindo bag: " + bag);
		System.out.println("\ttamanho: " + bag.size());
		System.out.println("\tEsta vazia? " + bag.isEmpty());
		System.out.println("\tEsta cheia? " + bag.isFull());
		System.out.println("-----------------------");
		
		System.out.println("\nAdicionando elemento: 6, 7");
		bag.add(6);
		bag.add(7);
		
		System.out.println("\nImprimindo bag: " + bag);
		System.out.println("\ttamanho: " + bag.size());
		System.out.println("\tEsta vazia? " + bag.isEmpty());
		System.out.println("\tEsta cheia? " + bag.isFull());
		System.out.println("-----------------------");
		
		
	}

}
