package com.lambda;

/**
 * @Auther: Administrator
 * @Date: 2020/3/9 20:37
 * @Description:   lambda表达式的介绍   优化了匿名对象的创建
 */
public class Demo1 {

    public static void main(String[] args) {
        /*
            lambda表达式的语法（）->{}
            一些参数
            一个符号  ->
            一段代码
        */



        new Thread(new Runnable(){
            public void run() {
                System.out.println(Thread.currentThread().getName()+"创建的线程2");
            }
        }).start();

        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"创建的线程");
        }).start();
    }
}