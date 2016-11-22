public class Teacher extends Actor{
    private int patience;

    public Teacher(String name, int str, int agi, int intel, int health){
        super(name,str,agi,intel,health);
        patience = 100;
    }
    public Teacher(String name){
        this(name,8,10,15,15);
    }
    public Teacher(){
        this("Kirk");
    }

    public String attack(Actor target){
        return getName()+" gives homework assignment to "+target.getName()+".";
	//target.takeDamage(5);
    }

    public String specialAttack(Actor target){
        return getName()+" administers test to "+target.getName()+".";
	//target.takeDamage(20);
    }
    public int getResource(){
        return patience;
    }
    public String getResourceName(){
        return "Patience";
    }
}
