package com.cy;

/**
 * @Auther: Administrator
 * @Date: 2020/2/17 23:48
 * @Description:
 */
public class Persion {

    private  String name ;
    private  int  age ;
    private Student student ;

    public Persion(String name, int age, Student student) {
        this.name = name;
        this.age = age;
        this.student = student;
    }

    public Persion() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
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
}