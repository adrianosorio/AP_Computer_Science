public class Character_Creator{
    private int health = 100;
    private String role; 
    
    public String Characterr_Creator(String type) {
        role = type;
        return role;
    }
    
    public int getHealth() {//returns health of all characters
        return health;
    }
    
    public String getRole() { //returns what type of character someone is 
        return role;
    }
    
    public String getRole(String getRole){
        if(getRole.equals("Admiral")){
            role = "Admiral";
            return role;
        } else if(getRole.equals("Trooper")) {
            role = "Trooper";
            return role;
        } else if(getRole.equals("Force-Sensitive")) {
            role = "Force-Sensitive";
            return role;
        } else if(getRole.equals("Commander")){
            role = "Commander";
            return role;
        } else {
            role = null;
            return role;
        }
    }
    
}