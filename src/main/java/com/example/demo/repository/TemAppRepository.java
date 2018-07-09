package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.TemApplication;

public interface TemAppRepository extends JpaRepository<TemApplication, Integer> {
	
	@Query(value = "select t from TemApplication t where t.employeeId = ?1")
	List<TemApplication> findByEmployeeID(int employeeID);
}
