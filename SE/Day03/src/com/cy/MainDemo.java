package com.cy;

/**
 * @Auther: Administrator
 * @Date: 2020/2/17 23:51
 * @Description:
 */
public class MainDemo {

    public static void main(String[] args) {

        Persion p = new Persion() ;
        p.setName("德玛");
        p.setAge(13);

        Student s = new Student() ;
        s.setEat("饭");
        p.setStudent(s);
        s.stuy();
        System.out.println(p);
        System.out.println(p.getName()+":"+p.getAge()+":"+p.getStudent().getEat());
        System.out.println(p.getName()+":"+p.getAge()+":"+p.getStudent());
    }
}