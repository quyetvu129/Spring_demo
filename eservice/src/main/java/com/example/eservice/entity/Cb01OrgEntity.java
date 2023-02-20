package com.example.eservice.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cb01org")
//@IdClass(Cb01OrgEntity.class)
public class Cb01OrgEntity extends BasedEntity {

//    private static final long serialVersionUID = -297553281792804396L;
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

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getOrgKey() {
        return orgKey;
    }

    public void setOrgKey(Long orgKey) {
        this.orgKey = orgKey;
    }

    public String getOrgScreenNm() {
        return orgScreenNm;
    }

    public void setOrgScreenNm(String orgScreenNm) {
        this.orgScreenNm = orgScreenNm;
    }

    public Long getCbsCifKey() {
        return cbsCifKey;
    }

    public void setCbsCifKey(Long cbsCifKey) {
        this.cbsCifKey = cbsCifKey;
    }

    public Long getIdType() {
        return idType;
    }

    public void setIdType(Long idType) {
        this.idType = idType;
    }

    public Long getIdNo() {
        return idNo;
    }

    public void setIdNo(Long idNo) {
        this.idNo = idNo;
    }

    public Long getParentOrgKey() {
        return parentOrgKey;
    }

    public void setParentOrgKey(Long parentOrgKey) {
        this.parentOrgKey = parentOrgKey;
    }

    public Long getPkgCd() {
        return pkgCd;
    }

    public void setPkgCd(Long pkgCd) {
        this.pkgCd = pkgCd;
    }

    public Long getDailyLmt() {
        return dailyLmt;
    }

    public void setDailyLmt(Long dailyLmt) {
        this.dailyLmt = dailyLmt;
    }

    public Long getAvailLmt() {
        return availLmt;
    }

    public void setAvailLmt(Long availLmt) {
        this.availLmt = availLmt;
    }

    public String getChnl() {
        return chnl;
    }

    public void setChnl(String chnl) {
        this.chnl = chnl;
    }
}
