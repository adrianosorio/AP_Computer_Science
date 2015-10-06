import java.util.Scanner;
import java.text.*;


public class Main {
    
  //declaring a new instance of the scanner class
  static Scanner colorInput = new Scanner(System.in); 
  
  
  public static void main(String[] args) {
 
    //Prompting user for data from and converting the input into an integer
    System.out.println("Enter The First Color ");
    System.out.print("Enter the RGB number from 0-16777215 for the degree of red: ");
    int rgb_format_1 = colorInput.nextInt();
    
    System.out.println("Enter The Second Color ");
    System.out.print("Enter the RGB number from 0-16777215 for the degree of red: ");
    int rgb_format_2 = colorInput.nextInt();
    
    System.out.println("Enter The Third Color ");
    System.out.print("Enter the RGB number from 0-16777215 for the degree of red: ");
    int rgb_format_3 = colorInput.nextInt();
    
    
    //Calling method formater to convert input into rgb_format and hexadecimal format 
    formater(rgb_format_1);
    formater(rgb_format_2);
    formater(rgb_format_3);
  }
 
  
  public static void formater(int decimalInput) {

   //if any one of the inputs exceeds the cantExceed variable then it will not run the code
    
    if(decimalInput <= 16777215) {
    //Converts input that is less than or equal to 16777215 to rgb by implementing modulus and division
      int rgb_blue = decimalInput % 256;
      int rgb_green = (decimalInput / 256) % 256;
      int rgb_red = decimalInput / 65536;
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
        
      System.out.println("The input you placed exceeds the possible value you can place for this program!");
      
    }
  
  }
}
