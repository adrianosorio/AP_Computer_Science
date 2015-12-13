/*Adrian Osorio AP Computer Science 11/10/15 Assignment #2 310-227-5883 https://sites.google.com/a/esusdstudents.org/adrianosorio101/ adrianosorio101@gmail.com
The warm-up and practice leading up to the assignment did prepare for this especially with creating methods. What I found 
to be most challenging was or hard was the need to keep a large piece of code organizaed so that each day that I worked on this I would remember
what a method did since this code got large after a while. From this I was able to learn about global Variaables
I was also able to learn some important information about scanners and loops which will help me in the future. 
I began to need help more near the beginning when I was deciding how I was going to store my data for pokemon and trainer
since I was uncertain whether to create another class and constructor to accomplish that goal but eventually decided on 
using global variables. The assignment took me 3 hours to accomplish and what I enjoyed most was being able to
divide my code into multiple methods which allowed me to just have to right one line in the main mathod to get my program running.
If I had the chance to  assign this assignment I would say students would have to create objects for trainers and 
that they could use arrays to store data which would help them shrink their code size.  

*/

import java.util.Scanner;

public class pg3a{
    
   //Global Variaables that can be modified
   public static String trainer1 = "Trainer1";
   public static String trainer1_Pokemon1 = "Pokemon";
   public static String trainer1_Pokemon2 = "Pokemon";
   public static String trainer1_Pokemon3 = "Pokemon";
   public static String trainer1_Pokemon4 = "Pokemon";
   public static int trainer1_Pokemon1_Level = 0;
   public static int trainer1_Pokemon2_Level = 0;
   public static int trainer1_Pokemon3_Level = 0;
   public static int trainer1_Pokemon4_Level = 0;
   public static String trainer2 = "Trainer2";
   public static String trainer2_Pokemon1 = "Pokemon";
   public static String trainer2_Pokemon2 = "Pokemon";
   public static String trainer2_Pokemon3 = "Pokemon";
   public static String trainer2_Pokemon4 = "Pokemon";
   public static int trainer2_Pokemon1_Level = 0;
   public static int trainer2_Pokemon2_Level = 0;
   public static int trainer2_Pokemon3_Level = 0;
   public static int trainer2_Pokemon4_Level = 0;
   
   public static void main(String[] args){//This will execute the code in Main
        prompt();
        
    }
    
    public static boolean Pokemon_Check(String pokemon, int level) {//This checks the pokemon input placed by the user 
        boolean p;
        boolean l;
        
        if(pokemon.equalsIgnoreCase("Pikachu")) {//this will check the pokemon input
            System.out.println(pokemon);
            p = true;
            
        } else if (pokemon.equalsIgnoreCase("Bulbasaur")) {
            System.out.println(pokemon);
            p = true;
            
        } else if (pokemon.equalsIgnoreCase("Squirtle")) {
            System.out.println(pokemon);
            p = true;
            
        }else if (pokemon.equalsIgnoreCase("Charmander")) {
            System.out.println(pokemon);
            p = true;
            
        } else {
            System.out.println("Not a acceptable Pokemon");
            p = false;
            
        }
        
        if(level <= 15 && level >= 1) {//This will chaeck the value of level to see if valid
            l = true;
            
        } else {
            l = false;
            
        }
        
        if(l && p) { //this checks output from both checks 
            return true;
        } else {
            return false;
        }
        
    }
    
    public static void menu() {//will show menu and display the potential options a user may select
        System.out.println("1. Change Trainer1's name");
        System.out.println("2. Change Trainer2's name");
        System.out.println("3. Set Trainer1's Pokemon");
        System.out.println("4. Set Trainer2's Pokemon");
        System.out.println("5. Display the trainers' names and Pokemon");
        System.out.println("6. Display the trainer who has the highest level Pokemon");
        System.out.println("7. Exit the program");
    }
    
