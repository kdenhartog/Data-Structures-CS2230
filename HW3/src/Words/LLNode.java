/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Words;

/**
 *
 * @author kyle
 */
public class LLNode {
    LLNode next;
    char val;
    
    //default
    public LLNode(){
        
    }
    
    public LLNode(char val){
        this.next = null;
        this.val = val;
    }
    
    public LLNode(LLNode next) {
        next = this.next;
    }
    
    //data + next
    public LLNode(char val, LLNode next){
        next = this.next;
        val = this.val;
    }
    
    public void setNext(LLNode n){
        next = n;
    }
}
