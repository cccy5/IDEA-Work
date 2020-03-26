package lambda.匿名内部类.demo2;

/**
 * @Auther: Administrator
 * @Date: 2020/3/24 21:16
 * @Description:
 */
public class ThreadImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}