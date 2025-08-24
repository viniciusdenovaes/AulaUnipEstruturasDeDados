package implementacao.pilha.array;

import interfaces.Pilha;

public class PilhaArray implements Pilha {

    int tamanho = 0;
    int[] elementos = new int[1];

    @Override
    public boolean isEmpty() {
        return tamanho==0;
    }

    @Override
    public int size() {
        return tamanho;
    }

    private void resize(int cap){
        int[] outros = new int[cap];
        for(int i=0; i<tamanho; i++){
            outros[i] = elementos[i];
        }
        elementos = outros;
    }

    @Override
    public void push(int e) {
        if(tamanho==elementos.length){
            resize(2*tamanho);
        }
        elementos[tamanho] = e;
        tamanho++;
    }

    @Override
    public int pop() {
        if(tamanho<elementos.length/4){
            resize(elementos.length/2 + 1);
        }
        tamanho--;
        return elementos[tamanho];
    }

    @Override
    public int peek() {
        return elementos[tamanho-1];
    }
}
