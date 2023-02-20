package com.example.eservice.dto;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class BasedDTO {
    private Long id;

    private String crtBy;

    private Date crtDt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date crtDtTs;

    private String updBy;

    private Date updDt;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updDtTs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCrtBy() {
        return crtBy;
    }

    public void setCrtBy(String crtBy) {
        this.crtBy = crtBy;
    }

    public Date getCrtDt() {
        return crtDt;
    }

    public void setCrtDt(Date crtDt) {
        this.crtDt = crtDt;
    }

    public Date getCrtDtTs() {
        return crtDtTs;
    }

    public void setCrtDtTs(Date crtDtTs) {
        this.crtDtTs = crtDtTs;
    }

    public String getUpdBy() {
        return updBy;
    }

    public void setUpdBy(String updBy) {
        this.updBy = updBy;
    }

    public Date getUpdDt() {
        return updDt;
    }

    public void setUpdDt(Date updDt) {
        this.updDt = updDt;
    }

    public Date getUpdDtTs() {
        return updDtTs;
    }

    public void setUpdDtTs(Date updDtTs) {
        this.updDtTs = updDtTs;
    }
}
