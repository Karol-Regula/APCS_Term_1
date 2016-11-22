public class Coordinate{
    private double x;
    private double y;

    //default constuctor
    public Coordinate(){
	x = 0;
	y = 0;
    }//these values would be zero anyway, initialized as zero
    //value taking constuctor
    public Coordinate(double Xcor, double Ycor){
	x = Xcor;
	y = Ycor;
	//can use setX and setY in here
    }
    //methods
    public void printCoordinate(){
	System.out.println("Xcor: "+x);
	System.out.println("Ycor: "+y);
    }
    public double getX(){
	return x;
    }
    public double getY(){
	return y;
    }
    public String toString(){
	return("("+x+","+y+")");
    }
    public double distToOrigin(){
	return(Math.sqrt((x*x)+(y*y))); 
    }
    public void setX(double value){
	x=value;
    }
    public void setY(double value){
	y=value;
    }
    //sligthly broken
    
    public double dist(Coordinate other){
	return (Math.sqrt(
		(Math.pow(x-other.x,2)) + 
		(Math.pow(y-other.y,2))));
    }
    
    //can use 2 numbers for dist, instead of point
    //distance from c.dist(<values in here (xy))
}