    public static void check_userInput(int userNum) {//this will execute the options the user selected from menu
        Scanner CU = new Scanner(System.in);
        if(userNum == 1) {//does option 1
          //we are having a new trainer name being asked for input by user and that input goes into a function that modifies the global variable
          System.out.println("Please Select Your New Trainer Name");
          String t1 = CU.nextLine();
          change_Name(t1, 1);
        } else if (userNum == 2) {//executes option 2 which is trainer two's name
          //we are having a new trainer name being asked for input by user and that input goes into a function that modifies the global variable
          System.out.println("Please Select Your New Trainer Name");
          String t2 = CU.nextLine();
          change_Name(t2, 2);
        } else if (userNum == 3) {//Allows for selection of Pokemon
          System.out.println("Select Your Pokemon from These choises: Pikachu, Bulbasaur, Squirtle, and Charmander");
          System.out.println("1. Pokemon1");
          System.out.println("2. Pokemon2");
          System.out.println("3. Pokemon3");
          System.out.println("4. Pokemon4");
          System.out.println("Select The Number:");
          int selection = CU.nextInt();
          pokemon_Picker(selection);
          pokemon_Picker_Level(selection);
          
        } else if (userNum == 4) {//eAllows for selection of pokemon
          System.out.println("Select Your Pokemon from These choises: Pikachu, Bulbasaur, Squirtle, and Charmander");
          System.out.println("1. Pokemon1");
          System.out.println("2. Pokemon2");
          System.out.println("3. Pokemon3");
          System.out.println("4. Pokemon4");
          System.out.println("Select The Number:");
          int selection = CU.nextInt();
          pokemon_Picker2(selection);
          pokemon_Picker_Level2(selection);
          
        } else if (userNum == 5) {//Prints out the trainers names and their Pokemon
          System.out.println("");
          System.out.println(trainer1);
          System.out.println("");
          System.out.println("Level " + trainer1_Pokemon1_Level + " " + trainer1_Pokemon1);
          System.out.println("");
          System.out.println("Level " + trainer1_Pokemon2_Level + " " + trainer1_Pokemon2);
          System.out.println("");
          System.out.println("Level " + trainer1_Pokemon3_Level + " " + trainer1_Pokemon3);
          System.out.println("");
          System.out.println("Level " + trainer1_Pokemon4_Level + " " + trainer1_Pokemon4);
          System.out.println("");
          System.out.println(trainer2);
          System.out.println("");
          System.out.println("Level " + trainer2_Pokemon1_Level + " " + trainer2_Pokemon1);
          System.out.println("");
          System.out.println("Level " + trainer2_Pokemon2_Level + " " + trainer2_Pokemon2);
          System.out.println("");
          System.out.println("Level " + trainer2_Pokemon3_Level + " " + trainer2_Pokemon3);
          System.out.println("");
          System.out.println("Level " + trainer2_Pokemon4_Level + " " + trainer2_Pokemon4);
          System.out.println("");
        } else if (userNum == 6) {//Checks who has the highest level pokemon
        
          //make it so that it grabs two variables first and then cycles through each group until it reaches at the conclusion that one is higher than the other
          comparator(trainer1_Pokemon1_Level, trainer1_Pokemon2_Level, trainer1_Pokemon3_Level, trainer1_Pokemon4_Level, trainer2_Pokemon1_Level, trainer2_Pokemon2_Level, trainer2_Pokemon3_Level, trainer2_Pokemon4_Level);
          
        } else if (userNum == 7) {//executes option 2
            System.exit(0);//exits out of the program
            
        } else {//if none of the numbers listed here were selected then it will print this statement out
          System.out.println("Input Placed is not Valid");
          
        }
    }
    
    public static void prompt() {//This will show what choices the user has and will continuously run in a loop till the user chooses choice 7
      while(true){
        Scanner userInput = new Scanner(System.in);//accessing Scanner Class to be able to get input from user
        menu();
        System.out.print("Please Select Place Your Selection: ");
        int userNum = userInput.nextInt();
        check_userInput(userNum);
      }
    } 
    public static String change_Name(String name, int trainer) {
        if(trainer == 1){
            trainer1 = name;
            return trainer1;
        }else{
            trainer2 = name;
            return trainer2;
        }
    }
    
