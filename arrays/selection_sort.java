/**
 *    author:  Lunero
 *    created: 03.08.2025 20:31:07
**/

/**
 * 🟩 What is Selection Sort?
      Selection Sort is a sorting method where we find the smallest number in the list and put it at the front.
      We repeat this process for the remaining list until everything is sorted.
 */

/**
 * 🟨 How Selection Sort Works (Step-by-Step):

      1. Start from the first number.

      2. Look at the rest of the list to find the smallest number.

      3. Swap that smallest number with the first number.

      4. Now move to the second number, and do the same:
            - Find the smallest number in the rest of the list.
            - Swap it with the second number.

      5. Keep repeating this until the list is sorted.
 */

/**
 * 🕒 Time Needed:
      Best case: O(n²)
      Average case: O(n²)
      Worst case: O(n²)
      ✅ (But fewer swaps than Bubble Sort)
 */

/**
 * 💾 Space Used:
      O(1) → no extra space needed
 */

import java.util.* ;

public class selection_sort {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            int[] arr = {4, 1, 6, 3, 6, 3, 4} ;

            for (int i = 0 ; i < arr.length - 1 ; i++)
            {
                  int minIndex = i ;

                  for (int j = i + 1 ; j < arr.length ; j++)
                  {
                        if (arr[j] < arr[minIndex])
                              minIndex = j ;
                  }

                  int t = arr[i] ;
                  arr[i] = arr[minIndex] ;
                  arr[minIndex] = t ;
            }

            for (int i = 0 ; i < arr.length ; i++)
                  System.out.print (arr[i] + " ") ;
      }
}