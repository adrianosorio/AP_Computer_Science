/*Adrian Osorio AP Computer Science 12/10/15 Assignment #2-3B 310-227-5883 https://sites.google.com/a/esusdstudents.org/adrianosorio101/ adrianosorio101@gmail.com
The program was not at all hard to create and felt like a routine mainly because it only required me to investigate some new classes to use in order ot read and write a file.I learned 
how to use the Random class with ease and also how to create and edit files in java which is a great aid for me in the future to be able to do. I only needed help with using the random 
class sijnce much of the documentation online is skewed and hard to comprehend however I eventually learned how to master it and it took me an hour to accomplish. The best part of The
assignment was getting the random values to fit in the ranges that were needed since i could use math concepts i've learned in school such as geometric sequences to solve for the type value.value
If i had to redesign it I would make it so that students had to read from the file created and extract which attack would produce the largest damage. I felt that the in class ppractice from
school did come in handy however individual research helped the most.


*/

import java.util.Scanner;
import java.io.*;
import java.util.Random;
import java.text.DecimalFormat;

public class pg3b{
    
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);//prompts user for the file name
        System.out.println("Please Tell me the file name you want the output file to be called");
        System.out.println("Enter: ");
        String fileName = UserInput.next();
        String fileNameFull = fileName + ".txt";
        createFile(fileName);//puts input from user in the createFile method to create a file
        writeToFile(fileNameFull); //tell the wirte method which file to append content into
    }
    
    public static void createFile(String fileName) {//this will generate the user file 
        File myFile;
        String textFile = fileName + ".txt";
        myFile = new File(textFile); //the parameter for File is just a path 
        try {
            myFile.createNewFile();//creates the file
          
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static String attackGeneration(){//this will generate the attack and fits the parameters correctly into the specifications
        Random value = new Random(); //uses classs random to get the values
        Double typeV = 0.25 * Math.pow(2, value.nextInt(5)) * value.nextInt(2);
        int levelV = value.nextInt(100);
        int attackV = value.nextInt(500);
        int defenseV = value.nextInt(500);
        int baseV = value.nextInt(241) + 10;
        double stabV;
        if(value.nextInt(101) > 15) {
            stabV = 1;
        } else {
            stabV = 1.5;
        }
        int criticalV = value.nextInt(2) + 1;
        Double randomV = (Math.random()%0.25) + 0.75; 
        DecimalFormat precisionOfTwo = new DecimalFormat("0.00");//helps format the decimals to the correct precision 
        String pokemonCommand = "Type " + typeV + " Level " + levelV + " Attack " + attackV + " Defense " + defenseV + " Base " + baseV  + " STAB " + stabV + " Critical " + criticalV + " Random " + precisionOfTwo.format(randomV) + " ";
        return pokemonCommand; //this returns the string fully formated
        
    }  
    
    public static void writeToFile(String textFile) {//this method adds the content into a txt file which is created by the user
        try{
            FileWriter file = new FileWriter(textFile); 
            BufferedWriter bufferedFile = new BufferedWriter(file);
            for(int x = 0; x < 21; x++){ //this helps write the content 20 times into the file the user created
                bufferedFile.write(attackGeneration());
                bufferedFile.newLine();
            }
            bufferedFile.close();//saves the file and exits out
            
        } catch (IOException ex) {
             ex.printStackTrace();
        }
    }
    
}