package com.alsoft27.checkapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Build {

	private String groupId;
	
	private String artifact;
	
	private String name;
	
	private String version;
}
