/**
 *    author:  Lunero
 *    created: 29.09.2025 00:39:27
**/
import java.util.* ;

public class using_javacfw {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            // using java collection framework
            Stack<Integer> s = new Stack<>() ; 

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