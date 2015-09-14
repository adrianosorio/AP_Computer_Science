//Adrian Osorio, AP Computer Science, 9/9/15, CC1 Non-Routine Part B, 310-227-5883, adrianosorio101@gmail.com
/*

Reflection: 

For this particular assignment at the time I think that the Warm up assignments did not necessarily contributed to this program in many ways as i relied more on personal research of methods and the scanner class. The program was pretty challenging mainly because the I needed to research much of the material to be able to create it however it was enjoyable looking through forums and documentation. I learned about how I declare methods in java along with experience in using the scanner class to gain input from the user. I needed help with creating methods mainly because I did not know what the prefixes meant nor how to set up a scanner. It took me a total of two hours to complete over two days. The best part of the assignment wass trouble shooting errors since from that I was able to learn somethings I can't do in java along with understanding java syntax. If i had to redesign the assignment I would have it so that students would need to use one method in order to not have to repeat chunks of code.


*/

//importing Scanner class to retrieve values from console
import java.util.Scanner;

public class ColorCodes {
    
  //declaring a new instance of the scanner class
  static Scanner ColorInput = new Scanner(System.in); 
  public static void main(String[] args) {
 
    //Prompting user for data from and converting the input into an integer
    System.out.println("Enter The First Color ");
    System.out.print("Enter the RGB number from 0-255 for the degree of red: ");
    int rgb_red_1 = rgb_one.nextInt();
    System.out.print("Enter the RGB number from 0-255 for the degree of green: ");
    int rgb_green_1 = rgb_one.nextInt();
    System.out.print("Enter the RGB number from 0-255 for the degree of blue: ");
    int rgb_blue_1 = rgb_one.nextInt();
    
    System.out.println("Enter The Second Color ");
    System.out.print("Enter the RGB number from 0-255 for the degree of red: ");
    int rgb_red_2 = rgb_one.nextInt();
    System.out.print("Enter the RGB number from 0-255 for the degree of green: ");
    int rgb_green_2 = rgb_one.nextInt();
    System.out.print("Enter the RGB number from 0-255 for the degree of blue: ");
    int rgb_blue_2 = rgb_one.nextInt();
    
    System.out.println("Enter The Third Color ");
    System.out.print("Enter the RGB number from 0-255 for the degree of red: ");
    int rgb_red_3 = rgb_one.nextInt();
    System.out.print("Enter the RGB number from 0-255 for the degree of green: ");
    int rgb_green_3 = rgb_one.nextInt();
    System.out.print("Enter the RGB number from 0-255 for the degree of blue: ");
    int rgb_blue_3 = rgb_one.nextInt();
    
    //Calling method formater to convert input into rgb_format and hexadecimal format 
    formater(rgb_red_1, rgb_green_1, rgb_blue_1);
    formater(rgb_red_2, rgb_green_2, rgb_blue_2);
    formater(rgb_red_3, rgb_green_3, rgb_blue_3);
    formater(rgb_red_1, rgb_green_2, rgb_blue_3);//mixing from the various inputs 
    
  }
  public static void formater(int rgb_red, int rgb_green, int rgb_blue) {

   //if any one of the inputs exceeds the cantExceed variable then it will not run the code
    
    if(rgb_red <= 255 && rgb_green <= 255 && rgb_blue <= 255) {
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
        
      System.out.println("The input you placed exceeds the possible value you can place for this program! " + rgb_red + " " + rgb_green + " " + rgb_blue); 
      
    }
  
  }
}
