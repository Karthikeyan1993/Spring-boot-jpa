package com.db.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.db.ems.domain.ProjectMetadata;
import com.db.ems.repository.ProjectMetadataRepository;

@Component
public class ProjectMetadataServiceImple implements IProjectMetadataService {

	@Autowired
	private ProjectMetadataRepository repo;

	@Override
	public List<ProjectMetadata> GetAllDetails() {
		return this.repo.findAll();
	}

	@Override
	public ProjectMetadata SaveOrUpdate(ProjectMetadata pm) {
		return this.repo.saveAndFlush(pm);
	}

}
