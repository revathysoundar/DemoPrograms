package bonuslab;

import java.util.Scanner;

public class Bonus3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Guess a Number Game!");
		System.out.println("++++++++++++++++++++++++++++++++++++");
		String ch = "y";
		while(ch.equalsIgnoreCase("y"))
		{
			System.out.println("I'm thinking of a number between 1 and 100.");
			System.out.println("Try to guess it, n00b");
			System.out.println("Enter your lousy guess:");
			int userGuess = sc.nextInt();
			int count = 0;
			int random = (int) (Math.random() * 100);
			if(userGuess == random)
			{
				System.out.println("You got it");
			}
			else if((userGuess + 10) == random )
			System.out.println("Try Again? (y/n):");
			ch = sc.next();
		}
		sc.close();

	}

}
