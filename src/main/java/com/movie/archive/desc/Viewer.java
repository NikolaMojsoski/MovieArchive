package com.movie.archive.desc;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
//POJO for viewer account of Rotten Tomatoes

@Data
public class Viewer{
	@Field
	private Double rating;
	@Field
	private Integer numReviews;
	@Field
	private Integer meter;
}
