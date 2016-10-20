import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		Student firstStudent = new Student();
		
		firstStudent.name = "Roshan";
	
		firstStudent.favfood = "Pizza";
		firstStudent.age = 103;
		
		System.out.println(firstStudent.name);
		System.out.println(firstStudent.favfood);
		
		Student secondStudent = new Student();
		secondStudent.name = "Hasini";
		secondStudent.favfood = "Popcorn Chicken";
		
		
		System.out.println(secondStudent.name);
		System.out.println(secondStudent.favfood);
		
		firstStudent.print();
		
		
		
		
		scanner.close();
		

	}

}
