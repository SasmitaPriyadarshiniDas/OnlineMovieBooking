package com.mindtree.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.model.Movie;
import com.mindtree.model.MovieRequest;
import com.mindtree.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;


	@Override
	@Transactional(readOnly = false)
	public Movie loadMovieDetails(MovieRequest movieRequest) {
		Movie movie = new Movie();
				//(Movie) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		movie.setName(movieRequest.getMovieName());
		movie.setDescription(movieRequest.getDescription());
		//movie.setCategory(movieRequest.getCategory());
		movie.setImageUrl(movieRequest.getImageUrl());
		movie.setPrice(movieRequest.getPrice());
		movie.setPublicationDate(movieRequest.getPublicationDate());
		movie.setCreatedAt(movieRequest.getCreatedAt());
		
		return movieRepository.save(movie);
	}

}
