package com.morethread.one;

/**
 * @Auther: Administrator
 * @Date: 2020/3/8 20:32
 * @Description:  通过实现runnable接口实现多线程
 */
public class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("实现runnable接口创建的线程:"+Thread.currentThread().getName());
            System.out.println("实现runnable接口创建的线程:"+i);
        }
    }
}