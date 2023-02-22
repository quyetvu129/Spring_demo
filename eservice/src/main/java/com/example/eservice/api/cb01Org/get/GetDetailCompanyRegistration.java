package com.example.eservice.api.cb01Org.get;

import com.example.eservice.service.cb01Org.impl.Cb01orgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetDetailCompanyRegistration {

    @Autowired
    private Cb01orgService cb01orgService;

    @GetMapping("/company")
    public ResponseEntity getListCb01Org() {
        return ResponseEntity.ok(cb01orgService.getAll());
    }

    @GetMapping("/company/search")
    public ResponseEntity getCb01Org(
            @RequestParam(value = "idType", required = false) Long idType,
            @RequestParam(value = "orgId", required = false) Long orgId,
            @RequestParam(value = "orgScreenNm", required = false) String orgScreenNm
    ) {
        return ResponseEntity.ok(cb01orgService.getByConditions(idType, orgId, orgScreenNm));
    }
}
