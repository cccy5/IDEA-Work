package com.cy.myservlet.entity;
    /**
    * @Description: 实体类
    * @Param:  用户
    * @return:  属性
    * @Author: Mr.chen
    * @Date: 2019/4/15
    */
public class User {
    private int id ;//id
    private String username ;
    private String userpassword ;
    private int age ;


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

        public String getUserpassword() {
            return userpassword;
        }

        public void setUserpassword(String userpassword) {
            this.userpassword = userpassword;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
