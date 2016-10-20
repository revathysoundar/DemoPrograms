/*

 * Source Material (c) 2016 GCD
 * All rights reserved
 */
package co.grandcircus.movies.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.grandcircus.movies.dao.MovieDao;
import co.grandcircus.movies.model.Movie;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/movies")
public class MovieController {
	
	private static final Logger logger = LoggerFactory.getLogger(MovieController.class);
	
	@Autowired
	private MovieDao movieDao;
	
	/**
	 * List all movies
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String listMovies(Model model) {
		model.addAttribute("movies", movieDao.getAllMovies());

		System.out.println("/movies -> movie-list.jsp");
		return "movie-list";
	}
	
	/**
	 * Display one movie
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String displayMovie(@PathVariable int id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("movie", movieDao.getMovie(id));

		System.out.println("GET /movies/" + id + " -> movie.jsp");
		return "movie";
	}
	
	/**
	 * Save one movie
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public String saveMovie(@PathVariable int id, Movie movie, Model model) {
		movieDao.updateMovie(id, movie);
		model.addAttribute("id", id);
		model.addAttribute("movie", movie);
		
		System.out.println("POST /movies/" + id + " -> movie.jsp");
		return "movie";
	}
	
	/**
	 * Delete one movie
	 */
	@RequestMapping(value = "/{id}/delete", method = RequestMethod.POST)
	public String deleteMovie(@PathVariable int id, Model model) {
		movieDao.deleteMovie(id);
		model.asMap().clear();
		
		System.out.println("POST /movies/" + id + "/delete -> redirect to /movies");
		return "redirect:/movies";
	}
	
	/**
	 * Display one movie
	 */
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String createMovieForm(Model model) {
		model.addAttribute("movie", new Movie());
		
		System.out.println("GET /movies/create -> movie-create.jsp");
		return "movie-create";
	}
	
	/**
	 * Save new movie
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createMovie(Movie movie, Model model) {
		movieDao.addMovie(movie);
		model.asMap().clear();
		
		System.out.println("GET /movies/create -> redirect to /movies");
		return "redirect:/movies";
	}
	
}
