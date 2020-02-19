package com.mindtree.searchservice.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "producer")
public class Producer {
    @Id
    private String id;

    @Indexed
    private String name;

    private String address;

    @DBRef
    private List<Movie> movies;
}