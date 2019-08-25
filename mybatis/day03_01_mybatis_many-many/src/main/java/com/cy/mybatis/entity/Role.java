package com.cy.mybatis.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @program: day03_01_mybatis_manymany
 * @description: 职位类
 * @author: MrChen
 * @create: 2019-06-12 20:55
 */
public class Role implements Serializable {

    private  int id ;

    private String roleName ;

    private String roleDesc ;

    //多对多关系映射，一个角色赋予多个用户

    private List<User> users ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                '}';
    }
}