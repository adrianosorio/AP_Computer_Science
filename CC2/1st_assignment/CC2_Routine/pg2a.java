/*Adrian Osorio AP Computer Science 10/21/15 Assignment #2 310-227-5883 https://sites.google.com/a/esusdstudents.org/adrianosorio101/ adrianosorio101@gmail.com

The only challenge when designing the program was being able to figure out a way to seperate the string into seperate portions of data from one input. This portion of the program was most difficult since 
it required expeerimentation since I did not know what this was exactly called so I could not use google however after experimenting and researching the difference between .next and ,nextline methods
I was able to deduce that .next and then using a .nextint would provide the best way to allow the user to input their input. I was able to learn that you are able to create different lines for the scanner input statements
which helped me achieve my main challenge. I did not require any help for any part and was able to solve most of my problems by researching the different issues on google and with what I knew and this took me around 2 hours to complete in total including refinement.java
The best part of the assignment was using the methods in order to not have to repeat my code and also learning how to include multiple inputs in one line. If I could redesign this challenge I would make it so 
that you would have to use a specific amount of methods along with a class so that students can practice making objects out of the pokemon trainers.

*/

import java.util.Scanner;

public class pg2a {
  public static void main(String[] args) {
     Scanner prompt = new Scanner(System.in);
     System.out.println("Whats Your Name");
     String trainerName = prompt.next();
     System.out.println("You can choose four Pokemon. Either Pikachu, Charmander, Squirtle, or Bulbasaur and also the level of the pokemon from 1-15");
     String trainerPokemon_1 = prompt.next();
     int pokemonLevel = prompt.nextInt();
     String trainerPokemon = trainerPokemon_1.toLowerCase();
     
     if(Check_Input(trainerName, trainerPokemon, pokemonLevel) == true) {//uses output from check to see if logically applicable
         createTrainer(trainerName, trainerPokemon, pokemonLevel);
     }
     
     
  }
  //method helps create a pokemon trainer object which can be referenced for individual trainers
     public static void createTrainer(String name, String pokemon, int level) {
       String Trainer = name;
       String Pokemon = pokemon;
       int Level = level;
       System.out.println("Added level " + Level + " " + Pokemon + " for " + name);
     }
     
     //
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
     
     if(level <= 15 && level >= 1) {
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
