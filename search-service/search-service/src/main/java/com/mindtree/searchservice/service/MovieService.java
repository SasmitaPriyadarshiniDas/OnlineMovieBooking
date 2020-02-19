package com.mindtree.searchservice.service;

import java.util.List;

import com.mindtree.searchservice.model.Movie;
import com.mindtree.searchservice.model.MovieRequest;

public interface MovieService {

	public Movie loadMovieDetails(MovieRequest movieRequest);

	public Movie loadByName(String moviename);
	
	public List<Movie> findAll();

}
