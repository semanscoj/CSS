import java.util.*; 

public class p5 {
  
  public static void main (String[] arg) {
    
    // number entered and the running total
    int inputNum, sum = 0;
    
    // count of valid and invalid numbers seen
    int numValid = 0, numInvalid = 0;
    
    //init scanner
    Scanner scanner = new Scanner(System.in);
    
    //loop
    System.out.print("Enter a positive value (EOF to quit): ");
    while(scanner.hasNext()){
      
      inputNum = scanner.nextInt();
      
      System.out.print("Enter a positive value (EOF to quit): ");
      
      if(inputNum >= 0){sum = sum + inputNum; numValid++;}
      else{numInvalid++; System.out.printf("The number %d is invalid.\nEnter a positive value (EOF to quit): ", inputNum);}
    }
    
    //output to use results
    System.out.printf("There were %d valid numbers entered.\nThe sum of the valid numbers was %d and the average was  %,.2f. \nThere were %d invalid numbers.", numValid, sum, (double)sum / numValid, numInvalid);

    scanner.close();
    
  } // end of main method
} // end of class.