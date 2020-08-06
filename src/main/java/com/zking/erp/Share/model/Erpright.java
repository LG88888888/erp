package com.zking.erp.Share.model;

public class Erpright {
    private String rcode;

    private String rparentcode;

    private String rtype;

    private String rtext;

    private String rurl;

    private String rtip;

    public Erpright(String rcode, String rparentcode, String rtype, String rtext, String rurl, String rtip) {
        this.rcode = rcode;
        this.rparentcode = rparentcode;
        this.rtype = rtype;
        this.rtext = rtext;
        this.rurl = rurl;
        this.rtip = rtip;
    }

    public Erpright() {
        super();
    }

    public String getRcode() {
        return rcode;
    }

    public void setRcode(String rcode) {
        this.rcode = rcode;
    }

    public String getRparentcode() {
        return rparentcode;
    }

    public void setRparentcode(String rparentcode) {
        this.rparentcode = rparentcode;
    }

    public String getRtype() {
        return rtype;
    }

    public void setRtype(String rtype) {
        this.rtype = rtype;
    }

    public String getRtext() {
        return rtext;
    }

    public void setRtext(String rtext) {
        this.rtext = rtext;
    }

    public String getRurl() {
        return rurl;
    }

    public void setRurl(String rurl) {
        this.rurl = rurl;
    }

    public String getRtip() {
        return rtip;
    }

    public void setRtip(String rtip) {
        this.rtip = rtip;
    }
}