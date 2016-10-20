package triangelExample;

import java.util.ArrayList;
import java.util.Scanner;

public class TriangleApp {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Shape> list = new ArrayList<>();
		list.add(new Triangle(20.0,4.0) );
		list.add(new Circle(40.0));
		
		for(Shape shape : list)
		{
			System.out.println(shape);
			System.out.println("area = " + shape.getArea());
		}
		
		
		Triangle originalTriangle = new Triangle();
		originalTriangle.base = 10.0;
		originalTriangle.height = 5.0;
		System.out.println(originalTriangle.getArea());
		
		Triangle[] triangleArray = new Triangle[3] ;
		triangleArray[0] = new Triangle(10.0, 3.0); 
		triangleArray[1] = new Triangle(10.0, 4.5); 
		triangleArray[2] = new Triangle(10.0, 8.0); 
		
		for(Triangle triangle : triangleArray)
		{
			System.out.println("toString: " + triangle.toString());
			System.out.println("Area: "+ triangle.getArea());
		}
		
		for(int i = 0; i < triangleArray.length; i++)
		{
			Triangle triangle = triangleArray[i];
			triangle.setBase(20.0);
		}
		
			
		
		
		System.out.println(Triangle.getCombinedArea(triangleArray[0], triangleArray[2]));
		
		
		
		sc.close();
	}

}
