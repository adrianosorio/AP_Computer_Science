import java.util.Scanner;


public class Damage_Calculation{
    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Please input a type, level, attack, defense, base, stab of 1, critical, and random");
      //EX Input Type 2 level 5 Attack 80 Defense 60 Base 20 STAB 1 Critical 2.0 Random 0.9
      //THis stores all the variables into seperate variables
      String myType = in.next();
      Double myTypeValue = in.nextDouble();
      String myLevel = in.next();
      Double myLevelValue = in.nextDouble();
      String myAttack = in.next();
      Double myAttackValue = in.nextDouble();
      String myDefense = in.next();
      Double myDefenseValue = in.nextDouble();
      String myBase = in.next();
      Double myBaseValue = in.nextDouble();
      String myStab = in.next();
      Double myStabValue = in.nextDouble();
      String myCritical = in.next();
      Double myCriticalValue = in.nextDouble();
      
      //This codenses all the variables into arrays to allow for easier access and use
      String[] attackStrValues = {myType, myLevel, myAttack, myDefense, myBase, myStab, myCritical};
      Double[] attackIntValues = {myTypeValue, myLevelValue, myAttackValue, myDefenseValue, myBaseValue, myStabValue, myCriticalValue};
      
      for(int x = 0; x <= (attackStrValues.length - 1); x++) {
          if (attackStrValues.length == 7) {
            System.out.println(Check_Strings(attackStrValues[x]));
          } else {
              System.out.println("Expected your mom");//append output in array and from that you can find position of what was expected
          }
      }
    }
    //this method will check the input of the user to ensure it functions properly
    public static int Check_Strings(String inputString) {
        String input = inputString.toLowerCase();
        int p = 0;
        switch(input){
            case "type": p = 1;
                         break;
            case "level": p = 1;
                          break;
            case "attack": p = 1;
                          break;
            case "defense": p = 1;
                           break;
            case "base": p = 1;
                        break;
            case "stab": p = 1;
                        break;
            case "critical": p = 1;
                            break;
            case "random": p = 1;
                            break;
            default: p = 0;
                System.out.println("You are missing " + inputString);
                break;
        }
        return p;
    }
    
}