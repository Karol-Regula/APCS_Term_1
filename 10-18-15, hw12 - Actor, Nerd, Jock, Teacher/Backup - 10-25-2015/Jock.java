public class Jock extends Actor{
    private int intimidation;

    public Jock(String name, int str, int agi, int intel, int health){
        super(name,str,agi,intel,health);
        intimidation = 100;
    }
    public Jock(String name){
        this(name,8,10,15,15);
    }
    public Jock(){
        this("Sulu");
    }

    public String attack(Actor target){
        return getName()+" looks menacingly at "+target.getName()+".";
	//target.takeDamage(5);
    }

    public String specialAttack(Actor target){
        return getName()+" flexes muscles at "+target.getName()+".";
	//target.takeDamage(20);
    }
    public int getResource(){
        return intimidation;
    }
    public String getResourceName(){
        return "Intimidation";
    }
}
