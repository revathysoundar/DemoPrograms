package assessmentPart2;

public class LowestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {100,56,22,50,10,63,15};
		int i = 1;
		int min = array1[0];
		while(i < array1.length)
		{
			if(array1[i] < min)
			{
				min = array1[i];
			}
			i++;
		}
		System.out.println(min);
		
		

	}

}
