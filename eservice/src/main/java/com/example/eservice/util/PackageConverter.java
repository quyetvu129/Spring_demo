package com.example.eservice.util;

import com.example.eservice.dto.PkgDTO;
import com.example.eservice.entity.PackageEntity;
import org.springframework.stereotype.Component;

@Component
public class PackageConverter {

    public PackageEntity toEntity(PkgDTO dto) {
        PackageEntity packageEntity = new PackageEntity();
        packageEntity.setDesc(dto.getDesc());
        packageEntity.setChnl(dto.getChnl());
        packageEntity.setSts(dto.getSts());
        packageEntity.setDeviceCnt(dto.getDeviceCnt());
        packageEntity.setUsrCnt(dto.getUsrCnt());

        return packageEntity;
    }

    public PkgDTO toDto(PackageEntity entity) {
        PkgDTO pkgDTO = new PkgDTO();
        pkgDTO.setDesc(entity.getDesc());
        pkgDTO.setChnl(entity.getChnl());
        pkgDTO.setSts(entity.getSts());
        pkgDTO.setDeviceCnt(entity.getDeviceCnt());
        pkgDTO.setUsrCnt(entity.getUsrCnt());

        return pkgDTO;
    }
}
