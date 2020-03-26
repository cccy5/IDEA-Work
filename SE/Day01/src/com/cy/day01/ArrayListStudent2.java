package com.cy.day01;

import java.util.ArrayList;

/**
 * @Auther: Administrator
 * @Date: 2020/2/15 19:36
 * @Description:
 */
public class ArrayListStudent2 {

    public static void main(String[] args) {
        ArrayList<ArrayListStudent> list = new ArrayList<>() ;
        ArrayListStudent student1 = new ArrayListStudent("张三",12,"男")  ;
        ArrayListStudent student2 = new ArrayListStudent("李四",65,"女")  ;
        ArrayListStudent student3 = new ArrayListStudent("王五",14,"男")  ;
        ArrayListStudent student4 = new ArrayListStudent("赵柳",1,"女")  ;
        list.add(student1) ;
        list.add(student2) ;
        list.add(student3) ;
        list.add(student4) ;
        for (int i = 0; i < list.size(); i++) {
            ArrayListStudent student = list.get(i) ;
            System.out.println(student.getName()+student.getAge()+student.getSex());
        }
    }
}