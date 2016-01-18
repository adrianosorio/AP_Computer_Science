public class B2_BattleDroid extends Droid{
    double intelligence = 6.5;
    int armorStrength = 50;
    int attack = 20;
    
    public void B2_BattleDroid() {
        System.out.println("Roger That, Sir Element Jedi however I am the Smartest and Strongest Droid type");
        Droid(armorStrength, intelligence);
    }
    
    public void getHealth() {
        System.out.println(getHealth1());
    }
    
}