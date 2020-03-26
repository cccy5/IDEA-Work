package lambda.匿名内部类.demo4;

/**
 * @Auther: Administrator
 * @Date: 2020/3/26 14:56
 * @Description:
 */
public class F_Main {

    public static void  dy(Function function){
        function.study();
    }
    public static void main(String[] args) {
        dy(new Function() {
            @Override
            public void study() {
                System.out.println("学生要学习！！1");
            }
        }) ;

        dy(() -> System.out.println("学生要学习！！2")) ;

        dy(() ->{
                System.out.println("学生要学习！！1");

        });






    }
}