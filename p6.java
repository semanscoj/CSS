import java.util.*;

public class p6 {
  
  //"count" variables
   public static int whitespace = 0, digit = 0, letter = 0, vowel = 0;
  
  public static void main (String[] arg) {
    
    Scanner scanner = new Scanner(System.in);
    String input;
     
    //prompt user.
     System.out.println("Enter a string for character classification: (EOF to end): ");
    
    while(scanner.hasNext()){
      
      //Get and process string, add to "count" variables.
      numCount(input = scanner.nextLine());
      
      //prompt in loop and display results
      System.out.println("Enter a string for character classification: (EOF to end): ");
      System.out.printf("inputLine is %d characters long and contains the following:\n %d whitespace characters.\n %d digits.\n %d letters.\n %d vowels.\n",
                        input.length(), whitespace, digit, letter, vowel);
      
      //reset variables
      whitespace = 0; digit = 0; letter= 0; vowel = 0;
    }
    //cleanup
    scanner.close();
  } // end of main method
  
  
  //iterate through string by char and count.
  public static void numCount(String s) {
    char test;
    for(int i = 0; i < s.length(); i++){
      
      test = s.charAt(i);
      
      if(Character.isWhitespace(test)){whitespace++;}
      else if(Character.isDigit(test)){digit++;}
      else if(Character.isLetter(test)){letter++;
        //nested if, vowel is only a vowel if also a letter.
        if(isVowel(test)){vowel++;}
      }
    }
  }
  
  //indexof returns the index if found in string, otherwise returns -1. -1 = false.
  public static boolean isVowel(char c) {
  return "AEIOUaeiou".indexOf(c) != -1;
}
  
  
} // end of class.