import java.io.IOException;


import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		try
		{
		RandomAccessFile in = new RandomAccessFile("C:/hello.txt","r");
		String line = in.readLine();
		}catch (IOException ex)
		{
			
		}
		
		
		
		System.out.println("Enter a number");
		
		try
		{
			int number = sc.nextInt();
			System.out.println("You entered: " + number);
			
		}catch (InputMismatchException ex)
		{
			System.out.println("You did not enter a number");
			
		}catch(NullPointerException ex)
		{
			System.out.println("Null Pointer");
		}
		
		System.out.println("Goodbye");
		
		sc.close();
		
		
		

	}

}
