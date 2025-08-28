/**
 *    author:  Lunero
 *    created: 22.08.2025 22:02:54
**/
import java.util.* ;

public class basic_buildin {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;
            
            // declare linked list
            LinkedList<String> list = new LinkedList<String>() ;

            // add value at beginning
            list.addFirst ("b") ;
            list.addFirst ("a") ;

            // printing
            System.out.println (list) ; // [a, b] 
            System.out.println (list.get(0)) ; // a

            // add value at end
            list.addLast ("c") ;
            System.out.println (list) ;
            list.add ("d") ;
            System.out.println (list) ;

            // size
            System.out.println (list.size()) ;

            // printing using loop
            for (int i = 0 ; i < list.size() ; i++)
                  System.out.print (list.get(i) + " ") ;
            System.out.println () ;

            // for-each loop
            for (String l : list)
                  System.out.print (l + " ") ;
            System.out.println () ;

            // remove first
            list.removeFirst() ;
            System.out.println (list) ;
            list.remove() ;
            System.out.println (list) ;

            // remove last
            list.removeLast() ;
            System.out.println (list) ;

            list.addFirst ("b") ;
            list.addFirst ("a") ;
            System.out.println (list) ;

            // remove selected index
            list.remove(1) ;
            System.out.println (list) ;
      }
}