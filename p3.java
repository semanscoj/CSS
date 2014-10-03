import java.util.*;
import javax.swing.*; 

public class p3 {
  
  public static void main (String[] arg) {
    
    int diameter, height;
    double radius;
    double circumference, areaOfCircle, cylVolume;
    String name;
    
    //output string after calculations
    String results;
    
    //PI
    final double PI = 3.1415926;
    
    //Get name and greet user.
    name = JOptionPane.showInputDialog("Enter your name and select OK.");
    JOptionPane.showMessageDialog(null,
                                  "Hello, "+name+". You have two more values to provide.", "Greetings!",
                                  JOptionPane.INFORMATION_MESSAGE);
    
    //Get dimensions from user.
    diameter = Integer.parseInt(JOptionPane.showInputDialog("Enter the integer diameter of a cylinder."));
    height = Integer.parseInt(JOptionPane.showInputDialog("Enter the integer height of the cylinder."));
    
    //Calculations on input variables
    radius = (double)diameter/2;
    circumference = (double)PI * diameter;
    areaOfCircle = PI * Math.pow(radius, 2);
    cylVolume = areaOfCircle * height;
    
    //Format output String
    results = "The radius is " + radius + "\n" + 
      "The diameter is " + diameter + "\n" +
      "The height is " + height + "\n" + 
      "The circumference is " + circumference + "\n" +
      "The area of the base is " + areaOfCircle + "\n" +
      "The volume of the cylinder is " + cylVolume;
    
    //Display results to users.
    JOptionPane.showMessageDialog(null,
                                  results, "Results",
                                  JOptionPane.INFORMATION_MESSAGE);
    
  } // end of main method
} // end of class.

