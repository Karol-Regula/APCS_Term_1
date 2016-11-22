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
	target.takeDamage(5);
        return getName()+" gives homework assignment to "+target.getName()+".";
    }

    public String specialAttack(Actor target){
	target.takeDamage(20);
	patience-=10;
        return getName()+" administers test to "+target.getName()+".";
    }
    public int getResource(){
        return patience;
    }
    public String getResourceName(){
        return "patience";
    }
}
