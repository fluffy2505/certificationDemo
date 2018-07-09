package com.example.demo.service;

import java.util.List;
import java.util.Map;

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

@Repository
public class AppServiceImpl implements AppService {
	
	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private AppRepository aRepo;
	
	@Autowired
	private TemAppRepository tRepo;

	@Override
	public boolean hasTemApplicationService(int employeeID) {
		
		return false;
	}

	@Override
	public Map<Integer, Application> getTemApplicationServices(int employeeID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Application getTemApplicationService(int employeeID, int temAppID) {
		
		TypedQuery query = em.createQuery("select a from TemApplication tmp"
				+ " where tmp.tmp_application_id = ?1", TemApplication.class);
		query.setParameter(1,  temAppID);
		List<TemApplication> tmpApps = query.getResultList();
		TemApplication tmpApp = tmpApps.get(0);
		
		// TODO change TemApplication to Application
		
		
		
		return null;
	}

	@Override
	@Transactional
	public Application submitApplicationService(int employeeID, Application app) {
		
		return aRepo.save(app);
	}

}
