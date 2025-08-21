/**
 *    author:  Lunero
 *    created: 19.08.2025 02:50:43
**/
import java.util.* ;

public class arraylist {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;
            // Integer, Float, String, Boolean
            // declaration
            ArrayList<String> food = new ArrayList<String>() ;
            ArrayList<Integer> nums = new ArrayList<>() ;
            ArrayList<Integer> num = new ArrayList<Integer>() ;

            // add value
            food.add ("pizza") ;
            food.add ("burger") ;
            food.add ("biscuit") ;
            
            food.add (1, "cake") ; // add element in between 

            String s = sc.next() ;
            food.add (s) ;

            // output
            System.out.println (food) ;
            System.out.println (food.get(0)) ;

            for (int i = 0 ; i < food.size() ; i++)
                  System.out.print (food.get(i) + " ") ;

            System.out.println () ;

            // Functions
            // .size() : size of arraylist
            System.out.println (food.size()) ;

            // sorting
            Collections.sort (food) ;

            // .set(index , " ") : directly access by index
            food.set (0, "sushi") ;
            
            System.out.println (food.get(0)) ;

            // .remove() : remove value
            food.remove(1) ;

            System.out.println (food.get(1)) ;

            for (int i = 0 ; i < food.size() ; i++)
                  System.out.print (food.get(i) + " ") ;
            
            System.out.println (food.size()) ;

            // .clear() : clear arraylist
            food.clear () ;

            for (int i = 0 ; i < food.size() ; i++)
                  System.out.print (food.get(i) + " ") ;
            
            System.out.println (food.size()) ;

      }
}