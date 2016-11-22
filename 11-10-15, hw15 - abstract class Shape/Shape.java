public abstract class Shape{
    private String color;
    private boolean filled;
    
    public Shape(){
	this("blue", true);
    }
    public Shape(String whatColor, boolean fill){
	color = whatColor;
	filled = fill;
    }
    
    public String getColor(){
	return color;
    }
    
    public void setColor(String whatColor){
	color = whatColor;
    }
    
    public boolean isFilled(){
	return filled;
    }
    
    public void setFilled(boolean fill){
	filled = fill;
    }
    
    public double getSemiperimeter(){
	return getPerimeter()/2;
    }

    public String toString(){
        String fill = "";
	if (isFilled()){
	    fill = "filled.";
	}else{
	    fill = "not filled.";   
	}
	return "a shape with color of "+getColor()+" and is "+fill;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

}
