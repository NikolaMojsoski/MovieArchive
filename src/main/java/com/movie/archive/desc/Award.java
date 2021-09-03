package com.movie.archive.desc;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
//POJO for award

@Data
public class Award {
	@Field
	private Integer wins;
	@Field
	private Integer nominations;
	@Field
	private String text;
}
