public class Nerd extends Actor{
    private int stamina;

    public Nerd(String name, int str, int agi, int intel, int health){
        super(name,str,agi,intel,health);
        stamina = 100;
    }
    public Nerd(String name){
        this(name,8,10,15,15);
    }
    public Nerd(){
        this("Scotty");
    }

    public String attack(Actor target){
        return getName()+" throws pencil at "+target.getName()+".";
	//target.takeDamage(5);
    }

    public String specialAttack(Actor target){
        return getName()+" throws notebook at "+target.getName()+".";
	//target.takeDamage(20);
    }
    public int getResource(){
        return stamina;
    }
    public String getResourceName(){
        return "Stamina";
    }
}
