package com.example.eservice.api.cb01Org.get;

import com.example.eservice.service.cb01Org.impl.Cb01orgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetDetailCompanyRegistration {

    @Autowired
    private Cb01orgService cb01orgService;

    @GetMapping("/company")
    public ResponseEntity getListCb01Org() {
        return ResponseEntity.ok(cb01orgService.getAll());
    }
}
