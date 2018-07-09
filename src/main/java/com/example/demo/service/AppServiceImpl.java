package com.example.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Application;
import com.example.demo.model.TemApplication;
import com.example.demo.repository.AppRepository;
import com.example.demo.repository.TemAppRepository;
import com.example.utils.TypeConvertUtils;

@Repository
public class AppServiceImpl implements AppService {
	
	@Autowired
	private AppRepository aRepo;
	

	@Override
	@Transactional
	public Application submitApplicationService(int employeeID, Application app) {	
		return aRepo.save(app);
	}

}
