public class Pokemon{
    
    //Global Variables
    
    String name;
    int defense;
    int attack;
    int level;
    int health;
    Type type;
    
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