package com.example.eservice.service;

import com.example.eservice.dto.PkgDTO;
import org.springframework.stereotype.Service;

@Service
public interface IPackageService {
    PkgDTO save(PkgDTO pkgDTO);
}
