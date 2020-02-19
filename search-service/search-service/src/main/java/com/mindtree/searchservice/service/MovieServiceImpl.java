package com.mindtree.searchservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.searchservice.model.Movie;
import com.mindtree.searchservice.model.MovieRequest;
import com.mindtree.searchservice.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;

	@Override
	@Transactional(readOnly = false)
	public Movie loadMovieDetails(MovieRequest movieRequest) {
		Movie movie = new Movie();
		// (Movie)
		// SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		movie.setName(movieRequest.getMovieName());
		movie.setDescription(movieRequest.getDescription());
		movie.setPoster(movieRequest.getPoster());
		movie.setPrice(movieRequest.getPrice());
		movie.setReleaseDate(movieRequest.getReleaseDate());
		movie.setCreatedAt(movieRequest.getCreatedAt());
		movie.setActors(movieRequest.getActors());
		movie.setActress(movieRequest.getActress());
		movie.setDirector(movieRequest.getDirector());
		movie.setOldMovie(movieRequest.getOldMovie());
		movie.setNewMovie(movieRequest.getNewMovie());
		movie.setProducer(movieRequest.getProducer());
		movie.setRoles(movieRequest.getRoles());

		return movieRepository.save(movie);
	}

	@Override
	@Transactional(readOnly = true)
	public Movie loadByName(String moviename) {

		Movie movie = movieRepository.findByName(moviename);
		System.out.println(movie.getName());

		return movie;

	}

	@Override
	@Transactional(readOnly = true)
	public List<Movie> findAll() {
		List<Movie> movies = movieRepository.findAll();
		return movies;
	}
}
