public class MainClass {
    public static void main(String[] args){
    
      SuperClass superclass = new SuperClass();
      Bird bird = new Bird();
      Dog dog = new Dog();
      System.out.println();
      superclass.sleep();
      superclass.eat();
      bird.sleep();
      bird.eat();
      dog.eat();
      dog.sleep(); 
   
    }


}
