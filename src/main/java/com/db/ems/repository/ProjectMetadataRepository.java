package com.db.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.db.ems.domain.ProjectMetadata;

@Component
public interface ProjectMetadataRepository extends JpaRepository<ProjectMetadata, Long> {

}
