package com.movie.archive.repo;

import java.util.List;

//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;
import com.movie.archive.desc.Movie;

@EnableMongoRepositories(basePackages = "com.movie.repo")
@Repository
public interface MovieRepo{
	
	//public List<Movie> findByTitle(String title);
	
	// DNW public List<Movie> findByRuntimes(List <int> runtime);
	 
	/** 
	 * 
	 * @param size
	 * @param runtime
	 * @return
	 */
	//Defines query execution params when method is run 
	//@Query("{'rated': ?0, 'year': ?1}")
	//public List<Movie> findByRatingAndByYear(String rated, int year);
	
	//Exchanges verbosity for greater query control, complexity
	//Defined method implemented to pull random movies by runtime, limited in scope
	
	public List<Movie> getRandomMovieByRuntime(Integer size, Integer runtime);
	
	//aggregate([{$match:{"runtime": {$gte: 1}}}, 
	//{$sample: {"size": 10}},
	//])
}
