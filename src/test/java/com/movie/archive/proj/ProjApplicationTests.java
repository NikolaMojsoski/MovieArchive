package com.movie.archive.proj;

import java.util.ArrayList;
import java.util.List;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import com.movie.archive.desc.Movie;
import com.movie.archive.service.MovieService;
import org.junit.Assert;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureWebTestClient(timeout = "5000000")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProjApplicationTests {
	
	@Autowired
	public WebTestClient webTestClient;
	
	@MockBean
	MovieService movieService;
	
	@Test
	public void getRandomMovies() {
		Integer testedMovies = 2; 
		Integer testedRuntime = 1;
		List<Movie> testedResults = new ArrayList<Movie>();
		
			Mockito.when(this.movieService.getRandomMovieByRuntime(testedMovies, testedRuntime)).
					thenReturn(testedResults); //pulls list of movies based on params
	
			
			Assert.assertEquals(testedResults.size() + "", testedMovies.toString());
			
			for (int i = 0; i < testedResults.size(); i++) {
				Movie movie = testedResults.get(i);
				Assert.assertEquals(testedRuntime, movie.getRuntime());
			}
	}
}