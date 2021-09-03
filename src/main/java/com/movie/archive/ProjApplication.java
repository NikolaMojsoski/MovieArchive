package com.movie.archive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
//import com.movie.archive.controller.MovieController;
//import com.movie.archive.repo.MovieRepo;
//import com.movie.archive.service.MovieService;

@SpringBootApplication
//@ComponentScan(basePackageClasses = {MovieController.class, MovieService.class, MovieRepo.class})
public class ProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjApplication.class, args);
	}
}
