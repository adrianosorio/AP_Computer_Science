public class B1_BattleDroid extends Droid{
    double intelligence = 4.5;
    int armorStrength = 20;
    int attack = 10;
    
    public void B1_BattleDroid() {
        System.out.println("Roger, Roger, Sir Element Jedi however I'm not the Smartest or Strongest Droid type");
        Droid(armorStrength, intelligence);
    }
    
    public void getHealth() {
        System.out.println(getHealth1());
    }
    
}