package com.cy;

/**
 * @Auther: Administrator
 * @Date: 2020/2/17 23:50
 * @Description:
 */
public class Student {
    private  String eat ;

    public Student() {
    }

    public Student(String eat) {
        this.eat = eat;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public void  stuy(){
        System.out.println("学生要学习");
    }
}