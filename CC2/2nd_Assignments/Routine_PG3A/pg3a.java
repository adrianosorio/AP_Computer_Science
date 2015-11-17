import java.util.Scanner;

public class pg3a{ 
    
    public static void main(String[] args) {
      boolean run = true;
      int choice = 0;
      prompt();
      while(true) {
      if(choice == 0){
        prompt();
        if(choice == 1) {
            Scanner Trainer1 = new Scanner(System.in);
            System.out.println("Trainer1 new Name");
            String trainer1Name = Trainer1.next();
            Trainer1.close();
            
        } else if(choice == 2) {
            System.out.println("1");
            prompt();
        } else if(choice == 3) {
            System.out.println("1");
            prompt();
        } else if(choice == 4) {
            System.out.println("1");
            prompt();
        } else if(choice == 5) {
            System.out.println("1");
            prompt();
        } else if(choice == 6) {
            System.out.println("1");
            prompt();
        } else if(choice == 7) {
          System.exit(0);
        } else {
            System.out.println("You selected no valid value");
        }
      }
      }
    }
    public static int prompt() {
        System.out.println("1. Change Trainer1's name");
        System.out.println("2. Change Trainer2's name");
        System.out.println("3. Set Trainer1's Pokemon");
        System.out.println("4. Set Trainer2's Pokemon");
        System.out.println("5. Display the trainers' names and Pokemon");
        System.out.println("6. Display the trainer who has the highest level Pokemon");
        System.out.println("7. Exit the program");
        Scanner Input = new Scanner(System.in);
        int choice = Input.nextInt();
        Input.close();
        return choice;
        
    }
    
    
}