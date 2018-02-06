package com.alsoft27.checkapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alsoft27.checkapp.dto.Info;
import com.alsoft27.checkapp.entity.App;
import com.alsoft27.checkapp.port.InfoPort;
import com.alsoft27.checkapp.repository.AppRepository;

@Service
public class AppService {

	@Autowired
	private AppRepository appRepository;
	
	@Autowired
	private InfoPort infoPort;
	
	public App save(App app) {
		return appRepository.save(app);
	}
	
	public App getApp(String name) {
		return appRepository.findById(name).get();
	}
	
	public Info checkApp(String nameApp) {
		Optional<App> app = appRepository.findById(nameApp);
		if(app.isPresent()) {
			return infoPort.checkInfo(app.get().getUrl());	
		}else {
			return null; 
		}
	}
	
}
