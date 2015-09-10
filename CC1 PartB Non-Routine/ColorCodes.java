//Adrian Osorio, AP Computer Science, 9/9/15, CC1 Non-Routine Part B, 310-227-5883, adrianosorio101@gmail.com

import java.util.Scanner; //importing Scanner class to retrieve values from console

public class ColorCodes {
    
  //declaring a new instance of the scanner class
  
  static Scanner rgb_one = new Scanner(System.in); 
    
  public static void main(String[] args) {
    
    //Prompting user for data from and converting the input into an integer
    
    System.out.print("Enter the RGB number from 0-255 for the degree of red: ");
    int rgb_red = rgb_one.nextInt();
    
    System.out.print("Enter the RGB number from 0-255 for the degree of green: ");
    int rgb_green = rgb_one.nextInt();
    
    System.out.print("Enter the RGB number from 0-255 for the degree of blue: ");
    int rgb_blue = rgb_one.nextInt();
    
    //this is the value the input cannot exceed
    
    int cantExceed = 16777215; 
    
    //if any one of the inputs exceeds the cantExceed variable then it will not run the code
    
    if(rgb_red <= cantExceed && rgb_green <= cantExceed && rgb_blue <= cantExceed) {
    
    //will take the values from the input and modulus them by 255 and return the values as ints between 0-255
    
      rgb_red %= 255;
      rgb_green %= 255;
      rgb_blue %= 255;
    
    //this prints out the input that is converted into a range of 0-255 into rgb style
    
      System.out.println("\nHere is your color in RGB: rgb("+ rgb_red + ", " + rgb_green + ", " + rgb_blue +")");
    
    //this converts the input from decimal to hex using a predefined method
    
      String rgbRedHex = Integer.toHexString(rgb_red);
      String rgbGreenHex = Integer.toHexString(rgb_green);
      String rgbBlueHex = Integer.toHexString(rgb_blue);
   
   //this prints out the hex into Hex format
   
      System.out.println("\nHere is your color in Hex: #"+rgbRedHex+""+rgbGreenHex+""+rgbBlueHex);
      
   //Mix the values of the RGB from the input
      
      
    }else{
      //this is a message that the user input exceded the cantExceed variable
        
      System.out.println("The input you place exceeds the possible value you can place for this program!"); 
      
    }
  }
}
