/**
 *    author:  Lunero
 *    created: 21.10.2025 02:25:51
**/
import java.util.* ;

public class using_javacfwarraydeque {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            // Queue using Java Collection Framework
            // Implementation 
            Queue<Integer> q = new ArrayDeque<>() ;
            // Character, Boolean, ...

            q.add (1) ;
            q.add (2) ;
            q.add (3) ;
            q.add (4) ;
            q.add (5) ;

            while (!q.isEmpty()) {
                  System.out.println (q.peek()) ;
                  // q.remove() ;
                  System.out.println (q.remove()) ;
            }
      }
}