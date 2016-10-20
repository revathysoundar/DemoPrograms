package assessmentPart2;


public class ArrayInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayInt = new int[]{1,2,3,4,5};
		int sum = getSum(arrayInt);
		System.out.println("Sum Of all Integers: "+ sum);
		
		}
	
	public static int getSum(int[] a)
	{
		int sum = 0;
		for(int i : a)
			
			sum= sum + i;
		return sum;
	}

}
