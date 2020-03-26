package com.morethread.two;

/**
 * @Auther: Administrator
 * @Date: 2020/3/8 20:44
 * @Description:  实现卖票案例： 发现多线程存在的问题
 */
public class ThreadMain {
    public static void main(String[] args) {
        ThreadDemo t = new ThreadDemo() ;

        Thread threa1 = new Thread(t) ;
        Thread threa2 = new Thread(t) ;
        Thread threa3 = new Thread(t) ;
        Thread threa4 = new Thread(t) ;
        threa1.start();
        threa2.start();
        threa3.start();
        threa4.start();
    }

}