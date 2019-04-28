package com.fykj.jxks.entity;

public class User {

    private int id;

    private String username;

    private String password;

    private String telphone;

    private String usertype;

    private String vipornot;

    private int jxid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getVipornot() {
        return vipornot;
    }

    public void setVipornot(String vipornot) {
        this.vipornot = vipornot;
    }

    public int getJxid() {
        return jxid;
    }

    public void setJxid(int jxid) {
        this.jxid = jxid;
    }
}
