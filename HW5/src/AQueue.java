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

public class AQueue extends RuntimeException {
    String[] data;
    private int front= 0;
    private int size = 0;
    private int rear = 0;
    
    public AQueue() {
        data = new String[4];
    }
    
    public int size() { 
        return size; 
    }
    
    // enqueues an Object
    public void enqueue(String x) {
        if (size == data.length) {
            grow();
        }
        data[rear] = x;
        rear = (rear + 1) % data.length;
        size++;
        print();
    }
    
    public String dequeue() throws EmptyQueueException {
        //if queue is empty throw exception
        if ( size == 0 )
            throw new EmptyQueueException();
        //removes item at index 
        String x = data[front];
        data[front] = null;
        front = (front+1) % data.length;
        size--;
        print();
        return x;
    }
    
    private void grow() {
        String[] temp = new String[data.length * 2];
        int i = 0;
        while(i != size){
            front++;
            i++;
            temp[i] = data[front % data.length];
        }
        data = temp;
        front = 0;
    }

    private void print() {
        for (String element : data) {
            System.out.println(element);
        }
    } 
}
