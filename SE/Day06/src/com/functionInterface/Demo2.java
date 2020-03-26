package com.functionInterface;

import java.util.function.Supplier;

/**
 * @Auther: Administrator
 * @Date: 2020/3/26 12:08
 * @Description:
 */
public class Demo2 {

    public static int getMax(Supplier<Integer> sup){
        return  sup.get() ;
    }

    public static void main(String[] args) {
        getMax(()->{


            return 0 ;
        }) ;

    }
}