package triangelExample;

public class Triangle extends Shape{
	
	
	public static final int NO_OF_SIDES = 3;
	public double base;
	public double height;
	
	public Triangle()
	{
		
	}
	public Triangle(double x, double y)
	{
		this.base = x;
		this.height = y;
	}
	public double getBase()
	{
		return base;
	}
	public double getHeight()
	{
		return height;
	}
	public void setBase(double base)
	{
		this.base = base;
		
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	public double getArea(){
		return base * height / 2;
	}
	
	public String toString(){
		return "Triangle(base=" + base + ",height=" + height +" )";
	}
	
	public static double getCombinedArea(Triangle a, Triangle b)
	{
		return a.getArea() + b.getArea();
	}
	

}
