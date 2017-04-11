/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kyle
 */
public class LLNode {
    LLNode next;
    String val;
    
    //default
    public LLNode(){
        
    }
    
    public LLNode(String val){
        this.next = null;
        this.val = val;
    }
    
    //data + next
    public LLNode(String val, LLNode next){
        next = this.next;
        val = this.val;
    }
}
