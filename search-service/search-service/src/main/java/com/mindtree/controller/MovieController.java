package com.mindtree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.model.Movie;
import com.mindtree.model.MovieRequest;

import com.mindtree.service.MovieServiceImpl;

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
	
	
	
	

}
