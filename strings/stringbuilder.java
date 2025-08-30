/**
 *    author:  Lunero
 *    created: 27.07.2025 17:05:50
**/
import java.util.* ;

public class stringbuilder {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            // declare stringbuilder
            StringBuilder sb = new StringBuilder ("Sayem") ;

            // .setCharAt() : replace specific character
            sb.setCharAt (1, '@') ; // (index, new char)

            // .insert() : insert character
            sb.insert(0, 'S') ; 

            // .delete() : delete character or substring 
            sb.delete (0,1) ; // (start index, end index + 1)

            // .append() : added character at the end
            sb.append(" Luner") ;
            sb.append('o') ;

            // string to stringbuilder
            String str = "Java" ;
            StringBuilder a = new StringBuilder (str) ;
            a.append (" Programming") ;

            // stringbuilder to string
            str = a.toString() ;

            // compare strings are equals or not
            StringBuilder s1 = new StringBuilder ("A") ;
            StringBuilder s2 = new StringBuilder ("A") ;

            if (s1.toString().equals(s2.toString()))
                  System.out.println ("Yes") ;
            else
                  System.out.println ("No") ;

            s2.setCharAt(0, 'a') ;

            if (s1.toString().equalsIgnoreCase(s2.toString()))
                  System.out.println ("Yes") ;
            else
                  System.out.println ("No") ;

      }
}