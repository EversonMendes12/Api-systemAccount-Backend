package com.backend.system.services;

import com.backend.system.models.CreateModel;
import com.backend.system.repository.SystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SystemService {

    @Autowired
    SystemRepository systemRepository;

    @Transactional
    public CreateModel save (CreateModel createModel){
        return systemRepository.save(createModel);
    }


}

