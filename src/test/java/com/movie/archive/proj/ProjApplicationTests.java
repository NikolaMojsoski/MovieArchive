package com.movie.archive.proj;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
public class ProjApplicationTests {

		@Autowired
		private WebTestClient webTestClient;
		
}
