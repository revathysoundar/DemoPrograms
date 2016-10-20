package movielab2;

import java.util.ArrayList;

/*
 *Responsibility: To provide access to all the movies. 
 */
import java.util.List;

public class MovieDaoImpl implements MovieDao{
	private ArrayList<Movie> movies = new ArrayList<Movie>();
	
	public MovieDaoImpl()
	{
		movies.add(new Movie("Alien", "scifi"));
		movies.add(new Movie("Aliens", "scifi"));
		movies.add(new Movie("Prometheus", "scifi"));
		movies.add(new Movie("Airplane", "comedy"));
		movies.add(new Movie("Planes, Trains, and Automobiles", "comedy"));
		movies.add(new Movie("Nightmare on Elm Street", "horror"));
		movies.add(new Movie("Friday the 13th", "horror"));
		movies.add(new Movie("Child's Play", "horror"));
		movies.add(new Movie("Avengers", "action"));
		movies.add(new Movie("Captain America", "action"));
	}
	
	/*
	 * Get all the movies from the array list.. every single one.
	 */
	@Override
	public List<Movie> getAllMovies()
	{
		return movies;		 
	}
		
	@Override
	public List<Movie> getMoviesByCategory(String cat){
		
		ArrayList<Movie> newList = new ArrayList<Movie>();
		
		for (Movie m : movies) {
			if (m.getCategory().equals(cat)) {
				newList.add(m);
				
			}
		}
		return newList;
	}
		

}
