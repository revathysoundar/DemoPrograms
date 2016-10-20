import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Do something");
		Scanner sc=new Scanner(System.in);
		
		String choice = "yes";
			
			
			while(true){
				
				System.out.println("Do you want to continue");
				 choice=sc.next();
				 if (choice.equalsIgnoreCase("yes"))
				 {
				System.out.println("Do something again");
				 }
				 else
				 {
					 break;
				 }
				
		}
			System.out.println("stop");
		
		 sc.close();
		
		

	}

}
