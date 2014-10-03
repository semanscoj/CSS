import java.util.*;
import javax.swing.*; 

public class p4 {
  
  public static void main (String[] arg) {
    
    //given  
    int x, lowerBound, upperBound;
    Scanner scanner = new Scanner(System.in);
    
    //get lower and upper bound from user
    System.out.print("Please enter a lower bound: ");
    lowerBound = scanner.nextInt();
    System.out.print("Please enter a upper bound: ");
    upperBound = scanner.nextInt();
    
    //initialize output string.
    System.out.printf("Your lower bound is: %d\nYour upper bound is: %d\n", lowerBound,upperBound);
    
    //check if lowerbound is less then upperbound
    if(lowerBound <= upperBound){
      
      //if true iterate from lower to upper.
      for(int i = lowerBound; i <= upperBound; ++i){
        System.out.printf("For the value %d the square is %,.2f and the square root is %,.2f\n", i , Math.pow(i,2), Math.sqrt(i));}
      
      //if false, change output string.
    }else{System.out.println("The lower bound is greater than the upper bound.\nNo work will be performed");}
       
  } // end of main method
} // end of class.

