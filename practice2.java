import java.io.* ;
import java.util.Scanner;

class ThreeSums
{

  public static void main ( String[] args ) 
  {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
    // declare and initialize three sums
    double allSum = 0.0;
    double oddSum = 0.0;
    double evenSum = 0.0;    
    
    // compute the sums
    for ( int index=0; index < data.length; index++)
    {
      allSum = allSum + data[index];
      if ((index + 1) % 2 == 0) {
        evenSum = evenSum + data[index];
      } else if ((index + 1) % 2 == 1) {
        oddSum = oddSum + data[index];
      }
    }
      
    // write out the three sums
    System.out.println("Sum:" + allSum + " Even Sum:" + evenSum + " Odd Sum:" + oddSum);

  }
}      

class NearlyZero
{

  public static void main ( String[] args )
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    // declare and initialize variables
    double closestZero = data[0];
    
    // find the element nearest to zero
    for (int index = 0; index < data.length-1; index++)
    {
      if (Math.abs(data[index]) < closestZero) {
        closestZero = data[index];
      }
    }
      
    // write out the element nearest to zero
    System.out.println(closestZero);

  }
}   

class Panagram {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a String: ");
    String str = input.nextLine();
    str = str.replaceAll("\\s+","");
    str = str.replaceAll("[.]", "");
    str = str.replaceAll("[,]", "");
    str = str.toLowerCase();
    int[] howMany = new int[26];
    for(char c : str.toCharArray()) {
     int index = (int)c - 97;
     howMany[index] = howMany[index] + 1;
    }
    boolean allLetters = true;
    for (int value : howMany) {
      if (value == 0) {
        allLetters = false;
      }
    }
    if (allLetters) {
      System.out.println("Panagram");
    } else {
      System.out.println("Not a Panagram");
    }
  }

}