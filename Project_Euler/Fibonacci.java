import java.lang.Math;
public class Fibonacci{
    
    public static void main(String[] args) {
        int combo = 0;
        
        for(int x = 0; x <= 2000; x++) {//This will run the function fibonacci 2000 times
          int m = Fibonacci_Seq(x);
          if(m % 2 == 0 && m < 4000000) { //this will check to ensure the value of a fib num does not exceed four million and is a multiple of two
            combo += m; // Adds the fib number to combo which holds the added value 
            System.out.println(m);
            System.out.println(combo);
          }
        }
    }
    public static int Fibonacci_Seq(int Seq_Num) { //this method is the fibonacci sequence value finder 
       double goldenRatio = (1 + Math.sqrt(5))/2;// this uses gives me the golden ratio
       double goldenRatio_N = -1 * (((1 + Math.sqrt(5))/2) - 1);//this gives me the negetive golden ratio minus 1
       double fib_Num = (Math.pow(goldenRatio, Seq_Num) - Math.pow(goldenRatio_N, Seq_Num))/Math.sqrt(5);//this is a method of using the golden ratio to find the Fibonacci number in a given space
       int fib_Num_Int = (int) fib_Num; //this converts a double into a integer for fib num
       return fib_Num_Int;
      
      
    }
}
