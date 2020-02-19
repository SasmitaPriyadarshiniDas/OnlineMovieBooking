/*
 * package com.mindtree.searchservice.service;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service; import
 * org.springframework.transaction.annotation.Transactional;
 * 
 * import com.mindtree.searchservice.model.MovieRequest; import
 * com.mindtree.searchservice.mongo.model.MovieDocs; import
 * com.mindtree.searchservice.mongo.repository.SearchRepository;
 * 
 * @Service public class MovieMongoServiceImpl implements MovieMongoService {
 * 
 * @Autowired private SearchRepository searchRepository;
 * 
 * @Override
 * 
 * @Transactional(readOnly = false) public MovieDocs
 * saveMovieDetails(MovieRequest movieRequest) { MovieDocs movie = new
 * MovieDocs(); // (Movie) //
 * SecurityContextHolder.getContext().getAuthentication().getPrincipal();
 * movie.setName(movieRequest.getMovieName());
 * movie.setDescription(movieRequest.getDescription());
 * movie.setImageUrl(movieRequest.getPoster());
 * movie.setPrice(movieRequest.getPrice());
 * movie.setPublicationDate(movieRequest.getReleaseDate());
 * movie.setCreatedAt(movieRequest.getCreatedAt()); return
 * searchRepository.save(movie); }
 * 
 * @Override
 * 
 * @Transactional(readOnly = true) public MovieDocs findByName(String moviename)
 * { MovieDocs movie = searchRepository.findByName(moviename); return movie; }
 * 
 * }
 */