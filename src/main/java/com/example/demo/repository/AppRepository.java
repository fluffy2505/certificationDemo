package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Application;

public interface AppRepository extends JpaRepository<Application, Integer> {
	
}
