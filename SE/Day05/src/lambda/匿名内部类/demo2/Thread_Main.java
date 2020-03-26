package lambda.匿名内部类.demo2;

import lambda.匿名内部类.demo1.A;

/**
 * @Auther: Administrator
 * @Date: 2020/3/24 21:17
 * @Description:
 */
public class Thread_Main {
    public static void main(String[] args) {
        ThreadImpl t = new ThreadImpl() ;
        Thread t1 = new Thread(t) ;
        t1.start();

        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println( Thread.currentThread().getName() );
            }
        }) .start();

        new Thread(()-> {

            System.out.println("aaa");
        }) .start();

    }
}