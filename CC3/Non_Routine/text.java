public class text{
    
    public static void main(String[] args){
        Pokemon cat = new Pokemon("cat", 12, Type. ELECTRIC);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 15, 20, 80, 100, Type.FIRE);
        bulbasaur.attack(cat, 12, 30, 20, 50, 40);
        double m = (double)80/100;
        System.out.println(m);
    }
}