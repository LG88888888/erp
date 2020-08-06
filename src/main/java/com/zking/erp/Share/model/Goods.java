package com.zking.erp.Share.model;

public class Goods {
    private Integer gid;

    private String gname;

    private String gorigin;

    private String gproducer;

    private String gunit;

    private Float ginprice;

    private Float goutprice;

    private Integer gtid;

    public Goods(Integer gid, String gname, String gorigin, String gproducer, String gunit, Float ginprice, Float goutprice, Integer gtid) {
        this.gid = gid;
        this.gname = gname;
        this.gorigin = gorigin;
        this.gproducer = gproducer;
        this.gunit = gunit;
        this.ginprice = ginprice;
        this.goutprice = goutprice;
        this.gtid = gtid;
    }

    public Goods() {
        super();
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGorigin() {
        return gorigin;
    }

    public void setGorigin(String gorigin) {
        this.gorigin = gorigin;
    }

    public String getGproducer() {
        return gproducer;
    }

    public void setGproducer(String gproducer) {
        this.gproducer = gproducer;
    }

    public String getGunit() {
        return gunit;
    }

    public void setGunit(String gunit) {
        this.gunit = gunit;
    }

    public Float getGinprice() {
        return ginprice;
    }

    public void setGinprice(Float ginprice) {
        this.ginprice = ginprice;
    }

    public Float getGoutprice() {
        return goutprice;
    }

    public void setGoutprice(Float goutprice) {
        this.goutprice = goutprice;
    }

    public Integer getGtid() {
        return gtid;
    }

    public void setGtid(Integer gtid) {
        this.gtid = gtid;
    }
}