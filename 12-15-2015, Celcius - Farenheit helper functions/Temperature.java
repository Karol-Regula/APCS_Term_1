public class Temperature{
    public static void main(String[]args){
	System.out.println(CtoF(-40)+" -40");
	System.out.println(CtoF(100)+" 212");
	System.out.println(CtoF(20)+ " 68");
	System.out.println(FtoC(-40)+" -40");
	System.out.println(FtoC(212)+" 100");
	System.out.println(FtoC(68)+" 20");
    }
    
    public static double CtoF(double t){
	return t * 1.8 + 32;
    }

    public static double FtoC(double t){
	return (t - 32) / 1.8;
    }
}
