import java.util.Scanner;

public class MyFirstProgram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scanner.nextLine();
		System.out.println("Please enter your width");
		int width = scanner.nextInt();
		int length = 10;
		
		//String word = "Hello World";
		//int width = 10;
		//int length = 12;
		int area = width * length;
		
		
		System.out.println(name);
		System.out.println(area);
	//	System.out.println("World");
		scanner.close();
		
	}

}
