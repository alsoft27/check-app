package com.alsoft27.checkapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.alsoft27.checkapp.entity.App;

public interface AppRepository extends CrudRepository<App, String> {

}
