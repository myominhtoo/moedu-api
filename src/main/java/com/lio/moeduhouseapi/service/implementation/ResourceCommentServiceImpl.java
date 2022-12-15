package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.repository.ResourceCommentRepository;
import com.lio.moeduhouseapi.service.interfaces.ResourceCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("resourceCommentService")
public class ResourceCommentServiceImpl implements ResourceCommentService {

    private ResourceCommentRepository resourceCommentRepo;

    @Autowired
    private ResourceCommentServiceImpl( ResourceCommentRepository resourceCommentRepo ){
        this.resourceCommentRepo = resourceCommentRepo;
    }

}
