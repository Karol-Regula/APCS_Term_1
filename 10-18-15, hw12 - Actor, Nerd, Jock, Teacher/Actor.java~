/*
public class Actor{
    private String name;
    private int strength,agility,intelligence;
    private int health;

    //1. Must override the three consructors
    public Actor(String name, int str, int agi, int intel, int health){
        this.name = name;
        agility = agi;
        strength = str;
        intelligence = intel;
        this.health = health;
    }

    public Actor(String name){
        this(name,10,10,10,20);
    }

    public Actor(){
        this("Peon",10,10,10,20);
    }

    public String toString(){
        return name + " hp: "+health+ "\ns/a/i: "+strength+"/"+agility+"/"+intelligence;
    }

    public int takeDamage(int damage){
        health -= damage;
        return damage;
    }
    public String getName(){return name;}
    public int getInt(){return intelligence;}
    public int getStr(){return strength;}
    public int getAgi(){return agility;}
    public int getHealth(){return health;}

    //2. need to override all methods below this comment
    public String attack(Actor target){
        return name+" punches the target";
    }

    public String specialAttack(Actor target){
        return name+" wildly attacks the target";
    }

    //how much special resource is left
    public int getResource(){return 0;}

    //what is the name of the special resource
    public String getResourceName(){return "";}
    
    public static String end(){
	return "";
	//might say farewell to user later
    }
}
*/



public abstract class Actor{
    private String name;
    private int strength,agility,intelligence;
    private int health;

    //abstract methods
    public abstract String attack(Actor other);
    public abstract String specialAttack(Actor other);
    public abstract String getResourceName();
    public abstract int getResource();

    //constructors
    public Actor(String name, int str, int agi, int intel, int health){
        this.name = name;
        agility = agi;
        strength = str;
        intelligence = intel;
        this.health = health;
    }

    public Actor(String name){
        this(name,10,10,10,20);
    }

    public Actor(){
        this("Peon",10,10,10,20);
    }

    //concrete methods
    public String toString(){
        return name + " hp: "+health+ "\n STR:"+strength+" AGI:"+agility+" INT:"+intelligence+"\n "+getResourceName()+ ": "+getResource();
    }

    public String getName(){return name;}
    public int getInt(){return intelligence;}
    public int getStr(){return strength;}
    public int getAgi(){return agility;}
    public int getHealth(){return health;}

    public int takeDamage(int damage){
        health -= damage;
        return damage;
    }

    //placeholder for more features
    public String defend(){
        return name+" defends against incoming attacks";
    }

    //placeholder for more features
    public void nextTurn(){
        //reset any temporary things like defend
    }
}
