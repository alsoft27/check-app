package com.alsoft27.checkapp;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alsoft27.checkapp.dto.Info;
import com.alsoft27.checkapp.port.InfoPort;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CheckAppApplicationTests {

	@Autowired
	private InfoPort infoPort;
	
	@Test
	@Ignore
	public void contextLoads() {
		Info res = infoPort.checkInfo("http://localhost:8080/info");
		System.out.println("res---> "+res.toString());
	}

}
