import java.util.Scanner;
public class Main{
    public static void main(String[]arrgs){
	/*
       	Nerd n1 = new Nerd();
	System.out.println(n1.toString());
	System.out.println(n1.getResourceName());
	Jock j1 = new Jock();
	System.out.println(j1.toString());
	System.out.println(j1.getResourceName());
	Teacher t1 = new Teacher();
	System.out.println(t1.toString());
	System.out.println(t1.getResourceName());
	System.out.println(n1.attack());
	System.out.println(t1.specialAttack());
	*/
	Scanner in = new Scanner(System.in);
	Scanner in1 = new Scanner(System.in);
	//1.-------------
	Actor p1 = new Actor();//had to do this due to "might not have been initialized errors
	String input = "";
	while (!validChar(input)){
	    System.out.println("Enter the class you wish to play.(Nerd, Jock, Teacher)[N/J/T]");
	    input = in.next();
	    }
     	//System.out.println(input);
	if (input.equalsIgnoreCase("N")){p1 = new Nerd();}
	if (input.equalsIgnoreCase("J")){p1 = new Jock();}
	if (input.equalsIgnoreCase("T")){p1 = new Teacher();}
	//System.out.println(p1.getResource());
	//2.-------------
	Actor p2 = new Actor();//had to do this due to "might not have been initialized errors
	int opp = (int)(Math.random() * 3 + 1);//can also use class
	//System.out.println(opp);
	if (opp == 1){p2 = new Nerd();}
	if (opp == 2){p2 = new Jock();}
	if (opp == 3){p2 = new Teacher();}
	//3.------------
	System.out.println("Your opponent is a <work in progress>");
	String input2 = "";
	//	p1.battle();//battle taken care of in battle() function
	while(input2!="q" || input2!="Q"){
	    while (!validAction(input2)){
		System.out.println("Choose: Attack[A], Special Attack[S], Defend[D], Quit[Q]");
		input2 = in1.next();
	    }
	    if (input2.equalsIgnoreCase("A")){System.out.println(p1.attack(p2));}
	    if (input2.equalsIgnoreCase("S")){System.out.println(p1.specialAttack(p2));}
	    if (input2.equalsIgnoreCase("D")){}//to be implemented
	    if (input2.equalsIgnoreCase("Q")){p1.end();break;}
	    input2 = "";
	    System.out.println(p2.attack(p1));//not random for now, will change
	}
	//4.-------------
	
    }

    public static Boolean validChar(String s){
	return s.equalsIgnoreCase("N") ||
	    s.equalsIgnoreCase("T") ||
	    s.equalsIgnoreCase("J");
    }

    public static Boolean validAction(String s){
	return s.equalsIgnoreCase("A") ||
	    s.equalsIgnoreCase("S") || 
	    s.equalsIgnoreCase("D") ||
	    s.equalsIgnoreCase("Q");	    
    }	
}
