package com.lio.moeduhouseapi.repository;

import com.lio.moeduhouseapi.model.entity.ResourceFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("resourceFolderRepository")
public interface ResourceFolderRepository extends JpaRepository<ResourceFolder,Integer> {
}
