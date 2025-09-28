/**
 *    author:  Lunero
 *    created: 29.09.2025 00:25:16
**/
import java.util.* ;

public class using_linkedlist {

      static class Node {
            int data ;
            Node next ; 

            public Node (int data) {
                  this.data = data ;
                  next = null ;
            }
      }

      static class Stack {
            public static Node head ;

            public static boolean isEmpty() {
                  return head == null ;
            }

            public static void push (int data) {
                  Node newNode = new Node (data) ;

                  if (isEmpty()) {
                        head = newNode ;
                        return ;
                  }

                  newNode.next = head ;
                  head = newNode ;
            }

            public static int pop () {
                  if (isEmpty())
                        return -1 ;

                  int top = head.data ;

                  head = head.next ;

                  return top ;
            }

            public static int peek() {
                  if (isEmpty())
                        return -1 ;
                  
                  return head.data ;
            }
      }

      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            // stack implementation : array, arraylist, linkedlist
            // linkedlist
            Stack s = new Stack () ;
            s.push(1) ;
            s.push(2) ;
            s.push(3) ;
            s.push(4) ;

            while (!s.isEmpty()) {
                  // System.out.println (s.peek()) ;
                  // s.pop() ;

                  System.out.println (s.pop()) ;
            }
      }
}