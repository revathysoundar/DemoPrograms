package triangelExample;

public class Circle extends Shape {
	
	private double radius;

	public Circle(int centerX, int centerY, double radius) {
		super(centerX, centerY);
		this.radius = radius;
	}
	public Circle(double radius)
	{
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	public double getArea()
	{
		return Math.PI * radius * radius;
	}
	

}
