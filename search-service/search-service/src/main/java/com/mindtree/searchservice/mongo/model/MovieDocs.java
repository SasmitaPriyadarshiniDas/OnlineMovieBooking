package com.mindtree.searchservice.mongo.model;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Document
@JsonIgnoreProperties(value = { "createdAt" }, allowGetters = true)
public class MovieDocs {
	
public MovieDocs() {
		
	}
	
	

	public MovieDocs(@NotNull @NotBlank @Size(min = 2, max = 100) String name, String description) {
		
		this.name = name;
		this.description = description;
		
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
	
	private String imageUrl;
	
	@Field("published")
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate publicationDate;

	@Field("createdAt")
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate createdAt;

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



	public String getImageUrl() {
		return imageUrl;
	}



	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}



	public LocalDate getPublicationDate() {
		return publicationDate;
	}



	public void setPublicationDate(LocalDate publicationDate) {
		this.publicationDate = publicationDate;
	}



	public LocalDate getCreatedAt() {
		return createdAt;
	}



	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	
	
	
	

}
