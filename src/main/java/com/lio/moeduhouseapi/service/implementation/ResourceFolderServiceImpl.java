package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.ResourceFolderRepository;
import com.lio.moeduhouseapi.service.interfaces.ResourceFolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("resourceFolderService")
public class ResourceFolderServiceImpl implements ResourceFolderService {

    private ResourceFolderRepository resourceFolderRepo;

    @Autowired
    private ResourceFolderServiceImpl(ResourceFolderRepository resourceFolderRepo ){
        this.resourceFolderRepo = resourceFolderRepo;
    }

}
