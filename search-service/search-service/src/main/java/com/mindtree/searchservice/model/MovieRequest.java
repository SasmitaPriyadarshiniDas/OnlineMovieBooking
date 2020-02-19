package com.mindtree.searchservice.model;

import java.time.LocalDate;
import java.util.Set;


public class MovieRequest {

	private String movieName;
	private String description;
	private Double price;
	private String poster;
	private LocalDate releaseDate;
	private LocalDate createdAt;
	private String oldMovie;
	private String newMovie;
	private String actors;
	private String actress;
	private String producer;
	private String director;
	
	private Set<Role> roles;
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getOldMovie() {
		return oldMovie;
	}
	public void setOldMovie(String oldMovie) {
		this.oldMovie = oldMovie;
	}
	public String getNewMovie() {
		return newMovie;
	}
	public void setNewMovie(String newMovie) {
		this.newMovie = newMovie;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	public String getActress() {
		return actress;
	}
	public void setActress(String actress) {
		this.actress = actress;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	
	@Override
	public String toString() {
		return "MovieRequest [movieName=" + movieName + ", description=" + description + ", price=" + price
				+ ", poster=" + poster + ", releaseDate=" + releaseDate + ", createdAt=" + createdAt + ", oldMovie="
				+ oldMovie + ", newMovie=" + newMovie + ", actors=" + actors + ", actress=" + actress + ", producer="
				+ producer + ", director=" + director + ", roles=" + roles + ", getMovieName()=" + getMovieName()
				+ ", getDescription()=" + getDescription() + ", getPrice()=" + getPrice() + ", getCreatedAt()="
				+ getCreatedAt() + ", getPoster()=" + getPoster() + ", getReleaseDate()=" + getReleaseDate()
				+ ", getOldMovie()=" + getOldMovie() + ", getNewMovie()=" + getNewMovie() + ", getActors()="
				+ getActors() + ", getActress()=" + getActress() + ", getProducer()=" + getProducer()
				+ ", getDirector()=" + getDirector() + ", getRoles()=" + getRoles() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
