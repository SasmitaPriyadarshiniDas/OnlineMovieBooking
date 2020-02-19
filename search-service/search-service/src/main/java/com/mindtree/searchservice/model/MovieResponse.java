package com.mindtree.searchservice.model;

public class MovieResponse {
	
	private String movieName;
	/*
	 * private String description; private Double price; private String poster;
	 * private LocalDate releaseDate; private LocalDate createdAt; private String
	 * oldMovie; private String newMovie; private String actors; private String
	 * actress; private String producer; private String director;
	 */
	
	public MovieResponse(Movie response) {
		
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


}
