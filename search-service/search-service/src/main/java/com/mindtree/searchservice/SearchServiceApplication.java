package com.mindtree.searchservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableMongoRepositories(basePackages= {"com.mindtree.searchservice.mongo.repository"})
@EnableMongoRepositories(basePackages= {"com.mindtree.searchservice.repository"})
@ComponentScan(basePackages= {"com.mindtree.searchservice.*"})
public class SearchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchServiceApplication.class, args);
		System.out.println("Search service");
	}

}
