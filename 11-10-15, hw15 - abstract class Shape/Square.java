public class Square extends Rectangle{
    
    public Square(){
	super();
    }

    public Square(double side){
	super(side,side);
    }

    public void setLength(double whatLength){
	super.setLength(whatLength);
	super.setWidth(whatLength);
    }

    public void setWidth(double whatWidth){
	super.setWidth(whatWidth);
	super.setLength(whatWidth);
    }

    public double getArea(){
	return Math.pow(getLength(),2);
    }

    public double getPerimeter(){
	return getLength() * 4;
    }

    public String toString(){
	return "A Square with a side = "+getLength()+", which is a subclass of "+super.toString();
    }
}
