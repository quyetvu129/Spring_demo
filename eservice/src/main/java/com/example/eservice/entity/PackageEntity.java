package com.example.eservice.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "package")
public class PackageEntity extends BaseEntity {

    @Column
    private String pkgCd;

    @Column(name = "`desc`")
    private String desc;

    @Column
    private String sts;

    @Column
    private String chnl;

    @Column
    private Integer deviceCnt;

    @Column
    private Integer usrCnt;

    public String getPkgCd() {
        return pkgCd;
    }

    public void setPkgCd(String pkgCd) {
        this.pkgCd = pkgCd;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSts() {
        return sts;
    }

    public void setSts(String sts) {
        this.sts = sts;
    }

    public String getChnl() {
        return chnl;
    }

    public void setChnl(String chnl) {
        this.chnl = chnl;
    }

    public Integer getDeviceCnt() {
        return deviceCnt;
    }

    public void setDeviceCnt(Integer deviceCnt) {
        this.deviceCnt = deviceCnt;
    }

    public Integer getUsrCnt() {
        return usrCnt;
    }

    public void setUsrCnt(Integer usrCnt) {
        this.usrCnt = usrCnt;
    }


}
