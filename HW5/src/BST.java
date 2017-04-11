/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kdenhartog
 */
public class BST {
    private BSTNode root;
    
    public BST(){
        this.root = null;
    }
    
    public void add(String s){
        root = add(root, s);
        print(root);
    }
    
    private BSTNode add(BSTNode node, String s){
        if(node == null)
            return new BSTNode(s);
        else{
            if(s.compareTo(root.data) < 0){
                node.left = add(node.left, s);
            }else{
                node.right = add(node.right, s);
            }
        }
        return node;
    }
    
    public void remove(String s){
        if(root == null)
           System.out.println("The tree is empty.");
        else{
            this.root = remove(root, s);
            System.out.println(s + " has been removed from the tree.\n");
            print(root);
            
        }
    }
    
    private BSTNode remove(BSTNode node, String s){
        if (node == null){
            throw new IllegalArgumentException(s + " not found in tree.");
        }else if (s.compareTo(node.data)< 0){
            node.left = remove(node.left,s);
            return node;
        }else if (s.compareTo(node.data)>0){
            node.right = remove(node.right,s);
            return node;
        }else {
            if (node.left == null && node.left == null){
                return null;
            }
            else if(node.right == null) {
                return node.left;
            }
            else if(node.left == null) {
                return node.right;
            }
            else {
                String max = findMax(node.left);
                node.left = remove(node.left,max);
                node.data = max;
                return node;
            }
        }
    }
    
    private String findMax(BSTNode node){
        if(node == null)
            return null;
        else if(node.right == null){
            return node.data;
        }else{
            return findMax(node.right);
        }
    }
    
    private void print(BSTNode n) {
        if(n != null){
            System.out.print(n.data + " ");
            print(n.left);
            print(n.right);
        }
    }
}
