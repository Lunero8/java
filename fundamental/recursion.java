import java.util.* ;

public class recursion {
      public static void main (String[] args) {
            // factorial
            System.out.println (factorial(5)) ; 
            
            // power
            System.out.println (power(2,8)) ;

            // counting number (n, n-1, n-2, ..., 1)
            counting (10) ;
            System.out.println () ;

            // counting reverse (1, 2, 3, ..., n)
            countingreverse (10) ;
            System.out.println () ;

            // fibonacci
            System.out.println (fibonacci(10)) ;

            // check sorted array
            int[] n = {1,2,3,4,5} ;
            boolean ok = issorted (n, 0) ;
            if (ok == true)
                  System.out.println ("True") ;
            else
                  System.out.println ("False") ;

            // sum of arrays
            System.out.println (arraysSum (n, 0)) ;

            // search from an array
            System.out.println ("Index = " + searchFromAnArray (n, 0, 3)) ;

            // binary search
            System.out.println ("Index = " + binarySearch (n, 0, 4, 3)) ;
      }



      // factorial
      public static int factorial (int n) {
            if (n == 0)
                  return 1 ;
            
            return n * factorial (n - 1) ;
      }

      // power of n 
      public static int power (int n, int v) {
            if (v == 0)
                  return 1 ;
            
            return n * power (n, v-1) ;
      }

      // counting number (n, n-1, n-2, ..., 1)
      public static void counting (int n) {
            if (n == 0)
                  return ;
            
            System.out.print (n + " ") ;

            counting (n-1) ;
      }

      // counting reverse (1, 2, 3, ..., n)
      public static void countingreverse (int n) {
            if (n == 0)
                  return ;
            
            countingreverse (n-1) ;

            System.out.print (n + " ") ;
      }

      // fibonacci
      public static int fibonacci (int n) {
            if (n == 0)
                  return 0 ;
            if (n == 1)
                  return 1 ;
            
            return fibonacci (n-1) + fibonacci (n-2) ;
      }

      // check sorted array
      public static boolean issorted (int[] n, int index) {
            if (index == n.length - 1 || n.length <= 1)
                  return true ;

            if (n[index] > n[index+1])
                  return false ;

            return issorted (n, index+1) ;
      }

      // sum of arrays
      public static int arraysSum (int[] n, int index) {
            if (index == n.length-1 )
                  return n[n.length-1] ;
            if (n.length < 1)
                  return 0 ;
            
            return n[index] + arraysSum (n, index+1) ;
      }

      // search from an array
      public static int searchFromAnArray (int[] n, int index, int s) {
            if (n[index] == s)
                  return index ;
            if (index == n.length - 1)
                  return -1 ;
            
            return searchFromAnArray (n, index+1, s) ;
      }

      // binary search
      public static int binarySearch (int[] arr, int l, int r, int k) {
            int mid = l + (r - l) / 2 ;

            if (k == arr[mid])
                  return mid ;
            
            if (l > r)
                  return -1 ;
            
            if (mid > k)
                  // r = mid - 1 ;
                  return binarySearch (arr, l, mid - 1, k) ;
            else
                  // l = mid + 1 ;
                  return binarySearch (arr, mid + 1, r, k) ;
            
            // return binarySearch (arr, l, r, k) ;
      }
}