package com.example.eservice.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cb01OrgDTO extends BasedDTO {
    private Long orgId;

    private Long orgKey;

    private String orgScreenNm;

    private Long cbsCifKey;

    private Long idType;

    private Long idNo;

    private Long parentOrgKey;

    private Long pkgCd;

    private Long dailyLmt;

    private Long availLmt;

    private String chnl;

}
