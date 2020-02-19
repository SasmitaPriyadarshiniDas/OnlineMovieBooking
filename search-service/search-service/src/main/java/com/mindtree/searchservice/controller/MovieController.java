package com.mindtree.searchservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.searchservice.model.Movie;
import com.mindtree.searchservice.model.MovieRequest;
import com.mindtree.searchservice.service.MovieServiceImpl;


@RestController
public class MovieController {
	


	@Autowired
	private MovieServiceImpl movieService;

	@GetMapping("/ping")
	public String home() {
		return "welcome to mindtree";
	}

	@PostMapping("/movie")
	public ResponseEntity<Movie> createNewMovie(@RequestBody MovieRequest request) {

		movieService.loadMovieDetails(request);
		return new ResponseEntity<Movie>(HttpStatus.OK);

	}
	
	@GetMapping("/movie/{movieName}")
	public Movie viewMovie(@PathVariable String movieName) throws Exception {
		Movie movie  = movieService.loadByName(movieName);
		return movie;
		
	}
	
	@GetMapping("/movie/All")
	public List<Movie> viewAllMovie()throws Exception {
		return movieService.findAll();
		
	}
	
	

	

}
