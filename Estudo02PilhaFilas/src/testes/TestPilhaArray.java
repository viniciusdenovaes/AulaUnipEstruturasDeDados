package testes;

import implementacao.pilha.array.PilhaArray;
import interfaces.Pilha;

public class TestPilhaArray {

    public static void main(String[] args) {
        Pilha p = new PilhaArray();

        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);

        System.out.println(p.pop());
        System.out.println(p.peek());
        System.out.println(p.pop());
        System.out.println(p.pop());
        System.out.println(p.pop());

    }

}
