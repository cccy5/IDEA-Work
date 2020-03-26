package com.recursion;

/**
 * @Auther: Administrator
 * @Date: 2020/3/10 21:22
 * @Description:  计算1---n的和 （递归算法的应用）
 */
public class one {
      static   int b = 10 ;

    public static void main(String[] args) {
       // a(4);
        //sum(10);

    }
    private static int  c(int a) {
        for (int i = 0; i < 3; i++) {
            int b = 5 ;
            System.out.println(a+(b--));
        }
        System.out.println("a_:"+a);
       // System.out.println("b--"+b--);
        int d = a+(b--) ;
        System.out.println("c:"+d);
        return  d;
    }

    private static void a(int a ) {

        b-- ;
        System.out.println(b);
        if(b>0){
            System.out.println(a);
            a(a) ;
        } else {
            System.exit(0);
        }
    }
    private static int sum(int n) {
        if(n==1){
            return 1 ;
        }
        int a = 0 ;
        a =n+ sum(n-1) ;
        System.out.println(a);
        return a ;
    }
}