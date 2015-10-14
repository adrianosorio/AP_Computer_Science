//Adrian Osorio, AP Computer Science, 9/9/15, CC1 Non-Routine Part B, 310-227-5883, adrianosorio101@gmail.com
/*

Reflection: 

For this particular assignment at the time I think that the Warm up assignments did not necessarily contributed to this program in many ways as i relied more on personal research of methods and the scanner class. The program was pretty challenging mainly because the I needed to research much of the material to be able to create it however it was enjoyable looking through forums and documentation. I learned about how I declare methods in java along with experience in using the scanner class to gain input from the user. I needed help with creating methods mainly because I did not know what the prefixes meant nor how to set up a scanner. It took me a total of two hours to complete over two days. The best part of the assignment wass trouble shooting errors since from that I was able to learn somethings I can't do in java along with understanding java syntax. If i had to redesign the assignment I would have it so that students would need to use one method in order to not have to repeat chunks of code.


*/

//importing Scanner class to retrieve values from console
import java.util.Scanner;
import java.lang.*;


public class ColorCodes {
    
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
    int red_Mix = formater(rgb_format_1, 0);
    int blue_Mix = formater(rgb_format_2, 1);
    int green_Mix = formater(rgb_format_3, 2);
    
    System.out.println("\nThis is the Mixed Color Combonation: rgb("+red_Mix+", " + blue_Mix + ", " + green_Mix + ")");
  }
 
  
  public static int formater(int decimalInput, int colorMixer) {

   //if any one of the inputs exceeds the cantExceed variable then it will not run the code
    
    if(decimalInput <= 16777215) {
    //Converts input that is less than or equal to 16777215 to rgb by implementing modulus and division
      int rgb_Blue = decimalInput % 256;
      int rgb_Green = (decimalInput / 256) % 256;
      int rgb_Red = decimalInput / 65536;
      System.out.println("\nHere is your color in RGB: rgb("+ rgb_Red + ", " + rgb_Green + ", " + rgb_Blue +")");
      int[] rgb_Values = {rgb_Red, rgb_Green, rgb_Blue};
     
   //this prints out the and converts decimal into Hex format
   
      String Hex_Output = String.format("%06X", decimalInput); 
      System.out.println("\nHere is your color in Hex: #" + Hex_Output);
      
      
   //Mix the values of the RGB from the input by returning a specific unit
   return rgb_Values[colorMixer];
      
    }else{
      //this is a message that the user input exceded the cantExceed variable
        
      System.out.println("The input you placed exceeds the possible value you can place for this program!");
      return 0;
      
    }
  
  }
}
