import java.util.Scanner;
import java.lang.String;

public class For_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Program to print numbers 0 thru 9
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<=9 ; i++)
		{
			System.out.println(i);
		}
		
		
		// Program to print Hello World 10 times
		
		System.out.println("Program to print Hello World 10 times");
		
		for (int i=1; i<=10 ; i++)
		{
			System.out.println("Hello World");
		}
		
		// Program to print numbers 1 thru 10
		
		System.out.println("Program to print1 thru 10");
				for (int i=1; i<=10 ; i++)
				{
					System.out.println(i);
				}
				// While Loop to print a message as long as user says "y"
				
				String userInput;
			
			do {
				System.out.println("Blah, Blah Blah");
				System.out.println("Would You Like To To Continue?");
				userInput = sc.nextLine();
			} while (userInput.equals("y"));
			
		//Program to print alphabets from H thru Z 
			
			char ch  = 'H';
			
			do
			{
				 
				System.out.println(ch);
				ch = (char) (ch + 1);
				
			}while(ch != 'Z');
			
			System.out.println("Number" + "\t" + "Squared" + "\t" + "Cubes");
			sc.close();	
	}

}
