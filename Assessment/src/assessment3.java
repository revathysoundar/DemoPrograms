
public class assessment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "hello";
		
		System.out.println(stringReverse(str));
		

	}
	
	public static String stringReverse(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		
		return sb.reverse().toString();
	}

}
