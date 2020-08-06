package com.zking.erp.Share.model;

public class Erpfunction {
    private Long fid;

    private String fname;

    private String path;

    private String parameter;

    private String method;

    private String fdesc;

    public Erpfunction(Long fid, String fname, String path, String parameter, String method, String fdesc) {
        this.fid = fid;
        this.fname = fname;
        this.path = path;
        this.parameter = parameter;
        this.method = method;
        this.fdesc = fdesc;
    }

    public Erpfunction() {
        super();
    }

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getFdesc() {
        return fdesc;
    }

    public void setFdesc(String fdesc) {
        this.fdesc = fdesc;
    }
}