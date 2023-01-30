package com.example.eservice.dto;

public class PkgDTO {
    private String pkgCd;
    private String desc;
    private String sts;
    private String chnl;

    private Integer deviceCnt;

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
