/*Adrian Osorio AP Computer Science 12/10/15 Assignment #2 310-227-5883 https://sites.google.com/a/esusdstudents.org/adrianosorio101/ adrianosorio101@gmail.com
The warm-up exercises did provide great aid especially on practice it however some aspects of the project that did not rely on objects required me to do research on what ever I was uncertain on. 
The program was not as hard as i orginally thought and was easy to accomplish however what was difficult was figuring out why certain decimal values were returning 0.0 when it would be 0.8 
and i figured out that i had to cast the values as a float before i made it a float. I learned about how to use enumerate which is an interesting type and I also learned how to use objects
with ease then I did before. I needed help mainly with enumerate however I also needed help with understanding why if one declares a variable as a double that the decimal value wont show up 
unless casted. The assignment took me two hours to complete mainly due to the need to figure out why i was recieving 0 as an attack value and the best part of the assignment was understanding
objects since previously I hardly used objects however now with my understanding I can use them effectively. If I were the teacher I would have added more use to the enum since it seems pointless to have it in 
this assignment other wise since it does not truly modify much in the program.
*/

public class Pokemon{
    
    //Global Variables
    
    private String name;
    private int defense;
    private int attack;
    private int level;
    private int health;
    private Type type;
    
    public Pokemon(String p_name, int p_level, Type p_type) {//Pokemon Constructor simplest
        this.health = 50;
        this.attack = 50;
        this.defense = 50;
        this.level = p_level;
        this.name = p_name;
        this.type = p_type;
    }
    
    public Pokemon(String p_name, int p_level,  int p_health, int p_attack, int p_defense, Type p_type) {//pokemon constructor most effort
        this.health = p_health;
        this.attack = p_attack;
        this.defense = p_defense;
        this.level = p_level;
        this.name = p_name;
        this.type = p_type;
    }
    
    public int hurt(int damage) {
        if(damage > 0 ){
            return health -= damage;
            
        } else {
            return health -= 0;
        }
    }
    
    public int attack(Pokemon target, int base, float critical, float typeModifier, float STAB, float Random) {
         int modifier = (int)(STAB * typeModifier * critical * 1 * Random);
         //System.out.println(modifier);
         float p1 = (float)((2*level)+10) / 250;
         //System.out.println(p1 + " p1");
         float p2 = (float)attack/defense;
         //System.out.println(p2 + " p2");
         float p3 = base + 2;
         //System.out.println(p3 + " p3");
         int firstP =  (int)(p1 * p2 * p3) * modifier; 
         if(firstP != 0) { 
           System.out.println(name + " attacked " + target.name + " for " + firstP);
           target.hurt(firstP);
           if(critical == 2.0) {
              System.out.println("Critical Hit"); 
           }
           if(target.getHealth() <= 0) {
               System.out.println(target.getName() + " fainted");
           }
         } 
         return firstP;
    }
    //Support methods listed below
    public int getHealth() {
        return health;
    }
    
    public String getName() {
        return name;
    }
    
    public Type getType() {
        return type;
    }
    
    public int getLevel() {
        return level;
    }
        
    public int getAttack() {
        return attack;
    }
        
    public int getDefense() {
        return defense;
    }
    
    public boolean isAlive() {
        if(this.getHealth() <= 0) {
            return false;
        } else {
            return true;
        }
    }
    
    public String toString() {
        String m = " " + name + " " + level;
        return m;
    }
    
    public boolean equals(Pokemon other) {
        String p = other.name;
        if(p.equalsIgnoreCase(name) && other.level == level){
            return true;
        } else {
            return false;
        }
    }
        
}