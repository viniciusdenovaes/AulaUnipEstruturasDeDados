package implementacoes;

import estruturas.TreeNode;
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

}
