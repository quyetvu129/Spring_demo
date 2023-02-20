package com.example.eservice.util;

import com.example.eservice.dto.Cb01OrgDTO;
import com.example.eservice.entity.Cb01OrgEntity;
import org.springframework.stereotype.Component;

@Component
public class Cb01orgConverter {

    public Cb01OrgDTO toDto(Cb01OrgEntity entity) {
        Cb01OrgDTO dto = new Cb01OrgDTO();

        dto.setOrgId(entity.getOrgId());
        dto.setCrtBy(entity.getCrtBy());
        dto.setCrtDt(entity.getCrtDt());
        dto.setCrtDtTs(entity.getCrtDtTs());
        dto.setUpdBy(entity.getUpdBy());
        dto.setUpdDt(entity.getUpdDt());
        dto.setUpdDtTs(entity.getUpdDtTs());
        dto.setAvailLmt(entity.getAvailLmt());
        dto.setCbsCifKey(entity.getCbsCifKey());
        dto.setChnl(entity.getChnl());
        dto.setDailyLmt(entity.getDailyLmt());
        dto.setIdNo(entity.getIdNo());
        dto.setIdType(entity.getIdType());
        dto.setOrgKey(entity.getOrgKey());
        dto.setOrgScreenNm(entity.getOrgScreenNm());
        dto.setParentOrgKey(entity.getParentOrgKey());
        dto.setPkgCd(entity.getPkgCd());

        return dto;
    }
}
