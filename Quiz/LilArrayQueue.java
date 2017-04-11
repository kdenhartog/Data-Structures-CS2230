// QUIZ 6: FIX THE IMPLEMENTATION OF THE QUEUE
// There are problems in the way enqueue and dequeue are handled.
// Fix them methods!


// An almost correct implementation of an array-queue.
// It follows the "circular array" implementation idea.

// we define the exceptions; we make them "runtime exceptions",
// which *do not need to be captured*, making our code simpler...
class FullQueueException  extends RuntimeException {}
class EmptyQueueException extends RuntimeException {}

// the class we are concerned about
class LilArrayQueue {

  char[] array;
  int front, size;

  // This is Ok.
  public LilArrayQueue(int capacity) {
     array = new char[ capacity ];
     front = 0;
     size = 0;
  }

  // FIX THIS!
  public char dequeue() throws EmptyQueueException {
     // we complain if the queue is empty
     if ( size == 0 )
         throw new EmptyQueueException();

     // we care about circular indices
     front ++;
     char answer = array[front % array.length];
     size --;
     return answer;
  }

  // FIX THIS!
  public void enqueue(char x) throws FullQueueException {
     // complain if queue is full
     if ( size == array.length )
         throw new FullQueueException();

     // enqueue the item
     int rear = front + size + 1;
     size++;
     array [rear % array.length] = x;
  }

  // This is Ok.
  public boolean isEmpty() { return size==0; }

  // This is Ok. Use it to test the behavior of the queue.
  public static void main(String[] args) {
     LilArrayQueue A = new LilArrayQueue(8);
     String[] enq = {"ab","cd","ef","gh","i","j","k","lm","","rst","u","vw","x","y","z","","","","","","",""};
     System.out.println("Should dequeue: a, b, c, d, ..., x, y, z.");
     for(String s: enq) {
       for(char c: s.toCharArray()) A.enqueue(c);
       System.out.print( A.dequeue() );
       if ( !A.isEmpty() ) System.out.print( ", " );
     }
     System.out.println(".");
  }

}


