package pilha;

import java.util.EmptyStackException;

public interface Pilha{
	boolean isEmpty();
	boolean isFull();
	int size();
	void push(int e);
	int pop() throws EmptyStackException;
}
