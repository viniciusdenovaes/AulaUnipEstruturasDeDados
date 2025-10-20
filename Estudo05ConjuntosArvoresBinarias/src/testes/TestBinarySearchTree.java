package testes;

import implementacoes.BinarySearchTree;
import interfaces.Conjunto;

public class TestBinarySearchTree {

    public static void main(String[] args) {
        Conjunto conjunto = new BinarySearchTree();

        conjunto.add(10);
        conjunto.add(13);
        conjunto.add(12);
        conjunto.add(3);
        conjunto.add(2);
        conjunto.add(5);
        conjunto.add(0);
        conjunto.add(15);
        conjunto.add(10);
        conjunto.add(1);
        conjunto.add(7);
        conjunto.add(11);
        
        System.out.println("Tamanho: ");
        System.out.println(conjunto.size());
        
        conjunto.add(11);
        conjunto.add(11);

        System.out.println("Tamanho: ");
        System.out.println(conjunto.size());
        
        
        System.out.println("Contains 10?");
        System.out.println(conjunto.contains(10));
        
        System.out.println("Contains 13?");
        System.out.println(conjunto.contains(13));
        
        System.out.println("Contains 12?");
        System.out.println(conjunto.contains(12));
        
        System.out.println("Contains 3?");
        System.out.println(conjunto.contains(3));
        
        System.out.println("Contains 100?");
        System.out.println(conjunto.contains(100));
        
        System.out.println("Contains -1?");
        System.out.println(conjunto.contains(-1));
    }
    
}
