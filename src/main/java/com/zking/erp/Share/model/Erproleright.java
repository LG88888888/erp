package com.zking.erp.Share.model;

public class Erproleright {
    private Long rfid;

    private Long rid;

    private String rcode;

    public Erproleright(Long rfid, Long rid, String rcode) {
        this.rfid = rfid;
        this.rid = rid;
        this.rcode = rcode;
    }

    public Erproleright() {
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

    public String getRcode() {
        return rcode;
    }

    public void setRcode(String rcode) {
        this.rcode = rcode;
    }
}