package com.zking.erp.Share.model;

public class Dep {
    private Integer did;

    private String dname;

    private String dtel;

    public Dep(Integer did, String dname, String dtel) {
        this.did = did;
        this.dname = dname;
        this.dtel = dtel;
    }

    public Dep() {
        super();
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDtel() {
        return dtel;
    }

    public void setDtel(String dtel) {
        this.dtel = dtel;
    }
}