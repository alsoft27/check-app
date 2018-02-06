package com.alsoft27.checkapp.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class App implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7529835043718623112L;

	@Id
	private String nameApp;
	
	private String url;
}
