package com.alsoft27.checkapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alsoft27.checkapp.dto.Info;
import com.alsoft27.checkapp.entity.App;
import com.alsoft27.checkapp.service.AppService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CheckAppApplicationTests {

	@Autowired
	private AppService appService;
	
	@Test
	public void testApp() {
		App app = new App("test", "http://localhost:8080/info");
		appService.save(app);
		Info res = appService.checkApp("test");
		System.out.println("res---> "+res.toString());
	}

}
