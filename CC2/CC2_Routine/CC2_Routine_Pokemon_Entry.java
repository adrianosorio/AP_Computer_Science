import java.util.Scanner;

public class CC2_Routine_Pokemon_Entry {
  public static void main(String[] args) {
     Scanner prompt = new Scanner(System.in);
     System.out.println("Whats Your Name");
     String trainerName = prompt.next();
     System.out.println("You can choose four Pokemon. Either Pikachu, Charmander, Squirtle, or Bulbasaur");
     String trainerPokemon = prompt.next();
     System.out.println("Select what level your Pokemon will be ");
     int pokemonLevel = prompt.nextInt();
     if(Check.Check_Input(trainerName, trainerPokemon, pokemonLevel) == true) {
         Pokemon_Trainer.createTrainer(trainerName, trainerPokemon, pokemonLevel);
     }
     
     
  }
  

}
class Pokemon_Trainer {
    
  public static void createTrainer(String name, String pokemon, int level) {
      String Trainer = name;
      String Pokemon = pokemon;
      int Level = level;
      System.out.println("Added level " + Level + " " + Pokemon + " for " + name);
  }
    
}

class Check{
    
  public static boolean Check_Input(String name, String Pokemon, int level) {
     //var
     int p = 0;
     int n = 0;
     int x = 0;
     //checks the name for if its empty
     if (name == "") {
          n = 0;
         
     } else {
          n = 1; 
     }
     
     //checks the input placed
     switch (Pokemon) {
         case "Pikachu": p = 1;
                         break;
         case "Charmander": 
                          p = 1;
                         
                         break;
         case "Squirtle":  p = 1;
                         
                         break;
         case "Bulbasaur":  p = 1;
                         
                         break;
         default: p = 0;
                  System.out.print(" Invalid Pokemon ");
                  break;
     }
     //int level_int = Integer.parseInt(level);
     
     if(level <= 15) {
          x = 1;
          System.out.println("Success");
         
     } else {
          x = 0;
         System.out.print(" Invalid Level ");
         
     }
     //checks all output and compares
     if(p == 1 && n == 1 && x == 1){
       System.out.println(" You passed the Check ");
       return true;         
     }else{
       System.out.println("You Failed the Check");
       return false;
     }
     
  }
    
}