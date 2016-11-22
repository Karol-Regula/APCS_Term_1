public class Loops{
    public static void main(String[]arrgs){
	// 1. --------------------------------
	/*
	for(int x = 1; x < 21; x++){
	    System.out.println(x);
	}
	*/
	// 2. --------------------------------
	/*
	for(int x = 2; x < 21; x+=2){
	    System.out.println(x);
	}
	*/
	// 3. --------------------------------
	/*
	for(int x = 3; x < 21; x+=3){
	    System.out.println(x);
	}
	*/
	// 4. --------------------------------
	/*
	for(int x = 1; x < 21; x+=2){
	    System.out.println(x*x);
	}
	*/
	// 5. --------------------------------
	/*
	String out = "";
	for(int x = 1; x < 20; x+=1){
	    out += x;
	    out += " + ";
	}
	System.out.println(out += 20);
	*/
	// 6. --------------------------------
	/*
	int sum = 0;
	for(int x = 1; x < 21; x+=2){
	    System.out.println(x+sum);
	    sum+=x;
	}
	*/
	// 7. --------------------------------
	/*
	double sumfor = 0;
	double currentfor = 1.0;
	for(int x = 1; x < 21; x++){
	    sumfor+=1.0/(currentfor*3.0);
	    currentfor = currentfor * 3;
	}
	System.out.println(sumfor);
	*/
	// 8. --------------------------------
	int sumfor = 0;
	for(int x = 1; x < 21; x++){
	    sumfor+=1/(Math.pow(x,3));
	}
	System.out.println(sumfor);

	//While Loops:===============================================
	// 1. --------------------------------
	/*
	int x = 1;
	while(x<21){
	    System.out.println(x);
	    x++;
	}
	*/
	// 2. --------------------------------
	/*
	int x = 2;
	while(x<21){
	    System.out.println(x);
	    x+=2;
	}
	*/
	// 3. --------------------------------
	/*
	int x = 3;
	while(x<21){
	    System.out.println(x);
	    x+=3;
	}
	*/
	// 4. --------------------------------
	/*
	int x = 1;
	while(x<21){
	    System.out.println(x*x);
	    x+=2;
	}
	*/
	// 5. --------------------------------
	/*
	int x = 1;
	String out = "";
	while(x<20){
	    out += x;
	    out += " + ";
	    x+=1;
	}
	System.out.println(out += 20);
	*/
	// 6. --------------------------------
	/*
	int x = 1;
	int sum = 0;
	while(x<21){
	    System.out.println(x+sum);
	    sum+=x;
	    x+=2;
	}
	*/
	// 7. --------------------------------
	/*
	int x = 1;
	double sumwhile = 0;
	double currentwhile = 1.0;
	while(x<21){
	    sumwhile+=1.0/(currentwhile*3.0);
	    currentwhile = currentwhile * 3;
	    x++;
	}
	System.out.println(sumwhile);
	*/
	// 8. --------------------------------
	int x = 1;
	int sumwhile = 0;
	while(x<21){
	    sumwhile+=1.0/(Math.pow(x,3));
	    x+=1;
	}
	System.out.println(sumwhile);
    }
}
