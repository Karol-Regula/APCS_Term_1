public class Actor{
    private String name;
    private int strength,agility,intelligence;
    private int health;

    //actor constructor to initialize all instance variables
    public Actor(String name, int str, int agi, int intel, int health){
        this.name = name;
        agility = agi;
        strength = str;
        intelligence = intel;
        this.health = health;
    }

    //specific named actor
    public Actor(String name){
        this(name,10,10,10,20);
    }

    //generic named actor
    public Actor(){
        this("Joe Dirt",10,10,10,20);
    }

    //You must write these methods:
    public String getName(){
	return name;
    }
    public int getInt(){
	return intelligence;
    }
    public int getStr(){
	return strength;
    }
    public int getAgi(){
	return agility;
    }
    public int getHealth(){
	return health;
    }
    //a toString would be useful
    public int takeDamage(int damage){
	health = getHealth() - damage;
	return health;
	//this should return the damage.
    }
    public String attack(){
	return getName()+" attacked the target successfully.";
    }
    public String specialAttack(){
	return getName()+" crippled the target with a powerful special attack.";
    }
    public static void main(String[]aaargs){
	Actor a1 = new Actor();
	Wizard w1 = new Wizard();
	Wizard w2 = new Wizard("Scotty");
	Wizard w3 = new Wizard("Felix",44,44,44,44);
	System.out.println(a1.attack());
	System.out.println(a1.specialAttack());
	System.out.println(w1.attack());
	System.out.println(w2.attack());
	System.out.println(w3.specialAttack());
    }
}