    public static String pokemon_Picker(int num) {//this can be used to select modifications to each pokemon
        Scanner pokemon_selection = new Scanner(System.in);
        if(num == 1){
            System.out.println("Please Select the Pokemon and Level");
            String pName = pokemon_selection.next();
            int pLevel = pokemon_selection.nextInt();
            if(Pokemon_Check(pName, pLevel)) {
                trainer1_Pokemon1 = pName;
                return trainer1_Pokemon1;
            } else {
                System.out.println("Your inputs are not correct");
            }
            
        }else if (num == 2){
            System.out.println("Please Select the Pokemon and Level");
            String pName = pokemon_selection.next();
            int pLevel = pokemon_selection.nextInt();
            if(Pokemon_Check(pName, pLevel)) {
                trainer1_Pokemon2 = pName;
                return trainer1_Pokemon2;
            } else {
                System.out.println("Your inputs are not correct");
            }
            
        }else if (num == 3){
            System.out.println("Please Select the Pokemon and Level");
            String pName = pokemon_selection.next();
            int pLevel = pokemon_selection.nextInt();
            if(Pokemon_Check(pName, pLevel)) {
                trainer1_Pokemon3 = pName;
                return trainer1_Pokemon3;
            } else {
                System.out.println("Your inputs are not correct");
            }
            
        }else if (num == 4){
            System.out.println("Please Select the Pokemon and Level");
            String pName = pokemon_selection.next();
            int pLevel = pokemon_selection.nextInt();
            if(Pokemon_Check(pName, pLevel)) {
                trainer1_Pokemon4 = pName;
                return trainer1_Pokemon4;
            } else {
                System.out.println("Your inputs are not correct");
                return null;
                
            }
            
        }else{
            System.out.println("Your input is invalid or out of range");
            return null;
        }
        return null;
    }
    
    public static String pokemon_Picker2(int num) {//this can be used to select modifications to each pokemon
        Scanner pokemon_selection = new Scanner(System.in);
        if(num == 1){
            System.out.println("Please Select the Pokemon and Level");
            String pName = pokemon_selection.next();
            int pLevel = pokemon_selection.nextInt();
            if(Pokemon_Check(pName, pLevel)) {
                trainer2_Pokemon1 = pName;
                return trainer2_Pokemon1;
            } else {
                System.out.println("Your inputs are not correct");
            }
            
        }else if (num == 2){
            System.out.println("Please Select the Pokemon and Level");
            String pName = pokemon_selection.next();
            int pLevel = pokemon_selection.nextInt();
            if(Pokemon_Check(pName, pLevel)) {
                trainer2_Pokemon2 = pName;
                return trainer2_Pokemon2;
            } else {
                System.out.println("Your inputs are not correct");
            }
            
        }else if (num == 3){
            System.out.println("Please Select the Pokemon and Level");
            String pName = pokemon_selection.next();
            int pLevel = pokemon_selection.nextInt();
            if(Pokemon_Check(pName, pLevel)) {
                trainer2_Pokemon3 = pName;
                return trainer2_Pokemon3;
            } else {
                System.out.println("Your inputs are not correct");
            }
            
        }else if (num == 4){
            System.out.println("Please Select the Pokemon and Level");
            String pName = pokemon_selection.next();
            int pLevel = pokemon_selection.nextInt();
            if(Pokemon_Check(pName, pLevel)) {
                trainer2_Pokemon4 = pName;
                return trainer2_Pokemon4;
            } else {
                System.out.println("Your inputs are not correct");
                return null;
                
            }
            
        }else{
            System.out.println("Your input is invalid or out of range");
            return null;
        }
        return null;
    }
    
    public static int pokemon_Picker_Level(int num) {//this can be used to select modifications to each pokemon
        Scanner pokemon_selection = new Scanner(System.in);
        if(num == 1){
            System.out.println("Please Select the Pokemon and Level");
            String pName = pokemon_selection.next();
            int pLevel = pokemon_selection.nextInt();
            if(Pokemon_Check(pName, pLevel)) {
                trainer1_Pokemon1_Level = pLevel;
                return trainer1_Pokemon1_Level;
            } else {
                System.out.println("Your inputs are not correct");
            }
            
        }else if (num == 2){
            System.out.println("Please Select the Pokemon and Level");
            System.out.println("Please Select the Pokemon and Level");
            String pName = pokemon_selection.next();
            int pLevel = pokemon_selection.nextInt();
            if(Pokemon_Check(pName, pLevel)) {
                trainer1_Pokemon2_Level = pLevel;
                return trainer1_Pokemon2_Level;
            } else {
                System.out.println("Your inputs are not correct");
            }
            
        }else if (num == 3){
            System.out.println("Please Select the Pokemon and Level");
            String pName = pokemon_selection.next();
            int pLevel = pokemon_selection.nextInt();
            if(Pokemon_Check(pName, pLevel)) {
                trainer1_Pokemon3_Level = pLevel;
                return trainer1_Pokemon3_Level;
            } else {
                System.out.println("Your inputs are not correct");
            }
            
        }else if (num == 4){
            System.out.println("Please Select the Pokemon and Level");
            String pName = pokemon_selection.next();
            int pLevel = pokemon_selection.nextInt();
            if(Pokemon_Check(pName, pLevel)) {
                trainer1_Pokemon4_Level = pLevel;
                return trainer1_Pokemon4_Level;
            } else {
                System.out.println("Your inputs are not correct");
                return 0;
                
            }
            
        }else{
            System.out.println("Your input is invalid or out of range");
            return 0;
        }
        return 0;
    }
    
