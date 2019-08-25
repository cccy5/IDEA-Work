package com.cy.entity;

import java.io.Serializable;

/**
 * @Auther: Administrator
 * @Date: 2019/8/4 19:03
 * @Description: 用户实体类
 */
public class User implements Serializable {
    private String uname ;
    private  String upassword ;
    private int uage ;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public int getUage() {
        return uage;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", upassword='" + upassword + '\'' +
                ", uage=" + uage +
                '}';
    }
}