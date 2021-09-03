package com.movie.archive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.archive.desc.Movie;
import com.movie.archive.repo.MovieRepo;

@Service
public class MovieService {
	@Autowired
	MovieRepo movieRepo;
	public List<Movie> getRandomMovieByRuntime(Integer size, Integer runtime){
		return movieRepo.getRandomMovieByRuntime(size, runtime);
	}
}