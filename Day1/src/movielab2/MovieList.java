package movielab2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/*
 * Responsibility: Run the application by interacting with the user via the console.
 */
public class MovieList {
	private static MovieDao movieDao = new MovieDaoImpl();
	
	public static void main(String[] args) {
		
		
		String choice = "y";
		Scanner scan = new Scanner(System.in);
		List<Movie> movies = movieDao.getAllMovies();
		//List<Movie> m = new ArrayList<Movie>();

		System.out.println("Welcome to Movie List Application!");

		while (choice.equalsIgnoreCase("y")) {
			System.out
					.println("Movies are listed by category: scifi, horror, comedy, action");
			System.out.print("What category are you interested in? ");
			String cat = scan.nextLine();
			movieDao.getMoviesByCategory(cat);
			if (cat.equals("scifi") || cat.equals("comedy")
					|| cat.equals("horror") || cat.equals("action")) {
				
				//System.out.println(count + " movies found in category " + cat);
				System.out.println();
			} else {
				System.out.println("Invalid category.");
			}

			System.out.print("Continue? (y/n) ");
			choice = scan.nextLine();
		}

		scan.close();
		System.out.println("Goodbye.");
	}

}

