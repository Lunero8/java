/**
 *    author:  Lunero
 *    created: 13.08.2025 01:50:28
**/
            /*
                 Array ADT
                 ---------
                  Insert
                  Delete
                  Search
                  Update
                  Traverse
            */

public class arrayADT {

      // array: to store data
      private int[] array ;

      // size: size of array
      private int index ;

      // capacity: capacity of array
      private int size ;

      // Constructor
      public arrayADT (int size) {
            this.size = size ;
            this.array = new int[this.size] ;
            this.index = 0 ;
      }

      // insert
      public void insert (int value)
      {
            // check if array is full
            if (index == this.size)
            {
                  System.out.println ("Array is full") ;
                  return ;
            }

            array[index++] = value ;
      }

      // delete
      public void delete (int deleteIndex)
      {
            if (deleteIndex >= index || deleteIndex < 0) 
            {
                  System.out.println ("Invalid index") ;
                  return ;
            }

            for (int i = deleteIndex ; i < index - 1 ; i++)
                  array[i] = array[i+1] ;

            --index ;
      }

      // search
      public int search (int value) 
      {
            for (int i = 0 ; i < index ; i++)
                  if (array[i] == value)
                        return i ;
            
            return -1 ;
      }

      // get the data
      public int get (int getIndex)
      {
            if (getIndex < 0 || getIndex >= this.index)
            {
                  System.out.println ("Index invalid") ;
                  return -1;
            }

            return array[getIndex] ;
      }

      // traverse
      public void traverse () 
      {
            for (int i = 0 ; i < this.index ; i++)
                  System.out.print (array[i] + "\t") ;
            
            System.out.println () ;
      }

      // update
      public void update (int updateIndex, int value)
      {
            if (updateIndex < 0 || updateIndex >= this.index)
            {
                  System.out.println ("Invalid index") ;
                  return ;
            }

            array[updateIndex] = value ;
      }

      // get the size 
      public int getSize ()
      {
            return this.index ;
      }
}