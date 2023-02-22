package com.example.eservice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "cb01org")
//@IdClass(Cb01OrgEntity.class)
public class Cb01OrgEntity extends BasedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orgId;

    @Column
    private Long orgKey;

    @Column
    private String orgScreenNm;

    @Column
    private Long cbsCifKey;

    @Column
    private Long idType;

    @Column
    private Long idNo;

    @Column
    private Long parentOrgKey;

    @Column
    private Long pkgCd;

    @Column
    private Long dailyLmt;

    @Column
    private Long availLmt;

    @Column
    private String chnl;

}
