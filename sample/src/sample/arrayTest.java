package sample;

public class arrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array1 = {1,2,22,50,10,63,15};
		int i=0;
		for(i=0;i<8;i++)
			System.out.println(array1[i]);
		
		
		int[] arrayInt = new int[]{1,2,3,4,5};
		int sum = getadd(int[]arrayInt);
		System.out.println("Sum Of all Integers: "+ sum);
		
		}
	
	public  int getadd(int[] a)
	{
		int sum = 0;
		for(int i : a)
			return sum += i;
		//System.out.println(sum);
	
	}
	

}
