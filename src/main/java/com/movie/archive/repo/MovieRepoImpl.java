package com.movie.archive.repo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

import com.movie.archive.desc.Movie;

//Impl must implement parent interface 
@Service
public class MovieRepoImpl implements MovieRepo {
	@Autowired
	//Literal connection to database - variable executes aggregate (LIVE for this variable)
	public MongoTemplate mongoTemplate;
	@Override
	public List<Movie> getRandomMovieByRuntime(Integer size, Integer runtime) {
		
		//Aggregation Operations will be placed in agg. list 
		List<AggregationOperation> aggregations = new ArrayList<AggregationOperation>();
		//returns match operation - Creates a new MatchOperation using the given Criteria.
		aggregations.add(Aggregation.match(Criteria.where("runtime").is(runtime)));
		//AGGREGATIONS WORK AS A PIPELINE -- THE ORDER MATTERS
		aggregations.add(Aggregation.sample(size));
		
		//Grabbing mongo template, passing it your list of operations, passing it the collection you are querying, passing it
		//type that it should return (a List of Movies)Movie
		List<Movie> movies = mongoTemplate.aggregate(Aggregation.newAggregation(aggregations), 
				"movies", 
				Movie.class).getMappedResults(/*Returns List*/);

		//query.addCriteria(new Criteria().where("runtime").is(runtime));
		return movies;
	}

}
