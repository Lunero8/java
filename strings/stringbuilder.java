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
      }
}