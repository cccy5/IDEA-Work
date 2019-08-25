package com.cy.mybatis.entity;

import java.util.List;

/**
 * @program: day_01_mybatis
 * @description: Query实体
 * @author: MrChen
 * @create: 2019-05-21 22:16
 */
public class QueryVo {
    User user ;
    Admin admin ;

    private List<Integer> ids ;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}