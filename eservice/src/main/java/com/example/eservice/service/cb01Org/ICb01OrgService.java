package com.example.eservice.service.cb01Org;

import com.example.eservice.dto.Cb01OrgDTO;
import com.example.eservice.dto.PkgDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICb01OrgService {
    List<Cb01OrgDTO> getAll();

    List<Cb01OrgDTO> getByConditions(Long idType, Long orgId, String irgScreenNm);
}
