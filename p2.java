import java.util.*;

public class p2 {
  
  public static void main (String[] arg) {
    
    Scanner scanner = new Scanner(System.in); 
    int diameter, height;
    double radius, circumference, areaOfCircle, cylVolume;
    String name, output;
    
   final double CONSTANT = 3.1415926;
    
   //get input and greet user.
    System.out.print("Enter your name: ");
    name = scanner.nextLine();
    System.out.print("Hello, " + name + ". You have two more answers to provide. \nEnter the integer diameter of a cylinder: ");
    diameter = scanner.nextInt();
    System.out.print("Enter the integer height of the cylinder: ");
    height = scanner.nextInt();
    
    //process input.
    radius = (double)diameter/2;
    circumference = (double)CONSTANT * diameter;
    areaOfCircle = CONSTANT * Math.pow(radius, 2);
    cylVolume = areaOfCircle * height;
    
    //prepare output string.
    output = "The radius is " + radius + 
      "\nThe diameter is " + diameter + 
      "\nThe height is " + height + 
      "\nThe circumference is " + circumference + 
      "\nThe area of the base is " + areaOfCircle + 
      "\nThe volume of the cylinder is " + cylVolume;
    
    //print to user.
    System.out.println(output);
    
  } // end of main method
} // end of class.

