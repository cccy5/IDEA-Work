package com.cy.entity;

import java.io.Serializable;

/**
 * @Auther: Administrator
 * @Date: 2019/8/4 14:15
 * @Description:
 */
public class Money implements Serializable {

    private  String monetage ;

    private  String monetname ;

    public String getMonetage() {
        return monetage;
    }

    public void setMonetage(String monetage) {
        this.monetage = monetage;
    }

    public String getMonetname() {
        return monetname;
    }

    public void setMonetname(String monetname) {
        this.monetname = monetname;
    }

    @Override
    public String   toString() {
        return "Money{" +
                "monetage='" + monetage + '\'' +
                ", monetname='" + monetname + '\'' +
                '}';
    }
}