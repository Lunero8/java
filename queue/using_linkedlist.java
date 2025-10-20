/**
 *    author:  Lunero
 *    created: 21.10.2025 01:52:11
**/
import java.util.* ;

public class using_linkedlist {
      static class Node {
            int data ;
            Node next ;

            Node (int data) {
                  this.data = data ;
                  next = null ;
            }
      }

      static class Queue {
            static Node head = null ;
            static Node tail = null ;

            public static boolean isEmpty () {
                  return head == null ;
            }

            public static void add (int data) {
                  Node t = new Node (data) ;
                  
                  if (tail == null) {
                        head = tail = t ;
                        return ; 
                  }

                  tail.next = t ;
                  tail = t ;
            }

            public static int remove () {
                  if (isEmpty()) {
                        System.out.println ("empty queue") ;
                        return -1 ;
                  }

                  int front = head.data ;

                  if (head == tail)
                        head = tail = null ;
                  else
                        head = head.next ;

                  return front ;
            }

            public static int peek() {
                  if (isEmpty()) {
                        System.out.println ("Queue is empty") ;
                        return -1 ;
                  }

                  return head.data ;
            }
      }

      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            // Queue using Linked List 
            // Implementation 
            Queue q = new Queue() ;
            
            q.add (1) ;
            q.add (2) ;
            q.add (3) ;
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