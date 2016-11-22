public class Driver{
    
     public static void main(String[]args){
	Circle c1 = new Circle();
	System.out.println(c1.getRadius());
	c1.setRadius(5);
	System.out.println(c1.getRadius());
	System.out.println(c1.getArea());
	System.out.println(c1.getPerimeter());
	System.out.println(c1.toString());
	System.out.println("=========================");

	Rectangle r1 = new Rectangle();
	System.out.println(r1.getLength());
	System.out.println(r1.getWidth());
	r1.setLength(5);
	r1.setWidth(12);
	System.out.println(r1.getLength());
	System.out.println(r1.getWidth());
	System.out.println(r1.getArea());
	System.out.println(r1.getPerimeter());
	System.out.println(r1.toString());
	System.out.println("=========================");

	//inherited classes 2 levels down not detected?
	Square s1 = new Square();
	System.out.println(s1.getLength());
	System.out.println(s1.getWidth());
	s1.setLength(5);
	System.out.println(s1.getWidth());
	System.out.println(s1.getLength());
	System.out.println(s1.getArea());
	System.out.println(s1.getPerimeter());
	System.out.println(s1.toString());
    } 
}
