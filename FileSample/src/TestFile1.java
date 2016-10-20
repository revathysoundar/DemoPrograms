import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestFile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = System.getProperty("user.home");
		System.out.println("Your home directory is " + str);
		Path folderPath = Paths.get(str);
		if(Files.exists(folderPath) && Files.isDirectory(folderPath))
		{
			try
			{
				DirectoryStream<Path> dirStream = Files.newDirectoryStream(folderPath);
				for(Path p : dirStream)
				{
					if(Files.isDirectory(p))
						System.out.println(p.getFileName());
				}
			}
		}
		

	}

}
