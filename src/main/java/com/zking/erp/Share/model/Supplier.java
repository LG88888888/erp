package com.zking.erp.Share.model;

public class Supplier {
    private Integer supplierid;

    private String suname;

    private String saddress;

    private String scontact;

    private String stel;

    private String semail;

    private String stype;

    public Supplier(Integer supplierid, String suname, String saddress, String scontact, String stel, String semail, String stype) {
        this.supplierid = supplierid;
        this.suname = suname;
        this.saddress = saddress;
        this.scontact = scontact;
        this.stel = stel;
        this.semail = semail;
        this.stype = stype;
    }

    public Supplier() {
        super();
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getSuname() {
        return suname;
    }

    public void setSuname(String suname) {
        this.suname = suname;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public String getScontact() {
        return scontact;
    }

    public void setScontact(String scontact) {
        this.scontact = scontact;
    }

    public String getStel() {
        return stel;
    }

    public void setStel(String stel) {
        this.stel = stel;
    }

    public String getSemail() {
        return semail;
    }

    public void setSemail(String semail) {
        this.semail = semail;
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype;
    }
}