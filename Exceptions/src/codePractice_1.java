import java.util.InputMismatchException;
import java.util.Scanner;

public class codePractice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Question1");
		System.out.println("Enter a number");
		String userInput = scanner.next();

		try {
			int number = Integer.parseInt(userInput);
			System.out.println("You entered a number. The square is" + (number * number));
		} catch (NumberFormatException ex) {
			System.out.println("You didn't enter a number");
		}

		System.out.println("Question2");

		try {
			System.out.println("Enter a number");
			int number = scanner.nextInt();
			System.out.println("You entered a number. The square is" + (number * number));
		} catch (InputMismatchException ex) {
			System.out.println("You didn't enter a number");
		}

		System.out.println("Question3");
		int flag = 0;
		do {
			System.out.println("Enter a number");
			String input = scanner.next();
			try {
				int validNum = Integer.parseInt(input);
				flag = 1;
				System.out.println("You entered a valid number: " + validNum);
				break;
			} catch (NumberFormatException ex) {
				System.out.println("You didn't enter a number");
			}

		} while (flag == 0);

		System.out.println("Question 4");

		// Question 4
				System.out.println("Enter a number between 1 and 10.");
				int number = scanner.nextInt();
				try{
				if (number < 1) {
					throw new IllegalArgumentException("Number cannot be less than 1.");
				} else if (number > 10) {
					throw new IllegalArgumentException("Number cannot be greater than 10.");
				}
				
				}catch (IllegalArgumentException ex){
					System.out.println(ex.getMessage());
				}
					
				scanner.close();
		System.out.println("Goodbye!");
	}

}
