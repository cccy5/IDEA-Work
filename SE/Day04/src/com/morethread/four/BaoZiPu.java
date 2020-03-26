package com.morethread.four;

/**
 * @Auther: Administrator
 * @Date: 2020/3/9 20:48
 * @Description: 包子铺对象类  生产包子
 */
public class BaoZiPu extends Thread {

        private BaoZi baoZi ;

    public BaoZiPu(String name,BaoZi baoZi) {
        super(name);
        this.baoZi = baoZi;
    }
}