package com.zking.erp.Share.model;

public class Storedetail {
    private Integer storedetailid;

    private Integer storeid;

    private Integer gid;

    private Integer snum;

    public Storedetail(Integer storedetailid, Integer storeid, Integer gid, Integer snum) {
        this.storedetailid = storedetailid;
        this.storeid = storeid;
        this.gid = gid;
        this.snum = snum;
    }

    public Storedetail() {
        super();
    }

    public Integer getStoredetailid() {
        return storedetailid;
    }

    public void setStoredetailid(Integer storedetailid) {
        this.storedetailid = storedetailid;
    }

    public Integer getStoreid() {
        return storeid;
    }

    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getSnum() {
        return snum;
    }

    public void setSnum(Integer snum) {
        this.snum = snum;
    }
}