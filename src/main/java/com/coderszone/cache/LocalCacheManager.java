package com.coderszone.cache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.coderszone.dto.RegexDTO;
import com.coderszone.model.Regex;
import com.coderszone.service.RegexService;
import com.coderszone.utility.ValidationUtil;

@Component
public class LocalCacheManager {

	private Map<String, RegexDTO> regexDTOMap = new HashMap<>();

	private RegexService regexService;

	@EventListener
	public void init(ContextRefreshedEvent event) throws Exception {
		System.out.println("This is init method");
		List<Regex> regexList = regexService.getAllRegex();
		if (ValidationUtil.isValidCollection(regexList)) {
			for (Regex regex : regexList) {
				if (!regexDTOMap.containsKey(regex.getRegexName())) {
					regexDTOMap.put(regex.getRegexName(), new RegexDTO(regex.getRegexValue(), regex.getRegexMessage()));
				} else {
					throw new Exception("Duplicate key name exists");
				}
			}
		} else {
			throw new Exception("Invalid Data");
		}

	}
	
	public RegexDTO getRegexDTOByName(String key) {
		RegexDTO regexDTO = regexDTOMap.get(key);
		return regexDTO;
	}
}
