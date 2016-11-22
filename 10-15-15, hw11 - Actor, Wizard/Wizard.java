public class Wizard extends Actor{
    private int mana;
    public Wizard(){
	super("Dave",1,1,1,1);
	//can use this() to call other constructor in this class which then calls the super
    }
    public Wizard(String name){
	super(name);
    }
    public Wizard(String name, int str, int agi, int intel, int health){
	super(name, str, agi, intel, health);
	mana = 20;
    }
    public String attack(){
	return getName()+" attacked the target using magic powers.";
    }
    public String specialAttack(){
	return getName()+" obliterated the target using powerful magic.";
    }
}
