package com.mindtree.searchservice.model;

import java.time.LocalDate;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mindtree.searchservice.mongo.model.MovieDocs;


//@Document(indexName = "movieIndex", type = "movie")

@Document(collection="Movie")
@JsonIgnoreProperties(value = { "createdAt" }, allowGetters = true)
public class Movie {

	public Movie() {

	}

	public Movie(@NotNull @NotBlank @Size(min = 2, max = 100) String name, String description) {

		this.name = name;
		this.description = description;

	}

	public Movie(MovieDocs docs) {

	}

	@Id
	private ObjectId id;

	@NotNull
	@NotBlank
	@Size(min = 2, max = 100)
	private String name;

	@Field("description")
	private String description;

	@NotNull
	private Double price;

	private String poster;

	@Field("releaseDate")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate releaseDate;

	@Field("createdAt")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate createdAt;

	@NotNull
	private String oldMovie;

	@NotNull
	private String newMovie;

	@NotNull
	private String actors;

	@NotNull
	private String actress;

	@NotNull
	private String producer;

	@NotNull
	private String director;
	
	private Set<Role> roles;
	
	

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
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

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}
