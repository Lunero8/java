import java.util.Arrays ; 
import java.util.Scanner ;

public class test {

      // public static int sums (int a, int b) ; // this not working

      public static void print ()
      {
            System.out.println ("Its from method/functions") ;
      }

      public static int sum (int a, int b)
      {
            return a+b ;
      }

      public static void main (String[] args) {
            // Output
            System.out.print ("Hello World\n") ;
            System.out.println ("Hello World") ; // execute with nextline

            System.out.println (4+3) ;

            // Variable
            int a = 5 ;
            int b ;
            b = 8 ;

            System.out.println (a) ;
            System.out.println (b) ;
            System.out.println (a+b) ;
            System.out.println ("Value of a = " + a + " and value of b = " + b ) ;
            System.out.println (a + "" + b) ;

            // Max and Min functions
            System.out.println (Math.max(a,b)) ;
            int d = Math.min (a,b) ;
            System.out.println (d) ;

            // Data types
            //Primitive types
            /*
                  byte - 1 [-128 to 127]
                  short - 2 
                  int - 4
                  long - 8 (L)
                  float - 4 (F)
                  double - 8
                  char - 2
                  boolean - 1 [true/false]
            */
            byte age = 30 ;
            System.out.println (age) ;
            int number = 1234567890 ;
            System.out.println (number) ;
            long number2 = 12345678900L ;
            System.out.println (number2) ;
            float pi = 3.14F ;
            System.out.println (pi) ;
            char letter = '@' ;
            System.out.println (letter) ;
            boolean ok = true ;
            System.out.println (ok) ;

            // Non-primitive types
            // there are different types of functions and method for non primitive types data
            // String
            String name ;
            name = "Sayem" ;
            System.out.println (name) ;
            String name2 = new String ("Sayem") ;
            System.out.println (name2) ;
            String name3 = name+name2 ;
            System.out.println (name3) ; 
            name3 = name + " and " + name2 ;
            System.out.println (name3) ;

            // functions and method for String
            // Length
            System.out.println (name.length()) ;
            int size ;
            size = name.length() ;
            System.out.println (size) ;
            // View index-wise charecters
            System.out.println (name.charAt(0)) ;
            char ch = name.charAt(0) ;
            System.out.println (ch) ;
            String s = String.valueOf(name.charAt(0)) ;
            System.out.println (s) ;
            // Replace specific charecter 
            name.replace('a', 'A') ;
            System.out.println (name) ;
            System.out.println (name.replace('a', 'A')) ;
            System.out.println (name) ;
            String newname = new String (name.replace('a', 'A')) ;
            System.out.println (newname) ;
            System.out.println (name) ;

            // /*
            name = newname ;
            System.out.println (name) ;
            name = name+newname ;
            System.out.println (name) ;
            // */

            // Sub-String
            // first index included , second index excluded
            System.out.println (name.substring(0,3)) ;
            String subname = new String (name.substring(3,5)) ;
            System.out.println (subname) ;

            name = "Sayem" ;
            System.out.println (name) ;
            name = "SayemSayem" ;
            System.out.println (name) ;

            String namew = "Sayem@" ;
            String namez = new String ("Sayem!") ;
            System.out.println (namew) ;
            System.out.println (namez) ;

            // test with 0,1,!,true,false
            ok = false ;
            if (ok == true)
                  System.out.println ("Works") ;
            else
                  System.out.println ("Not Works") ;

            // break , outerloop break ;
            for (int i = 0 ; i <= 5 ; i++)
            {
                  for (int j = 1 ; j <= 5 ; j++)
                  {
                        System.out.print (j + " ") ;
                        if (i == 3)
                              break ;
                  }
                  System.out.println ("Break " + i) ;
                  System.out.println () ;
            }

            System.out.print ("\n\n\n\n") ;

            // outerLoop :

            for (int i = 0 ; i <= 5 ; i++)
            {
            outerLoop :

                  // System.out.println ("Knock knock") ;

                  for (int j = 1 ; j <= 5 ; j++)
                  {
                        System.out.print (j + " ") ;
                        if (i == 3)
                              break outerLoop ;
                  }
                  
                  System.out.println ("Break " + i) ;
                  System.out.println () ;
            }

            // Arrays 
            System.out.println ("\n---------- Arrays ----------\n") ;

            // boolean[] marks = new boolean[3] ;
            // String[] name = new String[3] ;

            int[] marks = new int[3] ;
            int[] mark = new int [3] ;
            marks[0] = 95 ;
            marks[1] = 92 ;
            marks[2] = 98 ;
            marks[0] = 93 ;
            mark[0] = 93 ;


            System.out.println (marks[0]) ;
            System.out.println (marks[1]) ;
            System.out.println (marks[2]) ;
            System.out.println (mark[0]) ;
            System.out.println (mark[1]) ; // initialize with 0 

            // Functions - propertices don't needed '()' 
            size = mark.length ;
            System.out.println (size) ;
            System.out.println (marks.length) ;

            // Sorting arrays increasing order
            Arrays.sort(marks) ; // Need to include a package - import java.util.Arrays ;
            System.out.println (marks[0]) ;
            System.out.println (marks[1]) ;
            System.out.println (marks[2]) ;

            // 2D Arrays

            int[][] arr = {{6,3,7},{7,5}} ;
            System.out.println (arr[0][2]) ; 
            System.out.println (arr[1][1]) ; 
            System.out.println (arr.length) ; // rows length

            // Exception Handling
            // System.out.println (arr[1][2]) ; // shows error
            // use this TRY AND CATCH method
            try{
                 System.out.println (arr[1][2]) ;
            } catch (Exception exception)
            {
                  // something if its catch
                  System.out.println ("Its catched") ;
            }
            
            System.out.println ("Code are workable") ;



            // Constants
            int f = 14 ;
            System.out.println (f) ;
            f = 13 ;
            System.out.println (f) ;

            final int fi = 12 ;
            System.out.println (fi) ;

            // Math class functions
            int aa = 5 ;
            int bb = 6 ;
            int max = Math.max (aa,bb) ;
            System.out.println (max) ;
            System.out.println (Math.min (aa,bb)) ;

            // Input
            // need to include - import java.util.Scanner ;
            // Scanner sc = new Scanner (System.in) ;

            // int old = sc.nextInt() ;
            // System.out.println (old) ;
            // String names ;
            // names = sc.next() ; // sc.next take single word
            // System.out.println (names) ;

            // String names2 = sc.nextLine() ; // sc.nextLine take full sentance
            // System.out.println (names2) ;



            // Method and Functions
            print() ;
            System.out.println (sum(1,3)) ;

            float test = 3.12345689F ;
            System.out.println (test) ;
            double test2 = 3.1234567890123456789 ;
            System.out.println (test2) ;

            // Scanner scan = new Scanner(System.in) ;
            // char test3 = scan.next().charAt(1) ;
            // System.out.println (test3) ;   
      }

      // not working in java
      // public static int sums (int a, int b) 
      // {
      //       return a+b ;
      // }
}