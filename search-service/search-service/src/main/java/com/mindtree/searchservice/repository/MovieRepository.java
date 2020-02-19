package com.mindtree.searchservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mindtree.searchservice.model.Movie;

public interface MovieRepository extends MongoRepository<Movie, String> {

	public Movie findByName(String name);
	
	public List<Movie> findAll();

}
