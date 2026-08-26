package implementacao.fila.array;

import java.util.EmptyStackException;

import interfaces.Fila;

public class FilaArray implements Fila {

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
    	if(cap<1) return;
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
    	if(isEmpty()) {
    		throw new EmptyStackException();
    	}
        
    	int res = elementos[0];
        for(int i=1; i<tamanho; i++)
        	elementos[i-1] = elementos[i];
        
        if(tamanho<elementos.length/2-1){
            resize(elementos.length/2);
        }
        
        tamanho--;
        return res;
    }

    @Override
    public int peek() {
        return elementos[0];
    }
    
    @Override
    public String toString() {
    	String res = "[";
    	for(int i=0; i<tamanho; i++)
    		res += elementos[i] + ", ";
    	return res + "]";
    }
}
