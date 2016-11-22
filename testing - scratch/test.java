public class test{
    public static void main(String[]args){
	int a = 5;
	double b = 10.0;
	String c = "foo";
	String d = a + b + c;
	System.out.println(d);
	String f = "foo";
	String g = new String("foo");
	String h;
	h = f;
	System.out.println(g == h);
	System.out.println(h == f);
    }
}
