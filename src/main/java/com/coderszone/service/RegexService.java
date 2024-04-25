package com.coderszone.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coderszone.model.Regex;

@Service
public interface RegexService {

	List<Regex> getAllRegex();
	
}
