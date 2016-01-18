public class Droid_Factory{
    
    public static void main(String[] args) {
        B1_BattleDroid roger = new B1_BattleDroid();
        roger.getHealth();
        roger.B1_BattleDroid();
        roger.damageDone(24);
        roger.getHealth();
         roger.damageDone(24);
        roger.getHealth();
        B2_BattleDroid SuperBattleDroid = new B2_BattleDroid();
        SuperBattleDroid.B2_BattleDroid();
        SuperBattleDroid.getHealth();
        
        
    }
    
}