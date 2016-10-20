package secondAssessment;

import java.util.Scanner;

public class TestMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		String reverse = stringReverse(str);
		System.out.println(reverse);
		System.out.println("Goodbye!");
		
		String string="abcdef";
	      String reverse1 = new StringBuffer(string).reverse().toString();
	      System.out.println("\nString before reverse:"+string);
	      System.out.println("String after reverse"+reverse1);
	      sc.close();


	}

	public static String stringReverse(String str)
	{
		char getChar = ' ';
		String reverse ="";
		
		for(int i = str.length(); i > 0; i--)
		{
			 getChar = str.charAt(i-1);
			 reverse = reverse + getChar;
		}
		
		return reverse;
	}
	
	
}
