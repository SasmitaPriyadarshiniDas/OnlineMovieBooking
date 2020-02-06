package com.mindtree.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.model.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String>{
	
	public Movie findByname(String name);
}