    public static int pokemon_Picker_Level2(int num) {//this can be used to select modifications to each pokemon
        Scanner pokemon_selection = new Scanner(System.in);
        if(num == 1){
            System.out.println("Please Select the Pokemon and Level");
            String pName = pokemon_selection.next();
            int pLevel = pokemon_selection.nextInt();
            if(Pokemon_Check(pName, pLevel)) {
                trainer2_Pokemon1_Level = pLevel;
                return trainer2_Pokemon1_Level;
            } else {
                System.out.println("Your inputs are not correct");
            }
            
        }else if (num == 2){
            System.out.println("Please Select the Pokemon and Level");
            System.out.println("Please Select the Pokemon and Level");
            String pName = pokemon_selection.next();
            int pLevel = pokemon_selection.nextInt();
            if(Pokemon_Check(pName, pLevel)) {
                trainer2_Pokemon2_Level = pLevel;
                return trainer2_Pokemon2_Level;
            } else {
                System.out.println("Your inputs are not correct");
            }
            
        }else if (num == 3){
            System.out.println("Please Select the Pokemon and Level");
            String pName = pokemon_selection.next();
            int pLevel = pokemon_selection.nextInt();
            if(Pokemon_Check(pName, pLevel)) {
                trainer2_Pokemon3_Level = pLevel;
                return trainer2_Pokemon3_Level;
            } else {
                System.out.println("Your inputs are not correct");
            }
            
        }else if (num == 4){
            System.out.println("Please Select the Pokemon and Level");
            String pName = pokemon_selection.next();
            int pLevel = pokemon_selection.nextInt();
            if(Pokemon_Check(pName, pLevel)) {
                trainer2_Pokemon4_Level = pLevel;
                return trainer2_Pokemon4_Level;
            } else {
                System.out.println("Your inputs are not correct");
                return 0;
                
            }
            
        }else{
            System.out.println("Your input is invalid or out of range");
            return 0;
        }
        return 0;
    }
    
    public static void comparator(int p11, int p12, int p13, int p14, int p21, int p22, int p23, int p24) {
        int pokemon_1_level_Max;
        int pokemon_2_level_Max;
        
        if (p11 > p12) { 
            if(p11 > p13) {
                if (p11 > p14) {
                    pokemon_1_level_Max = p11;
                } else {
                    pokemon_1_level_Max = p14;
                }
            } else {
                if (p13 > p14) {
                    pokemon_1_level_Max = p13;
                } else {
                    pokemon_1_level_Max = p14;
                }
            }
        } else {
            if (p12 > p13) {
                if(p12 > p14) {
                    pokemon_1_level_Max = p12;
                } else {
                    pokemon_1_level_Max = p14;
                }
            } else {
                if (p13 > p14) {
                    pokemon_1_level_Max = p13;
                } else {
                    pokemon_1_level_Max = p14;
                }
            }
        }
        //this checks the seond pokemon trainers group
        if (p21 > p22) { 
            if(p21 > p23) {
                if (p21 > p24) {
                    pokemon_2_level_Max = p21;
                } else {
                    pokemon_2_level_Max = p24;
                }
            } else {
                if (p23 > p24) {
                    pokemon_2_level_Max = p23;
                } else {
                    pokemon_2_level_Max = p24;
                }
            }
        } else {
            if (p22 > p23) {
                if(p22 > p24) {
                    pokemon_2_level_Max = p22;
                } else {
                    pokemon_2_level_Max = p24;
                }
            } else {
                if (p23 > p24) {
                    pokemon_2_level_Max = p23;
                } else {
                    pokemon_2_level_Max = p24;
                }
            }
        }
        
        if(pokemon_1_level_Max > pokemon_2_level_Max) {
            System.out.println(trainer1 + " has the highest level pokemon");
        } else if(pokemon_1_level_Max < pokemon_2_level_Max){
            System.out.println(trainer2 + " has the highest level pokemon");
        } else {
            equal
        }
    }
    
} //end of class

