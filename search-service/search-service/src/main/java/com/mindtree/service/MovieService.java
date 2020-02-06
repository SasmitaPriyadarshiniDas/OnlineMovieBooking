package com.mindtree.service;

import com.mindtree.model.Movie;
import com.mindtree.model.MovieRequest;

public interface MovieService {

	public Movie loadMovieDetails(MovieRequest movieRequest);

}
