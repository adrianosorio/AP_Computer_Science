import java.util.Scanner;

public class Damage_Calculation{
    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Please input a type, level, attack, defense, base, stab of 1, critical, and random");
      String myAttack = in.nextLine();
      
      int len = myAttack.length();
      
      String[] myAttack_Array = myAttack.split("");


      System.out.println(len);
      for(int x  = 0; x <= len; x++) {
          System.out.println(myAttack_Array[x]);
      }
    }
    
    
}