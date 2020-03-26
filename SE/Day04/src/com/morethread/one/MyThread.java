package com.morethread.one;

/**
 * @Auther: Administrator
 * @Date: 2020/3/4 22:11
 * @Description:  创建线程
 */
public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            System.out.println("继承Thread创建的多线程："+Thread.currentThread().getName());
            System.out.println("继承Thread创建的多线程："+i);
        }
    }
}