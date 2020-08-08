package com.zking.erp.Share.model;

public class Erprolefunction {
    private Long rfid;

    private Long rid;

    private Long fid;

    public Erprolefunction(Long rfid, Long rid, Long fid) {
        this.rfid = rfid;
        this.rid = rid;
        this.fid = fid;
    }

    public Erprolefunction() {
        super();
    }

    public Long getRfid() {
        return rfid;
    }

    public void setRfid(Long rfid) {
        this.rfid = rfid;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }
}