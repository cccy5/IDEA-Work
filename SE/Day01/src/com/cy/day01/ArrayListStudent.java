package com.cy.day01;

/**
 * @Auther: Administrator
 * @Date: 2020/2/15 19:35
 * @Description:
 */
public class ArrayListStudent {

//    自定义4个学生对象,添加到集合,并遍历
    private  String name ;

    private  int age ;

    private  String sex ;

    public ArrayListStudent() {
    }

    public ArrayListStudent(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}