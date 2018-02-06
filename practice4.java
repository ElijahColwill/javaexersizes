// http://programmedlessons.org/Java9/ Ch. 67 Ex. 1, 2, 3, 6

import java.io.* ;

class ArraySum
{

  public static void main ( String[] args )  
  {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };
    
    // declare the sum
    int sum = 0;
    
    // compute the sum
    for ( int row=0; row < data.length; row++)
    {
      for ( int col=0; col < data[row].length; col++) 
      {
        sum = sum + data[row][col];
      }
    }
      
    // write out the sum
    System.out.println(sum);

  }
}      

class RowSums
{

  public static void main ( String[] args ) 
  {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };
    
    // declare the sum
    int sum = 0;
    
    // compute the sums for each row
    for ( int row=0; row < data.length; row++)
    {
      // initialize the sum
      sum = 0;
      
      // compute the sum for this row
      for ( int col=0; col < data[row].length; col++) 
      {
         sum = sum + data[row][col];
      }
      
      // write the sum for this row
      System.out.println("Sum for this row: " + sum);
    }
      
  }
}    

class ColSums
{

  public static void main ( String[] args ) 
  {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };
    
    int rows = 0;

    for (int i=0; i < data.length; i++) {
    	rows++;
    }

    int[] ColSums = new int[rows];  

    for ( int row=0; row < ColSums.length; row++)
    {
      // initialize the sum
      ColSums[row] = 0;
      
      // compute the sum for this row
      for ( int col=0; col < data.length; col++) 
      {
         ColSums[row] = ColSums[row] + data[col][row];
      }
      
      // write the sum for this row
      System.out.println("Sum for this Column: " + ColSums[row]);
    }
      
  }
}    
