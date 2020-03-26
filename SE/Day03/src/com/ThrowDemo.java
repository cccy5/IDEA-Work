package com;

/**
 * @Auther: Administrator
 * @Date: 2020/3/2 22:11
 * @Description:
 */
public class ThrowDemo
{

    public static void main(String[] args) {
        /*java中异常处理机制有两种：
            1、抛出异常 throws Exception
            2、捕获异常自己处理   try() catch

           打印异常有三种方法：  继承throwable
                1、getMessage 获取简短的异常信息
                2、toString   获取异常的类型和异常描述信息
                3、printStackTrace  打印异常信息最全部

           自定义异常
                必须继承Exception       编译时异常
                或者runTimeException    运行时异常

                异常类中得有一个无参构造方法和一个异常构造方法
        */


        char [] chars =  {'a','b','n','c','d'}  ;
        String  [] strings =  {"a","b","c","d","e"}  ;
        try {
            int a = chars[10] ;
        }catch (Exception e){
            e.printStackTrace();
            return;
        }
        System.out.println("成功");
    }
}