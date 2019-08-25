package com.cy.entity;

import java.io.Serializable;

/**
 * @program: mybatis_02
 * @description: 管理员实体类
 * @author: MrChen
 * @create: 2019-05-23 19:29
 */
public class Admin implements Serializable {

    private int adminId ;

    private String adminName ;

    private String adminAddress  ;

    private int adminAge  ;

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminAddress() {
        return adminAddress;
    }

    public void setAdminAddress(String adminAddress) {
        this.adminAddress = adminAddress;
    }

    public int getAdminAge() {
        return adminAge;
    }

    public void setAdminAge(int adminAge) {
        this.adminAge = adminAge;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", adminAddress='" + adminAddress + '\'' +
                ", adminAge=" + adminAge +
                '}';
    }
}