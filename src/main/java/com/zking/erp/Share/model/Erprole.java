package com.zking.erp.Share.model;

public class Erprole {
    private Long rid;

    private String rname;

    private String rdesc;

    private Integer rflag;

    public Erprole(Long rid, String rname, String rdesc, Integer rflag) {
        this.rid = rid;
        this.rname = rname;
        this.rdesc = rdesc;
        this.rflag = rflag;
    }

    public Erprole() {
        super();
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRdesc() {
        return rdesc;
    }

    public void setRdesc(String rdesc) {
        this.rdesc = rdesc;
    }

    public Integer getRflag() {
        return rflag;
    }

    public void setRflag(Integer rflag) {
        this.rflag = rflag;
    }
}