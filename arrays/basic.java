/**
 *    author:  Lunero
 *    created: 01.08.2025 21:45:35
**/
import java.util.* ;

public class basic {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            // array declaration
            int[] marks = new int [3] ; // initialize with 0
            int result[] = {97, 98, 95} ;
            
            marks[0] = 97 ;
            marks[1] = 98 ;
            marks[2] = 95 ;

            // input from user
            int size = sc.nextInt() ;

            int[] number = new int [size] ;

            for (int i = 0 ; i < size ; i++)  
                  number[i] = sc.nextInt() ;

            // functions
            // array length
            int length = result.length ;
      }
}