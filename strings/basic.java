/**
 *    author:  Lunero
 *    created: 27.07.2025 15:12:34
**/
import java.util.* ;

public class basic {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            // String declaration
            String name = "Sayem" ;
            String fullName = "Aminur Rahman Sayem" ;
            String sentence = "My name is Lunero." ;

            // input from user
            String userName = sc.next() ; // single word
            String userName2 = sc.nextLine() ; // full sentence

            char a = sc.next().charAt(0) ; // input "sayem" a = 's'
            char b = sc.next().charAt(1) ; // input "sayem" b = 'a'

            // functions
            // concatenation
            String firstName = "Aminur Rahman" ;
            String lastName = "Sayem" ;

            String fullNameConcatenation = firstName + " " + lastName ; // Aminur Rahman Sayem

            // string length
            int length = firstName.length() ; // 13

            // .charAt() : select a character from string
            char d = firstName.charAt(5) ; // 'r' index based

            // .compareTo : compare strings
            String compareName1 = "Sayem" ;
            String compareName2 = "Lunero" ;

                  /* 
                  - s1 > s2 : +ve value
                  - s1 == s2 : 0
                  - s1 < s2 : -ve value 
                  */

            if (compareName1.compareTo (compareName2) == 0){ 
                  // print equal, greater or smaller 
            }

            // .equals() 
            String tryEquals = "Hello" ;

            if (tryEquals.equals("Hello")) {
                  // print yes
            }

            // .substring : Sub String
            String substringFullName = "Aminur Rahman Sayem" ;
            String substringFirstName = substringFullName.substring(0, 5) ; // Aminu , (beginning index, last index+1)
            String substringLastName = substringFullName.substring(5) ; //r Rahman Sayem , (index 5 to last index)

            // .split() : splits a string into an array of substrings based on a specified delimiter
            String passageForSplit = "Aminur Rahman Sayem" ;

            String[] stringArray1 = passageForSplit.split("\\s+") ; // splits the string into words by one or more spaces
            String[] stringArray2 = passageForSplit.split(" ") ; // split on every single space
            String[] stringArray3 = passageForSplit.split("") ; // split on every char
            String[] stringArray4 = passageForSplit.split("a") ; // split on every a, and removes the 'a' from the result

            // .trim() : remove leading and ending space :
            String testTrim = "   Hello World   " ;
            String afterTrim = testTrim.trim() ; // "Hello World" 

            // string to int 
            String str = "123" ;
            int num = Integer.parseInt(str) ; // using Integer.parseInt() (most common)
            int num2 = Integer.valueOf(str) ; // Using Integer.valueOf() (returns an Integer object)

            // int to string
            num = 123 ;
            str = String.valueOf(num) ; // Using String.valueOf()
            str = Integer.toString(num) ; // Using Integer.toString()
            str = num + "" ; // Using String Concatenation (+ "")
      }
}