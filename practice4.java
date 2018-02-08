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
    
    int max = data[0].length;

    for (int i=0; i < data.length; i++) {
      if (data[i].length > max) {max = data[i].length;}
    }

    int[] ColSums = new int[max];

    for ( int row=0; row < data.length; row++)
    {
      for ( int col=0; col < data[row].length; col++) 
      {
        ColSums[col] += data[row][col];
      }
    }

    for (int i=0; i < ColSums.length; i++) {
      System.out.println("Sum for the column: " + ColSums[i]);
    }

  }
      
}

class ReverseRow
{
  static int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, 8},
                     {-1, -2, -3, 4, 5, 45  }, 
                     {56},
                     {0, 1, 2, 3, 4, 5, 6, 7} };                    

  private static void printArray()
  {
    for ( int row=0; row < data.length; row++)
    {
      for ( int col=0; col < data[row].length-1; col++) 
         System.out.print( data[row][col] + ", " );
      System.out.println( data[row][data[row].length-1] ); 
    }
  }
  
  public static void main ( String[] args ) 
  { 
    // print out the initial array
    printArray();
    System.out.println();

    for(int row = 0; row < data.length; row++){
      for(int col = 0; col < data[row].length / 2; col++) {
        int temp = data[row][col];
        data[row][col] = data[row][data[row].length - col - 1];
        data[row][data[row].length - col - 1] = temp;
        }
    }

    // print out the reversed array
    printArray();
  }
}  

