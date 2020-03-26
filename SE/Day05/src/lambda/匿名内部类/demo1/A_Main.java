package lambda.匿名内部类.demo1;

/**
 * @Auther: Administrator
 * @Date: 2020/3/24 21:03
 * @Description:
 */
public class A_Main {
    public static void main(String[] args) {
        A a = new AImpl();
        a.study();



       new A() {
           public void study(){
               System.out.println("学生要学习！！！！");
           }
       } ;

        dy(new A() {
            @Override
            public void study() {

                System.out.println("yao xue xi");
            }
        }) ;

        dy(()->{
            System.out.println("niengoe");
        }) ;

    }


public static void dy(A a){
a.study();
}

}








