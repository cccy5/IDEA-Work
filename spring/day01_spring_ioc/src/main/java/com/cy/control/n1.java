package com.cy.control;


import java.util.*;

/**
 * @program: day01_spring_ioc
 * @description: 测试类
 * @author: MrChen
 * @create: 2019-06-20 21:45
 */
public class n1 {

//    private int id ;
//    private String name ;
//    private Date d ;

    private String[] myStrs;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String,String> myMap;
    private Properties myProps;

    public void setMyStrs(String[] myStrs) {
        this.myStrs = myStrs;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }

//    public Date getD() {
//        return d;
//    }
//
//    public void setD(Date d) {
//        this.d = d;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "n1{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", d=" + d +
//                '}';
//    }
    public void save(){
        //System.out.println("执行成功"+"id: "+id+" "+"name: "+name+" "+"d:"+d);
        System.out.println(Arrays.toString(myStrs));
        System.out.println(myList);
        System.out.println(mySet);
        System.out.println(myMap);
        System.out.println(myProps);
    }
}