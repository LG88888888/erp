package com.zking.erp.Share.model;

import java.util.Date;

public class Emp {
    private Integer eid;

    private String username;

    private String pwd;

    private String ename;

    private String esex;

    private String email;

    private String etel;

    private String eaddress;

    private Date ebirthday;

    private Integer did;

    private Integer rid;

    public Emp(Integer eid, String username, String pwd, String ename, String esex, String email, String etel, String eaddress, Date ebirthday, Integer did, Integer rid) {
        this.eid = eid;
        this.username = username;
        this.pwd = pwd;
        this.ename = ename;
        this.esex = esex;
        this.email = email;
        this.etel = etel;
        this.eaddress = eaddress;
        this.ebirthday = ebirthday;
        this.did = did;
        this.rid = rid;
    }

    public Emp() {
        super();
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEsex() {
        return esex;
    }

    public void setEsex(String esex) {
        this.esex = esex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEtel() {
        return etel;
    }

    public void setEtel(String etel) {
        this.etel = etel;
    }

    public String getEaddress() {
        return eaddress;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress;
    }

    public Date getEbirthday() {
        return ebirthday;
    }

    public void setEbirthday(Date ebirthday) {
        this.ebirthday = ebirthday;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
}