package com.coderszone.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.coderszone.model.Regex;
import com.coderszone.repository.RegexRepository;
import com.coderszone.service.RegexService;

public class RegexServiceImpl implements RegexService{
	
	@Autowired
	private RegexRepository regexRepository;

	@Override
	public List<Regex> getAllRegex() {
		return regexRepository.findAll();
	}

}
