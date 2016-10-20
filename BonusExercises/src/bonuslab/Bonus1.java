package bonuslab;

import java.util.Scanner;

public class Bonus1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Letter Grade Converter!");
		String choice;
		do
		{
		System.out.println("Enter a numerical grade:");
		int marks = sc.nextInt();
		String grade="";
		
		if(marks <= 88 && marks >= 100 )
			grade = "A";
		else if(marks <= 87 && marks >= 80)
			grade = "B";
		else if(marks <= 79 && marks >= 67)
			grade = "C";
		else if(marks <= 66 && marks >= 60)
			grade = "D";
		else if(marks <= 60 && marks >=0)
			grade = "F";
		
		if(marks == 99 ||  marks == 100)
			grade = "A+";
		else if (marks == 86 || marks == 87)
			grade = "B+";
		else if(marks == 78 || marks == 79)
			grade = "C+";
		else if(marks == 65 || marks == 66)
			grade = "D+";
		else if(marks < 45)
			grade = "F-";
		
		System.out.println("Letter Grade:  " + grade);
		System.out.println("Do you want to continue? (y/n)");
		 choice = sc.next();
	}while(choice.equalsIgnoreCase("y"));
			
		sc.close();
		
		
		
		
		

	}

}
