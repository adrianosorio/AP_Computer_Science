//Adrian Osorio, AP Computer Science, 9/9/15, CC1 Non-Routine Part B, 310-227-5883, adrianosorio101@gmail.com
/*
 Reflection:
    
    From the practice done in class I was able to get used to printing strings in the console along with using special characters with the backslash which helped in creating this program. The only aspect of this program that was hard was having to design the character from ascii characters. From this I was able to learn about compiling and running my program from my local terminal. I did not really need any help going through the assignment however it took me around 40 minutes to complete. The most enjoyable part of  this was designing the ascii character since it required me to think about how I was going to represent the character and what  characters woulod be best to complete this challenge. I would redesign this assignment by having students include some use of the special characters that are in java in order to give them more exposure. 
   
*/

public class GameTitle {
  public static void main(String[] args) {
    
    //These are the characters that will  be used to draw my Game character. These will form portions of the body that repeat. 
    String layerFour = "      [.........      .............      ..]";
    String layerFive = "      [.....             .......            ";
    String layerEight = "      [.......................................]";
    String layerTwelve = "      [.....   .........      ........   .....]"; 
    String layerThirteen = "      [...       .......      ......       ...]";
    String layerFourteen = "      [..          .....      ....          ..]";
    
//This is the main part of the method that will print the whole character together and it is broken up into layers of two lines
     System.out.println("                __________________");
     System.out.println("               [..................]");//layer 1
     System.out.println("            ___[..................]___");
     System.out.println("           [..........................]");//layer 2
     System.out.println("         __[..........................]__");
     System.out.println("        [................................]");//layer 3
     System.out.println("       _[................................]_");
     System.out.println(layerFour);// Layer 4
     System.out.println(layerFour);
     System.out.println(layerFive);// layer 5
     System.out.println(layerFive);
     System.out.println("      [.....     #####   .......     ###### ");// layer 6
     System.out.println("      [.....     #####   .......     ###### __");
     System.out.println("      [.......   #####.............  ###### ..]");// layer 7
     System.out.println("      [.......        .............       ....]");
     System.out.println(layerEight);// layer 8
     System.out.println(layerEight);
     System.out.println(layerEight);// layer 9
     System.out.println(layerEight);
     System.out.println(layerEight);// layer 10
     System.out.println(layerEight);
     System.out.println(layerEight);// layer 11
     System.out.println(layerTwelve);
     System.out.println(layerTwelve);// Layer 12
     System.out.println(layerThirteen);
     System.out.println(layerThirteen);// Layer 13
     System.out.println(layerFourteen);
     System.out.println(layerFourteen);// Layer 14
      System.out.println("      ---          -----      ----          ---");
   
      
      
  }
   
}
