package implementacao.fila;

import interfaces.Node;
import interfaces.Pilha;

public class FilaListaLigada implements Pilha {

    private Node primeiro = null;
    private Node ultimo = null;
    int tamanho=0;

    @Override
    public boolean isEmpty() {
        return tamanho==0;
    }

    @Override
    public int size() {
        return tamanho;
    }

    @Override
    public void push(int e) {
        Node antigoUltimo = ultimo;
        ultimo = new Node(e);
        ultimo.next = null;

        if(primeiro==null) primeiro = ultimo;
        else               antigoUltimo.next = ultimo;

        tamanho++;
    }

    @Override
    public int pop() {
        int elemento = primeiro.element;
        primeiro = primeiro.next;
        if(primeiro==null) ultimo = null;

        tamanho--;

        return elemento;
    }

    @Override
    public int peek() {
        return primeiro.element;
    }
}
