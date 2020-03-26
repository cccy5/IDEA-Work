package com.morethread.three;

/**
 * @Auther: Administrator
 * @Date: 2020/3/8 21:05
 * @Description:
 */
public class ThreadDemo2 implements Runnable {

    private  int ticket = 100 ;
    @Override
    public synchronized void run() {
        System.out.println("Thread2");
        while (ticket>0){
            System.out.println(Thread.currentThread().getName()+"卖了"+ticket+"票");
            ticket-- ;
        }
    }


}