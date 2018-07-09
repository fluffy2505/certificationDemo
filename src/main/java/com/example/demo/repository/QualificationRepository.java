package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Qualification;

public interface QualificationRepository extends JpaRepository<Qualification, Integer>{

	@Query(value = "select q from Qualification q where q.type = ?1")
	List<Qualification> findByType(String type);
}
