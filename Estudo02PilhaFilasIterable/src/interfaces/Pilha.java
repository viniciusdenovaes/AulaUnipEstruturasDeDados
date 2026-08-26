package interfaces;

// Estrutura do tipo LIFO
public interface Pilha {

    boolean isEmpty();
    int size();
    void push(int e);
    int pop();
    int peek();

}
