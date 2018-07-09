package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Qualification;
import com.example.demo.repository.QualificationRepository;

public class QualificationServiceImpl implements QualificationService{

	@Autowired
	private QualificationRepository qRepo;
	
	@Override
	public List<Qualification> getQualificationDescService(String type) {
		return qRepo.findByType(type);
	} 

}
