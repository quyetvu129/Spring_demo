package com.example.eservice.api;


import com.example.eservice.dto.PkgDTO;
import com.example.eservice.service.impl.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PkgAPI {

    @Autowired
    private PackageService packageService;

    @PostMapping("/new")
    public PkgDTO createNew(@RequestBody PkgDTO model) {
        packageService.save(model);
        return model;
    }
}
