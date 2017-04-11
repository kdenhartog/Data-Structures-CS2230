/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kyle
 */
public class BSTNode {
    protected BSTNode left, right;
    protected String data;
    
    public BSTNode(){
        left = null;
        right = null;
        data = null;
    }
    
    public BSTNode(String s) {
        left = null;
        right = null;
        data = s;
    }
}
