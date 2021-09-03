package com.movie.archive.desc;

import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


@Data
@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {

	@Id //1
	private String _id;
	@Field //2
	private String plot;
	@Field //3
	private List<String> genres;
	@Field //4
	private Integer runtime;
	@Field //5
	private String rated;
	@Field //6
	private List<String> cast;
	@Field //7
	private Integer num_mflix_comments; 
	@Field //8
	private String poster;
	@Field //9
	private String title;
	@Field //10
	private String fullplot;
	@Field //11
	private List<String> languages;
	@Field //12
	private Date released; 
	@Field //13
	private List<String> directors;
	@Field //14
	private List<String> writers;
	@Field //15
	private Award awards; 
	@Field //16
	private String lastupdated;
	@Field //17
	private Integer year;
	@Field //18
	private IMDB imdb;
	@Field //19
	private List<String> countries;
	@Field //20
	private String type;
	@Field //21
	private Tomatoes tomatoes; 
}	
