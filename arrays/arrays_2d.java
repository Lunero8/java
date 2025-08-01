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
      }
}