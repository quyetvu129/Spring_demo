package com.example.eservice.service.impl;

import com.example.eservice.dto.PkgDTO;
import com.example.eservice.entity.PackageEntity;
import com.example.eservice.repository.PackageRepository;
import com.example.eservice.service.IPackageService;
import com.example.eservice.util.PackageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PackageService implements IPackageService {

    @Autowired
    private PackageRepository packageRepository;

    @Autowired
    private PackageConverter packageConverter;

    @Override
    public PkgDTO save(PkgDTO pkgDTO) {

        PackageEntity packageEntity = packageRepository.save(packageConverter.toEntity(pkgDTO));
        return packageConverter.toDto(packageEntity);
    }
}
