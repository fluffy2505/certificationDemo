package com.example.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Application;
import com.example.demo.model.TemApplication;
import com.example.demo.repository.AppRepository;
import com.example.demo.repository.TemAppRepository;
import com.example.utils.TypeConvertUtils;

@Service
public class TemAppServiceImpl implements TemAppService {

	@Autowired
	private TemAppRepository tRepo;
	
	@Autowired
	private AppRepository aRepo;

	@Override
	public boolean hasTemApplicationService(int employeeID) {
		List<TemApplication> tmpApps = tRepo.findByEmployeeID(employeeID);
		return tmpApps.isEmpty();
	}

	@Override
	public Map<Integer, Application> getTemApplicationServices(int employeeID) {
		
		List<TemApplication> tmpApps = tRepo.findByEmployeeID(employeeID);
		Map<Integer, Application> result = new TreeMap<Integer, Application>();
		for (TemApplication tmpApp: tmpApps) {
			// change temApplication to Application
			Integer tmpid = tmpApp.getTmpApplicationId();
			Application app = TypeConvertUtils.temApplcationToApplication(tmpApp);
			result.put(tmpid, app);
		}
		return result;
	}

	@Override
	public Application getTemApplicationService(int employeeID, int temAppID) {
		
		Optional<TemApplication> ota = tRepo.findById(temAppID);
		TemApplication ta = ota.get();
		if (ta.getEmployeeId() == employeeID) {
			// need change function
			return TypeConvertUtils.temApplcationToApplication(ta);
		}
		else return null;
	}
	
	@Override
	@Transactional
	public boolean saveTemApplicationService(int employeeID, Application app) {
		if(aRepo.existsById(employeeID)) {
			tRepo.saveAndFlush(TypeConvertUtils.applcationToTemApplication(employeeID, app));
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteTemApplicationService(int employeeID, int temAppID) {
		Optional<TemApplication> ota = tRepo.findById(temAppID);
		TemApplication temApplication = ota.get();
		if(aRepo.existsById(employeeID) && temApplication.getEmployeeId() == employeeID) {
			tRepo.delete(temApplication);
			return true;
		}
		return false;
	}
	
	@Override
	@Transactional
	public boolean updateTemApplicationService(int employeeID, int temAppId, Application app) {
		if(aRepo.existsById(employeeID) && tRepo.existsById(temAppId)) {
			TemApplication temApplication = TypeConvertUtils.applcationToTemApplication(employeeID, app);
			TemApplication existingTemApp = tRepo.getOne(temAppId);
			BeanUtils.copyProperties(temApplication, existingTemApp);
			tRepo.saveAndFlush(temApplication);
			return true;
		}
		return false;
	}
}