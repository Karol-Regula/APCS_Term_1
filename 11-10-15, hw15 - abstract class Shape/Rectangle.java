public class Rectangle extends Shape{
    private double length;
    private double width;
    
    public Rectangle(){
	this(1.0,1.0);
    }
    
    public Rectangle(double whatLength, double whatWidth){
	super();
	length = whatLength;
	width = whatWidth;
    }
    
    public double getLength(){
	return length;
    }
    
    public double getWidth(){
	return width;
    }
    
    public void setLength(double whatLength){
	length = whatLength;
    }

    public void setWidth(double whatWidth){
	width = whatWidth;
    }

    public double getArea(){
	return getWidth() * getLength();
    }

    public double getPerimeter(){
	return (2 * getWidth()) + (2 * getLength());
    }
    
    public String toString(){
	return "A Rectangle with width = "+getWidth()+" and length = "+getLength()+" which is a subclass of "+super.toString();
    }
}
