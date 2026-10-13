package implementacoes;

import java.util.Iterator;

import estruturas.pilha.Pilha;
import estruturas.pilha.PilhaListaLigada;
import interfaces.Conjunto;

public class BinarySearchTree implements Conjunto{

    TreeNode root = null;
    int tamanho = 0;

    @Override
    public boolean isEmpty() {
        return tamanho==0;
    }

    @Override
    public int size() {
        return tamanho;
    }

    @Override
    public void add(int e) {
        if(root==null){
            root = new TreeNode(e);
            tamanho++;
            return;
        }
        add(root, e);
    }

    private void add(TreeNode subRoot, int e){
        if(subRoot.element==e) return;
        else if(e > subRoot.element){
            if(subRoot.right==null){
                subRoot.right = new TreeNode(e);
                tamanho++;
                return;
            }else{
                add(subRoot.right, e);
            }
        }
        else { // if(e < subRoot.element)
            if(subRoot.left==null){
                subRoot.left = new TreeNode(e);
                tamanho++;
                return;
            }else{
                add(subRoot.left, e);
            }
        }
    }

    @Override
    public boolean contains(int e) {
        return contains(root, e);
    }

    private boolean contains(TreeNode subRoot, int e){
        if(subRoot == null) return false;
        
        if(e==subRoot.element)         return true;
        else   if(e>subRoot.element)   return contains(subRoot.right, e);
        else /*if(e<subRoot.element)*/ return contains(subRoot.left, e);
    }
    
    @Override
    public int maior() {
    	return maior(root);
    }
    
    private int maior(TreeNode subRoot) {
    	if(subRoot.right==null) return root.element;
    	return maior(subRoot.right);
    }
    
    @Override
    public int menor() {
    	return menor(root);
    }
    
    private int menor(TreeNode subRoot) {
    	if(subRoot.left==null) return root.element;
    	return maior(subRoot.left);
    }
    
    @Override
    public String toString() {
    	String res = "{";
    	for(int e: this)
    		res += e + ", ";
    	res += "}";
    	return res;
    }

	@Override
	public Iterator<Integer> iterator() {
		return new BinarySearchTreeIterator();
	}
	
	class BinarySearchTreeIterator implements Iterator<Integer>{

        Pilha<TreeNode> proximos = new PilhaListaLigada<>();

        BinarySearchTreeIterator(){
            pushSubRoot(root);
        }

        @Override
        public boolean hasNext() {
            return !proximos.isEmpty();
        }

        private void pushSubRoot(TreeNode subRoot){
            proximos.push(subRoot);
            if(subRoot.left!=null){
                pushSubRoot(subRoot.left);
            }
        }

        @Override
        public Integer next() {
            TreeNode proximo = proximos.pop();
            if(proximo.right!=null){
                pushSubRoot(proximo.right);
            }
            return proximo.element;
        }
	}
    
    

}
