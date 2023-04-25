package com.example.eservice.api.cb01Org.post;

import com.example.eservice.dto.Cb01OrgDetailDto;
import com.example.eservice.service.cb01Org.impl.Cb01orgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostCompanyRegistration {

    @Autowired
    private Cb01orgService cb01orgService;

    @PutMapping("/company")
    public ResponseEntity updateCb01Org(@RequestBody Cb01OrgDetailDto dto) {

        return ResponseEntity.ok(cb01orgService.updateCb01Org(dto));
    }
}
