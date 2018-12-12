package com.db.ems.service;

import java.util.List;

import com.db.ems.domain.ProjectMetadata;

public interface IProjectMetadataService {
	List<ProjectMetadata> GetAllDetails();

	ProjectMetadata SaveOrUpdate(ProjectMetadata pm);
}
