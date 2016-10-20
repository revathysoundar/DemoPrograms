package movielab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class MovieDaoTest {
	
	MovieDaoImpl dao = new MovieDaoImpl();
	
	@Test
	public void allMoviesShouldReturn10Movies(){
		
		Assert.assertEquals(10, dao.getAllMovies().size());
	}

	@Test
	public void theFirstMovieIsAliens(){
		
		List<Movie> movies = dao.getAllMovies();
		Movie firstMovie = movies.get(0);
		Assert.assertEquals("scifi",firstMovie.getCategory());
		Assert.assertEquals("Alien", firstMovie.getTitle());
	}
	
	@Test
	public void whenScifiExpect3Titles()
	{
		List<Movie> movie = new ArrayList<Movie>() ;
		Arrays.asList("Alien, scifi","Aliens, scifi","Prometheus,scifi");
		List<Movie> movieByCat = dao.getMoviesByCategory("scifi");
		Assert.assertEquals(movie,movieByCat);
		
	}
	
}
