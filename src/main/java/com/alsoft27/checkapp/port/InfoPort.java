package com.alsoft27.checkapp.port;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.alsoft27.checkapp.dto.Info;

@Component
public class InfoPort {

	@Autowired
	private RestTemplate restTemplate;
	
	public Info checkInfo(String url) {
		ResponseEntity<Info> res = restTemplate.getForEntity(url, Info.class);
		return res.getBody();
	}
}
