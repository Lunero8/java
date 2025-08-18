/**
 *    author:  Lunero
 *    created: 01.08.2025 22:53:20
**/
import java.util.* ;

public class arrays_2d {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            // 2d array declaration
            int[][] number = new int [3][5] ;
            int numbers[][] = {{1, 2, 3, 4, 5}, {1, 2, 3, 4}, {1, 2, 3, 4, 5}} ;
            
            // input from user
            for (int i = 0 ; i < numbers.length ; i++)
                  for (int j = 0 ; j < numbers[i].length ; j++)
                        number[i][j] = sc.nextInt() ;

            // printing using Array.toString() and Arrays.deepToString() 
            int[][] a = {{2,3,4}, {5, 6, 7}} ;
            
            System.out.println (Arrays.toString (a[0])) ;
            System.out.println (Arrays.deepToString (a)) ;

            // jagged array : In Java, a jagged array is a 2D array where each row can have a different number of columns.

            int[][] jagged = new int[3][];  // 3 rows, but columns not set yet

            jagged[0] = new int[2];  // first row has length 2
            jagged[1] = new int[4];  // second row has length 4
            jagged[2] = new int[3];  // third row has length 3

            // Declare jagged array with 3 rows
            int[][] jagged2 = new int[3][];

            // Initialize each row with different size
            jagged2[0] = new int[] {1, 2};
            jagged2[1] = new int[] {3, 4, 5, 6};
            jagged2[2] = new int[] {7, 8, 9};

            // for each loop
            for (int[] n : numbers) 
                  for (int m : n) 
                        System.out.print (m + " ") ;
      }
}