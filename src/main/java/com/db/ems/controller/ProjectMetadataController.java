package com.db.ems.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.ems.domain.ProjectMetadata;
import com.db.ems.service.IProjectMetadataService;

@RestController
@RequestMapping("api/pm")
public class ProjectMetadataController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProjectMetadataController.class);

	@Autowired
	private IProjectMetadataService service;

	@GetMapping("get/data.disp")
	public Map<String, Object> GetAllData() {
		Map<String, Object> reponseMap = new LinkedHashMap<>();
		try {
			reponseMap.put("data", this.service.GetAllDetails());
		} catch (Exception e) {
			reponseMap.put("error", e.getMessage());
			LOGGER.error("Error in GeAllData--->> " + e.getMessage());
		}
		return reponseMap;
	}

	@PostMapping("post/save.disp")
	public Map<String, Object> SaveOrUpdate(@RequestBody ProjectMetadata pm) {
		Map<String, Object> reponseMap = new LinkedHashMap<>();
		try {
			reponseMap.put("data", this.service.SaveOrUpdate(pm));
		} catch (Exception e) {
			reponseMap.put("error", e.getMessage());
			LOGGER.error("Error in SaveOrUpdate--->> " + e.getMessage());
		}
		return reponseMap;
	}
}
