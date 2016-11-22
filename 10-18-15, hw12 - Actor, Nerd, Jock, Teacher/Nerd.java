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
	target.takeDamage(5);
        return getName()+" throws pencil at "+target.getName()+".";
    }

    public String specialAttack(Actor target){
	if (stamina>=10)
	    {
		stamina-=10;
		target.takeDamage(20);
	    }
	else
	    {
		System.out.println("You do not have enough "+getResourceName());
	    }
        return getName()+" throws notebook at "+target.getName()+".";
    }//put the return statement in the right place for this.

    public int getResource(){
        return stamina;
    }
    public String getResourceName(){
        return "stamina";
    }
}
