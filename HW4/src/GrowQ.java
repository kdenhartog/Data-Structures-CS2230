/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kyle
 */
class EmptyQueueException extends RuntimeException {
}

public class GrowQ<OBJ> {
// do not add more fields--you don’t need them 
    Object[] data;
    int front;
    int size;

    // default constructor
    public GrowQ() {
        data = new Object[4];
    }
// returns the current capacity of the queue 
    public int capacity() { 
        return data.length; 
    }

// returns the number of enqueued elements 
    public int size() { 
        return size; 
    }
    
// enqueues an Object
    public void enqueue(OBJ x) {
        if (size == data.length) {
            grow();
        }
        
        int rear = front + size + 1;
        size++;
        data[rear % data.length] = x;
}

// dequeues an Object
    public OBJ dequeue() throws EmptyQueueException {
        //if queue is empty throw exception
        if ( size == 0 )
            throw new EmptyQueueException();
        
        //removes item at index 
        front++;
        Object a = data[front % data.length];
        size--;
        return (OBJ) a;
    }

    
    // duplicates the size of the array 
    private void grow() {
        Object[] temp = new Object[data.length * 2];
        int i = 0;
        while(i != size){
            front++;
            i++;
            temp[i] = data[front % data.length];
        }
        data = temp;
        front = 0;
    }
}
