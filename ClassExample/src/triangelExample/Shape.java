package triangelExample;

import javax.naming.OperationNotSupportedException;

public class Shape {
	
	private int centerX;
	private int centerY;
	public Shape(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	public Shape()
	{
		
	}
	public int getCenterX() {
		return centerX;
	}
	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}
	public int getCenterY() {
		return centerY;
	}
	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}
	public double getArea()
	{
		return 0.0;
	}
	

}
