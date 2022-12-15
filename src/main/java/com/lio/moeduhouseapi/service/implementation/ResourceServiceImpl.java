package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.ResourceRepository;
import com.lio.moeduhouseapi.service.interfaces.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("resourceService")
public class ResourceServiceImpl implements ResourceService {

    private ResourceRepository resourceRepo;

    @Autowired
    public ResourceServiceImpl(ResourceRepository resourceRepo ){
        this.resourceRepo = resourceRepo;
    }

}
