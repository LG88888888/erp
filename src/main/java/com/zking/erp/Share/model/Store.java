package com.zking.erp.Share.model;

public class Store {
    private Integer storeid;

    private String stname;

    private Integer eid;

    public Store(Integer storeid, String stname, Integer eid) {
        this.storeid = storeid;
        this.stname = stname;
        this.eid = eid;
    }

    public Store() {
        super();
    }

    public Integer getStoreid() {
        return storeid;
    }

    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }
}