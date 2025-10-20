/**
 *    author:  Lunero
 *    created: 21.10.2025 01:21:57
**/
import java.util.* ;

public class circular_queue_using_array {
      static class Queue {
            static  int arr[] ;
            static int size ;
            static int rear = -1 ; 
            static int front = -1 ;

            Queue (int n) {
                  arr = new int [n] ;
                  this.size = n ; 
            }

            public static boolean isEmpty() {
                  return rear == -1 && front == -1 ;
            }

            public static boolean isFull () {
                  return (rear+1) % size == front ;
            }

            // enqueue or add O(1)
            public static void add (int data) {
                  if (isFull()) {
                        System.out.println ("Full Queue") ;
                        return ;
                  }
                  
                  rear = (rear+1) % size ;

                  arr[rear] = data ;

                  if (front == -1) // First element case 
                        front = 0 ; 
            }

            // dequeue or delete O(n)
            public static int remove () { 
                  if (isEmpty()) {
                        System.out.println ("Queue is empty") ;
                        return -1 ;
                  }

                  int result = arr[front] ;  
                  
                  if (rear == front) // single element conditions
                        rear = front = -1 ; 
                  else
                        front = (front + 1) % size ;

                  return result ;
            }

            public static int peek() {
                  if (isEmpty()) {
                        System.out.println ("Queue is empty") ;
                        return -1 ;
                  }

                  return arr[front] ;
            }
      }

      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            // Circular Queue using array  
            // Implementation 
            Queue q = new Queue(5) ;
            
            q.add (1) ;
            q.add (2) ;
            q.add (3) ;
            q.add (3) ;
            q.add (3) ;
            q.add (3) ;

            while (!q.isEmpty()) {
                  System.out.println (q.peek()) ;
                  // q.remove() ;
                  System.out.println (q.remove()) ;
            }
      }
}