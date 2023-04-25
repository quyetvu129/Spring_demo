package com.example.eservice.api.cb01Org.get;

import com.example.eservice.service.cb01Org.impl.Cb01orgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GetDetailCompanyRegistration {

    @Autowired
    private Cb01orgService cb01orgService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/company")
    public ResponseEntity getListCb01Org() {
        return ResponseEntity.ok(cb01orgService.getAll());
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/company/search")
    public ResponseEntity getCb01Org(
            @RequestParam(value = "idType", required = false) Long idType,
            @RequestParam(value = "orgId", required = false) Long orgId,
            @RequestParam(value = "orgScreenNm", required = false) String orgScreenNm
    ) {
        return ResponseEntity.ok(cb01orgService.getByConditions(idType, orgId, orgScreenNm));
    }

    @GetMapping("/company/{id}")
    public ResponseEntity getCb01orgToUpdate(@PathVariable Long id) {

        return ResponseEntity.ok(cb01orgService.getCb01orgToUpdate(id));
    }
}
