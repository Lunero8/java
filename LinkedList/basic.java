/**
 *    author:  Lunero
 *    created: 22.08.2025 08:20:52
**/
import java.util.* ;

public class basic {
      // linkedlist class
      class Node {
            String data ;
            Node next ;

            Node (String data) {
                  this.data = data ;
                  this.next = null ;
                  size++ ;
            }
      }

      Node head  ;
      
      private int size ;

      basic () {
            this.size = 0 ;
      }

      // add first
      public void addFirst (String data) {
            Node newNode = new Node(data) ;

            if (head == null)
            {
                  head = newNode ;
                  return ;
            }

            newNode.next = head ;
            head = newNode ;
      }

      // add last
      public void addLast (String data) {
            Node newNode = new Node (data) ;

            if (head == null)
            {
                  head = newNode ;
                  return  ;
            }

            Node currentNode = head ;

            while (currentNode.next != null)
                  currentNode = currentNode.next ;
            
            currentNode.next = newNode ;
      }

      // printing
      public void print () {
            Node currentNode = head ;

            if (currentNode == null)
            {
                  System.out.println ("List is empty.") ;
                  return ;
            }

            while (currentNode != null)
            {
                  System.out.print (currentNode.data + " ") ;
                  currentNode = currentNode.next ;
            }

            System.out.println () ;
      }

      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            basic list = new basic() ;

            list.addFirst ("A") ;
            list.addFirst ("B") ;
            list.addLast ("C") ;

            // delete first
            list.head = list.head.next ;
            list.print() ;
            list.size-- ;
            System.out.println (list.size) ;

            // delete last
            Node currentNode = list.head ;
            while (currentNode.next.next != null)
                  currentNode = currentNode.next ;
            
            currentNode.next = null ;
            list.size-- ;
            list.print() ;
            System.out.println (list.size) ;

            list.head = list.head.next ;
            list.print() ;
            list.size-- ;
            System.out.println (list.size) ;
      }
}