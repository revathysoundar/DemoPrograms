import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayOfNumbers = new int[4];
		int[] otherArray;
		otherArray = arrayOfNumbers;
		System.out.println(arrayOfNumbers[0]);
		System.out.println(otherArray[1]);
		double[] prices = {13.2,14.6,15.8};
		
		String[] stuNames = {"john","Chris","sam","thomas"};
		
		double sum1 = 0.0;
		for (int i =0; i< prices.length; i++)
		{
			sum1 += prices[i];
			
		}
		
		for ( double price : prices)
		{
			System.out.println("price:"+ price);
			System.out.println("sum"+sum1);
			
			
		}
		
		for (int i = 0; i < stuNames.length; i++)
		{
			System.out.println(stuNames[i]);
		}
		
		System.out.println("List of Students");
		
		for (int i = 0; i < stuNames.length; i++)
		{
			System.out.println((i+1)  + ". " + stuNames[i]);
		}
		
		for(String names : stuNames)
		{
			System.out.println(names);
		}
		
		
		int [] arrayNum = new int[6];
		int [] arrayNum2 = arrayNum;
		
		Arrays.fill(arrayNum, 0,3,1);          //startindex, end index, value to fill in the place
		System.out.println(Arrays.equals(arrayNum,  arrayNum2));
		int [] array3 = Arrays.copyOf(arrayNum2, arrayNum.length);
		for(int i=0; i < array3.length; i++)
		{
			System.out.println(array3[i]) ;
		}
		for(int i=0; i < arrayNum2.length; i++)
		{
			arrayNum2[i] = 1;
		}
		
		System.out.println( arrayNum == arrayNum2); // Reference type cannot use ==
		char [][] board = new char[3][3];
		for(int y = 0; y < 3; y++)
		{
		
			for(int x = 0; x < 3 ; x++)
			{
				
				board[x][y]='_';
			}
		}
		
		
		
		for(int y = 0; y < 3; y++)
		{
		
			for(int x = 0; x < 3 ; x++)
			{
				System.out.print(board[x][y]);
				System.out.print(' ');
			}
			System.out.println();
		}
		
		
		
		

	}

}
