package com.zking.erp.Share.model;

import java.util.Date;

public class Storeoper {
    private Integer storeoperid;

    private Integer eid;

    private Date sopertime;

    private Integer storeid;

    private Integer gid;

    private Integer snum;

    private Boolean storeopertype;

    public Storeoper(Integer storeoperid, Integer eid, Date sopertime, Integer storeid, Integer gid, Integer snum, Boolean storeopertype) {
        this.storeoperid = storeoperid;
        this.eid = eid;
        this.sopertime = sopertime;
        this.storeid = storeid;
        this.gid = gid;
        this.snum = snum;
        this.storeopertype = storeopertype;
    }

    public Storeoper() {
        super();
    }

    public Integer getStoreoperid() {
        return storeoperid;
    }

    public void setStoreoperid(Integer storeoperid) {
        this.storeoperid = storeoperid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Date getSopertime() {
        return sopertime;
    }

    public void setSopertime(Date sopertime) {
        this.sopertime = sopertime;
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

    public Boolean getStoreopertype() {
        return storeopertype;
    }

    public void setStoreopertype(Boolean storeopertype) {
        this.storeopertype = storeopertype;
    }
}