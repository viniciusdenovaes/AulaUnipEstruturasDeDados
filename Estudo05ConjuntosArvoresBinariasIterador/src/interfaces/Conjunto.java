package interfaces;

public interface Conjunto extends Iterable<Integer>{

    boolean isEmpty();
    int size();
    void add(int e);
    boolean contains(int e);
    int maior();
    int menor();

}