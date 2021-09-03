package com.movie.archive.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.movie.archive.desc.Movie;
import com.movie.archive.service.MovieService;

@RestController
@Component
public class MovieController {
	@Autowired
	MovieService movieService;
	@GetMapping(value = "/getRandomMovieByRuntime/{size}/{runtime}", produces = "application/json")
	public List<Movie> getAllMovies(@PathVariable("size") Integer size, @PathVariable("runtime") Integer runtime){
		return movieService.getRandomMovieByRuntime(size, runtime);
		
	}
	
	
	
	@GetMapping(value = "/ping")
	public String Ping() {
		return "Alive";
	}
}
