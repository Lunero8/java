/**
 *    author:  Lunero
 *    created: 13.08.2025 02:48:51
**/
import java.util.* ;

public class try_ADT {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            arrayADT array = new arrayADT (10) ; // 10 is size 

            array.insert (10) ; 
            array.insert (20) ; 
            array.insert (30) ;

            System.out.println ("Size of Array : " + array.getSize()) ; 

            array.traverse() ;

            array.update(1, 15) ;
            array.traverse() ;
      }
}