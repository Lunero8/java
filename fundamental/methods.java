import java.util.* ;

public class methods {
      
      static int s = 5 ;

      static void greet (String name)
      {
            System.out.println ("Greating " + name + "!") ;
      }
      
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            String name = "Sayem" ;

            greet(name) ; 

            int a = 1, b = 2 ;
            swaps(a, b) ;
            System.out.println (a + " " + b) ;

            // Change value
            int[] arr = {1,2,4,6,7,8} ;

            System.out.println (Arrays.toString(arr)) ;
            
            change(arr) ;

            System.out.println (Arrays.toString(arr)) ;

            // block scope

            int e = 10 ;

            {
                  System.out.println (e) ;

                  e = 7 ;
                  System.out.println (e) ;

                  int f = 8 ;
                  System.out.println (f) ;
            }

            System.out.println (e) ;
            // System.out.println (f) ; not working

            int f = 3 ;
            System.out.println (f) ;

            // shadowing
            System.out.println (s) ;

            shaw() ;
            System.out.println (s) ;

            int s = 55 ;
            System.out.println (s) ;

            // variable arguments
            v (1,2,3,4,5) ;
            v2 (1,2, "Sayem", "Rahman") ;

            cgb () ;
      }

      static void swaps (int a, int b)
      {
            int t = a ;
            a = b ;
            b = t ;
            System.out.println (a + " " + b) ;
      }

      static void change (int[] nums)
      {
            nums[0] = 55 ;
      }

      static void shaw ()
      {
            System.out.println (s) ;

            s = 6 ;
            System.out.println (s) ;

            int s = 7 ;
            System.out.println (s) ;
      }

      static void v (int ...v)
      {
            System.out.println (Arrays.toString(v)) ;
      }

      static void v2 (int a, int b, String ...v)
      {
            System.out.println (a) ;
            System.out.println (b) ;
            System.out.println (Arrays.toString(v)) ;
      }

      static void cgb ()
      {
            goodbye ("Sayem") ;
      }

      static void goodbye (String name)
      {
            System.out.println ("Good Bye " + name + "!") ;
      }
}