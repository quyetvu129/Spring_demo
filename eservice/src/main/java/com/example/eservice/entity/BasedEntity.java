package com.example.eservice.entity;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class BasedEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    @Column
    private String crtBy;

    @Column
    private Date crtDt;

    @Basic(optional = false)
    @Column(name = "crtDtTs", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtDtTs;

    @Column
    private String updBy;

    @Column
    private Date updDt;

    @Basic(optional = false)
    @Column(name = "updDtTs", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updDtTs;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

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
