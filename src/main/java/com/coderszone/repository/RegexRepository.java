package com.coderszone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderszone.model.Regex;

@Repository
public interface RegexRepository extends JpaRepository<Regex,Integer> {

	List<Regex> findAll();
	
}
