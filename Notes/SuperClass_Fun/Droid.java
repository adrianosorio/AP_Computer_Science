public class Droid{
    static String core = "raspberry-pi";
    private int health = 100;
    static int armorStrength;
    static double intelligence;
    
    
    public void Droid(int strength, double smart) {
        armorStrength = strength;
        intelligence = smart;
        System.out.println("Kill Jedi Scum");
    }
    
    public int healthAndArmor() {
        health += armorStrength;
        return health;
    }
    
    public int damageDone(int attack) {
        double rand = Math.random();
        int totalDamage = (int)(rand * 2 * attack);
        health -= totalDamage; 
        return health;
    }
    
    public int getHealth1() {
        return health;
    }
    
    
}