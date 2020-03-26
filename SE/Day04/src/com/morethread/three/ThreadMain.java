package com.morethread.three;

/**
 * @Auther: Administrator
 * @Date: 2020/3/8 20:44
 * @Description:  解决多线程安全问题   改良后的多线程主方法
 */
public class ThreadMain {
    public static void main(String[] args) {

        /*
        解决线程安全问题：
            1、同步代码块
            2、静态锁
            3、Lock锁
        */
        ThreadDemo3 t1 = new ThreadDemo3() ;

        Thread threa1 = new Thread(t1) ;
        Thread threa2 = new Thread(t1) ;
        Thread threa3 = new Thread(t1) ;
        Thread threa4 = new Thread(t1) ;
        threa1.start();threa2.start();threa3.start();threa4.start();
    }

}