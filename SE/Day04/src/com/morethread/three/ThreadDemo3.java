package com.morethread.three;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: Administrator
 * @Date: 2020/3/8 21:05
 * @Description:
 */
public class ThreadDemo3 implements Runnable {

    private  int ticket = 100 ;

    Lock l = new ReentrantLock() ;
    @Override
    public  void run() {
        System.out.println("Thread3");

        while (true) {
            l.lock();
            if (ticket>0) {

                System.out.println(Thread.currentThread().getName() + "卖了" + ticket + "票");
                ticket--;

            } l.unlock();
        }
    }


}