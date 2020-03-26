package com.cy.day01;

import java.util.Scanner;

/**
 * @Auther: Administrator
 * @Date: 2020/2/12 19:50
 * @Description:
 */
public class HelloWorld {

    public static void main(String[] args) {
//定义方法实现功能，需要有两个明确，即 返回值 和 参数列表
//        aVoid()比较两个值是否相等
//        aVoid() ;
//        getSum() ;求1-100的和
        getSum() ;
    }

    public static void aVoid(){
        System.out.println("请输入两个数互相比较大小：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Boolean c = compare(a, b);
        System.out.println("比较的结果是：" + c);
    }

    public static boolean compare(int x, int y) {
        if (x == y) {
            return true;
        } else {
            return false;
        }

    }
    public  static int  getSum(){
        int sum = 0 ;
        for(int i = 0 ; i<100 ;i++ ){

            sum+= i ;

        }
        System.out.println(sum);
        return sum ;
    }

}