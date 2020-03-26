package com.morethread.three;

/**
 * @Auther: Administrator
 * @Date: 2020/3/8 20:43
 * @Description: 多线程存在的问题：  卖重复的票   或者卖不存在的票
 */
public class ThreadDemo implements Runnable {
    private  int ticket = 100;
    Object obj = new Object() ;
    @Override
    public void run() {
        System.out.println("Thread");
        while (true){
            synchronized (obj){
                if (ticket>0){
                    System.out.println(Thread.currentThread().getName()+"正在卖"+ticket+"票");
                    ticket-- ; }
            }

        }
    }
}