package com.backend.system.controllers;

import com.backend.system.DTOs.SystemDTO;
import com.backend.system.models.CreateModel;
import com.backend.system.services.SystemService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600) // Para ser acessada a nível de classe.
@RequestMapping("/create")
public class CreateController {

    // Ponto de Injeção para nosso construtor. //
    @Autowired
    SystemService systemService;


    @PostMapping
    public ResponseEntity<Object> saveAccount(@RequestBody @Valid SystemDTO systemDTO){
        var createModel = new CreateModel();
        BeanUtils.copyProperties(systemDTO, createModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(systemService.save(createModel));
    }





}
