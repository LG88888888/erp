package com.zking.erp.Share.model;

public class Goodstype {
    private Integer gtid;

    private String gtype;

    public Goodstype(Integer gtid, String gtype) {
        this.gtid = gtid;
        this.gtype = gtype;
    }

    public Goodstype() {
        super();
    }

    public Integer getGtid() {
        return gtid;
    }

    public void setGtid(Integer gtid) {
        this.gtid = gtid;
    }

    public String getGtype() {
        return gtype;
    }

    public void setGtype(String gtype) {
        this.gtype = gtype;
    }
}