/**
 *    author:  Lunero
 *    created: 03.08.2025 20:07:24
**/

/**
 * 🟩 What is Bubble Sort?
Bubble Sort is a way to sort a list by comparing two numbers at a time and swapping them if they are in the wrong order.
It keeps doing this until the whole list is sorted.
 */

/**
 * 🟨 How Bubble Sort Works (Step-by-Step):
 
 1. Start from the first number in the list.

 2. Compare it with the next number.

 3. If the first number is bigger, swap them.

 4. Move to the next pair, and do the same.

 5. After one full round, the biggest number goes to the end.

 6. Repeat the process for the rest of the list, ignoring the last sorted part.

 7. Keep doing this until the list is sorted.
 */

/**
 * 🕒 Time Needed:
      Best case (already sorted): O(n)
      Average case: O(n²)
      Worst case (reverse order): O(n²)
 */

/**
 * 💾 Space Used:
      O(1) → does not need extra space
 */
import java.util.* ;

public class bubble_sort {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            int[] arr = {2, 4, 2, 6, 3, 2} ;

            for (int i = 0 ; i < arr.length -1 ; i++)
            {
                  for (int j = 0 ; j < arr.length - 1 - i ; j++)
                  {
                        if (arr[j] > arr[j + 1])
                        {
                              int t = arr[j] ;
                              arr[j] = arr[j + 1] ;
                              arr[j + 1] = t ;
                        }
                  }
            }

            for (int i = 0 ; i < arr.length ; i++)
                  System.out.print (arr[i] + " ") ;
      }
}