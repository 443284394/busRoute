package com.wpg.bus.pojo;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

public class User extends Model<User> {
    private int id;
    private String userName;
    private String pwd;
    private long phone;
    private String head;
    private int flag;
    private Date loginTinme;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public Date getLoginTinme() {
        return loginTinme;
    }

    public void setLoginTinme(Date loginTinme) {
        this.loginTinme = loginTinme;
    }

    public User() {
    }

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
