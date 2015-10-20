import java.util.Scanner;

public class CC2_Routine_Pokemon_Entry {
  public static void main(String[] args) {
     Scanner prompt = new Scanner(System.in);
     System.out.println("Whats Your Name");
     String trainerName = prompt.next();
     System.out.println("You can choose four Pokemon. Either Pikachu, Charmander, Squirtle, or Bulbasaur and also the level of the pokemon from 1-15");
     String trainerPokemon_1 = prompt.next();
     int pokemonLevel = prompt.nextInt();
     String trainerPokemon = trainerPokemon_1.toLowerCase();
     
     if(Check.Check_Input(trainerName, trainerPokemon, pokemonLevel) == true) {//uses output from check to see if logically applicable
         Pokemon_Trainer.createTrainer(trainerName, trainerPokemon, pokemonLevel);
     }
     
     
  }
  

}
class Pokemon_Trainer {//class helps create a pokemon trainer object which can be referenced for individual trainers
    
  public static void createTrainer(String name, String pokemon, int level) {
      String Trainer = name;
      String Pokemon = pokemon;
      int Level = level;
      System.out.println("Added level " + Level + " " + Pokemon + " for " + name);
  }
    
}

class Check{
    
  public static boolean Check_Input(String name, String Pokemon, int level) {
     //vars help determine how much has been run
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
         case "pikachu": p = 1;
                         break;
         case "charmander": 
                          p = 1;
                         
                         break;
         case "squirtle":  p = 1;
                         
                         break;
         case "bulbasaur":  p = 1;
                         
                         break;
         default: p = 0;
                  System.out.print(" Invalid Pokemon ");
                  break;
     }
     //int level_int = Integer.parseInt(level);
     
     if(level <= 15) {
          x = 1;
          //System.out.println("Success");
         
     } else {
          x = 0;
         System.out.print(" Invalid Level ");
         
     }
     //checks all output and compares to ensure that the user inputs are all correct
     if(p == 1 && n == 1 && x == 1){
       //System.out.println(" You passed the Check ");
       return true;         
     }else{
       //System.out.println("You Failed the Check");
       return false;
     }
     
  }
    
}