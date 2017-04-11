/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kdenhartog
 */
public class LinkedList {
    private LLNode head;
    private int size;

    public LinkedList() {
        head = new LLNode(null);
        size = 0;
    }

    public void add(String s) {
        LLNode temp = new LLNode(s);
        LLNode cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = temp;
        size++;
        print();
    }

    public void add(int index, String s) {
        LLNode newNode = new LLNode(s);
        LLNode current = head;

        //bound index to check if its within range of list size
        if(index < 0) {
            add(s);
        }

        //go to index location or stop at the end of list
        while(index != 0 || current.next == null) {
            current = current.next;
            index--;
        }

        LLNode temp = current.next;
        newNode.next = temp;
        current.next = newNode;
        size++;
        print();
    }

    public void remove(int index) {
        LLNode current = head;
            while(index != 1){
                current = current.next;
                index--;
            }
        LLNode prev = current.next;
        LLNode temp = prev.next;
        prev.next = temp.next;
        size--;
        print();
    }
    
    private void print(){
        if(head != null){
            LLNode cur = head.next;
            while(cur != null){
                System.out.println(cur.val);
                cur = cur.next;
            }
        }
    }
}
