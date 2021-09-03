package com.movie.archive.desc;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
//POJO for imdb

@Data
public class IMDB {
	@Field
	private Double rating;
	@Field
	private Integer votes;
	@Field
	private Integer id; 
}
