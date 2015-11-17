/*Adrian Osorio AP Computer Science 11/10/15 Assignment #2 310-227-5883 https://sites.google.com/a/esusdstudents.org/adrianosorio101/ adrianosorio101@gmail.com
  The Program did provide a strong challenge for me since I attempted at first to find a method that would not cause me to be repetitive which 
  proved to be my downfall since most of those methods used items sucvh as arrays and switches which we were not allowed to use. I learned that I can use 
  multiple scanner statements and from those statements use the method has next to check if there was input placed but this tends to be tricky when
  dealing with multiple inputs. I also learned that trying the simplest methods first and then trying to  make them more compressed is the best way to 
  approach most of the problems, I would've needed help with interpreting the errors i recieve since occassioanlly i wondered why certain errors would
  come up. This I think took me a couple of hours over a couple of days to figure out how to create the best approach.The best part of the Assignment
  was accompliching it and having it work at its highest potential. If i were to change it then i would have made it so that students would have used a for loop to 
  accomplish this challenge. 
*/

import java.util.Scanner;

public class Damage_Calculation {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a attack statement");
        String fullLengthString = in.nextLine();//takes in the phrase in one line
        in.close();
        //Type 2 level 5 Attack 80 Defense 60 Base 20 STAB 1 Critical 2.0 Random 0.9
        //Input string shall be parsed
        String[] dataString = fullLengthString.split(" "); //s[plits the content into strings
        if(dataString[0].equalsIgnoreCase("type")) {//this checks in ifthe key phrases typed are spelled correctly
          if(dataString[2].equalsIgnoreCase("level")) {
            if(dataString[4].equalsIgnoreCase("attack")) {
              if(dataString[6].equalsIgnoreCase("defense")) {
                if(dataString[8].equalsIgnoreCase("base")) {
                  if(dataString[10].equalsIgnoreCase("stab")) {
                    if(dataString[12].equalsIgnoreCase("critical")) {
                      if(dataString[14].equalsIgnoreCase("random")) {
                         double typeValue = Double.parseDouble(dataString[1]);
                         double levelValue = Double.parseDouble(dataString[3]);
                         double attackValue = Double.parseDouble(dataString[5]);
                         double defenseValue = Double.parseDouble(dataString[7]);
                         double baseValue = Double.parseDouble(dataString[9]);
                         double stabValue = Double.parseDouble(dataString[11]);
                         double criticalValue = Double.parseDouble(dataString[13]);
                         double randomValue = Double.parseDouble(dataString[15]);
                         boolean check = false;
                         if(typeValue > 0 && typeValue <=4) {//these next few if statements check the values to ensure thay fit within the parameters that they must fit in
                         
                             if(levelValue >= 0 && levelValue <=99) {
                               if(attackValue > 0) {
                                  if(defenseValue > 0) {
                                    if( baseValue > 0) {
                                      if(stabValue == 1 || stabValue == 1.5) {
                                        if(criticalValue == 1 || criticalValue == 2) {
                                          if(randomValue >= 0.85 && randomValue <= 1) {
                                             check = true;
                                             double modifier = stabValue * typeValue * criticalValue * 1 * randomValue;//this completes the modifier calculation
                                             double dAD = attackValue/defenseValue;//this completes the attack and defense division
                                             double p1 = (2 * levelValue + 10)/250;//this completes the 1st part of the formula for the calculation
                                             double damage = ((p1 * dAD * baseValue) + 2) * modifier; //then I combine the previous few variables into the original formula to get the damage calculation 
                                             System.out.println("Damage is " + damage);
                                          } else {
                                            System.out.println("Expected a value between 0.85 and 1");//these will report out in the console if something did not fit into the acceptable range
                                          }
                                        } else {
                                           System.out.println("Expected a value of 1 or 2 ");
                                         }
                                      } else {
                                        System.out.println("Expected a value such as 1 or 1.5");
                                      }
                                    } else {
                                      System.out.println("Expected a value greater than 0");
                                    } 
                                  } else {
                                   System.out.println("Expected a value Greater 0");
                                  }
                               } else {
                                   System.out.println("Expected a value greater than 0");
                               } 
                             } else {
                                 System.out.println("Expected a value between 0 and 99");
                             }
                         } else{
                             System.out.println("Expected a value between 0 and 4");
                         }
                         
                      }else{
                        System.out.println("Missing Random"); //These comments will check of the specific string is missing and print it out to the concole
                      }
                    }else{
                      System.out.println("Missing Critical");
                    }
                  }else{
                    System.out.println("Missing STAB");
                  }
                }else{
                  System.out.println("Missing Type");
                }
              }else{
                System.out.println("Missing Defense");
              }
            }else{
              System.out.println("Missing Attack");
            }
          }else{
              System.out.println("Missing Level");
          }   
        }else{
            System.out.println("Missing Type");
        }
       
        
     }//Your out of Main
     
    
}
