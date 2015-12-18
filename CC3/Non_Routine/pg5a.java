/** This program battles two Pokemon, Bulbasaur and Charmander, until one of them faints.
 *  This class requires the use of a Pokemon class
 *  @version 12/1/2014
*/

public class pg5a {
   
   //creates the variables for attacking
   public static int base;
   public static float critical;
   public static float typeModifier;
   public static float STAB;
   public static float random;
   
   public static void main(String[] args) {
      //creates two new pokemon
      Pokemon bulbasaur = new Pokemon("Bulbasaur", 15, 20, 80, 100, Type.FIRE);
      Pokemon charmander = new Pokemon("Charmander", 12, Type.GRASS);
      
      while(bulbasaur.isAlive() && charmander.isAlive()) { //continues the battle until one pokemon faints
         generate();
         bulbasaur.attack(charmander, base, critical, typeModifier, STAB, random);
         if(charmander.isAlive()) { //only runs the second attack if the second pokemon is still alive
            generate();
            charmander.attack(bulbasaur, base, critical, typeModifier, STAB, random);
         }
      }
   }
   
   /**Creates the inputs (base, critical, typeModifier, STAB, random) for the next attack*/
   public static void generate() {
      //makes each output a variable and assigns them
      base = (int) Math.random()*50 + 10;
      critical = chooseCritical();
      typeModifier = chooseType();
      STAB = chooseSTAB();
      random = (float) (Math.floor(Math.random()*15) + 85) / (float) 100.0;
      
   }
   
   /**Chooses the type variable randomly from (0.25,0.5, 1.0, 2.0, 4.0)
    * @return float for type
    */
   public static float chooseType() {
      float random = (float) Math.random();
      
      if (random < 1.0/5.0) {
         return (float) 0.25;
      } else if (random < 2.0/5.0) {
         return (float) 0.5;
      } else if (random < 3.0/5.0) {
         return (float) 1.0;
      } else if (random < 4.0/5.0) {
         return (float) 2.0;
      } else {
         return (float) 4.0;
      }
   }
   
   /**Chooses the STAB variable randomly from (1.5, 1.0) with weighted results 15% and 85% respectively
    * @return float for STAB
    */
   public static float chooseSTAB() {
      float random = (float) Math.random();
      
      if(random <= 0.15) { //weights the results
         return (float) 1.5;
      } else {
         return (float) 1.0;
      }
   }
   
   /**Chooses the critical variable randomly from (1.0, 2.0) with weighted results 15% and 85% respectively
    * @return float for critical
    */
   public static float chooseCritical() {
      float random = (float) Math.random();
      
      if(random <= 0.15) { //weights the results
         return (float) 2.0;
      } else {
         return (float) 1.0;
      }
   }
}