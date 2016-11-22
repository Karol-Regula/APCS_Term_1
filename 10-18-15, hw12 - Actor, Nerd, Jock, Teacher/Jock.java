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
	target.takeDamage(5);
        return getName()+" looks menacingly at "+target.getName()+".";
    }

    public String specialAttack(Actor target){
	target.takeDamage(20);
	intimidation-=10;
        return getName()+" flexes muscles at "+target.getName()+".";
    }
    public int getResource(){
        return intimidation;
    }
    public String getResourceName(){
        return "intimidation";
    }
}
