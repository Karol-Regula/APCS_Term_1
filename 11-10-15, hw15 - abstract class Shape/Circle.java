public class Circle extends Shape{
    private double radius;
    
    public Circle(){
	this(1.0);
    }
    
    public Circle(double whatRadius){
	super();
	radius = whatRadius;
    }

    public double getRadius(){
	return radius;
    }
    
    public void setRadius(double whatRadius){
	radius = whatRadius;
    }

    public double getArea(){
	return Math.PI * (Math.pow(getRadius(), 2));
    }

    public double getPerimeter(){
	return 2 * Math.PI * getRadius();
    }

    public String toString(){
	return "A Circle with radius = "+getRadius()+", which is a subclass of "+super.toString(); 
    }   
}
