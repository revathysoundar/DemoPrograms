package FileExample;
import java.io.File;
import java.util.Scanner;
public class FileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		File.createTempFile("Hello", "txt");
		
		
		sc.close();
	}

}
