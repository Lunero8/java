import java.util.Scanner ; // used for taking input

public class basic {
      public static void main (String[] args) {
            // Input
            Scanner sc = new Scanner(System.in) ; 
                                    // size in byte 
            byte a = sc.nextByte() ; // 1 (-128 to 127)
            short a = sc.nextShort() ; // 2
            int a = sc.nextInt() ;    // 4 
            long a = sc.nextLong() ;  // 8 (declare : long a = 12345678900L ;)

            float a = sc.nextFloat() ; // 4 (7 significant digit, ex- 3.123456) (declare : float pi = 3.14F ;)
            double a = sc.nextDouble() ; // 8 (15 significant digit ex - 3.123456789012345)

            char a = sc.next().charAt(0) ; // 2 (input - sayem, a = s)
            char a = sc.next().charAt(1) ; //   (input - sayem, a = a)
            String a = sc.next() ; // single word
            String a = sc.nextLine() ; // full sentence 

            boolean a = sc.nextBoolean() ; // 1

            // final keyword
            // using final before a datatype name, it's value can't be changed
            final double pi = 3.14 ;

            // MAX and MIN value of datatypes -
            // Datatypes_name.MIN_VALUE or Datatypes_name.MAX_VALUE, 
            // Datatypes first letter is Capital
            
            // Datatypes Size in Byte
            // In Java, you can use the 
            // Byte.BYTES, Short.BYTES, 
            // Integer.BYTES, Long.BYTES, 
            // Float.BYTES, and Double.BYTES 
            // constants to get the byte size 
            // of primitive data types. 
            // For char, you can use Character.BYTES, 
            // and for boolean, 
            // Java does not define a fixed byte size.

            // integer to binary - Integer.toBinaryString(a) ;
            // System.out.println (Integer.toBinaryString(9)) ;

            // Output 
            System.out.print ("Hello ") ; 
            System.out.println ("World") ; // execute with nextline
      }
}