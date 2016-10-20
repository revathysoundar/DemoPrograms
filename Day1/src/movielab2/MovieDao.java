package movielab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public interface MovieDao {
	
	List<Movie> getAllMovies();
	
	List<Movie> getMoviesByCategory(String s);
	
	/*Set<String> getAllCategories();
	
	boolean isValidCategory(String category);*/

}