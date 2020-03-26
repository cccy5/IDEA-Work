package com.morethread.one;

import com.morethread.one.MyThread;
import com.morethread.one.MyThread2;

/**
 * @Auther: Administrator
 * @Date: 2020/3/4 22:09
 * @Description:  使用线程方法Thread.currentThread().getName()  获取线程名称
 */
public class ThreadDemo1 {

    public static void main(String[] args) {
        MyThread my = new MyThread("新的线程") ;
        my.start();
        System.out.println("main中start后:"+Thread.currentThread().getName());
        MyThread2 myThread2 = new MyThread2() ;
        Thread thread = new Thread(myThread2)  ;
        thread.start();
        System.out.println("main中start后2:"+Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("main:"+i);
        }
        System.out.println("main中start后3:"+Thread.currentThread().getName());
    }


}