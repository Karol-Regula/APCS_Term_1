public class Driver{
    public static void main(String[]args){
	//constructors
	Coordinate c = new Coordinate();
	Coordinate c1 = new Coordinate(12.4,22);
	Coordinate c2 = new Coordinate(0,0);
	Coordinate c3 = new Coordinate(4,0);
	Coordinate c4 = new Coordinate(4,3);
	Coordinate c5 = new Coordinate(50,0);
	Coordinate c6 = new Coordinate(50,50);
	Triangle t0 = new Triangle(c2,c3,c4);
	Triangle t2 = new Triangle(1,1,2,2,3,3);
	System.out.println(t2.toString());
	//can also say Triangle(new Coordinate(x,y)etc.)
	Triangle t1 = new Triangle(c2,c5,c6);
	//Triangle object testing stuff
	System.out.println(t1.toString());
	System.out.println(t0.getPerimeter());
	System.out.println(t0.getArea());
	System.out.println(t1.getArea());
	System.out.println(t0.isRight());
	System.out.println(t1.isRight());
	System.out.println(Math.PI);

	//coordinate object testing stuff
	/*
	c.printCoordinate();
	c1.printCoordinate();
	System.out.println(c1.getY());
	System.out.println(c1.getX());
	System.out.println(c1.toString());
	System.out.println(c1.distToOrigin());
	c1.setX(3);
	c1.setY(4);
	c1.printCoordinate();
	System.out.println(c1.dist(c));
	*/
    }
}
