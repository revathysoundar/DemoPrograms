package assessment3;

import java.util.Scanner;

public class PetShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		Animal d = new Dog();
		System.out.println("The dog says: "+d.greet(name));
		Animal p = new Parrot();
		System.out.println("The parrot says: "+p.greet(name)+"!");
		sc.close();
		
	}

}
