package com.cy.utilutils;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Auther: Administrator
 * @Date: 2019/7/11 19:20
 * @Description:用于记录日志的公共类，停供了公共方法
 */
public class Logger {

    /**
     * @param: 用于打印日志，计划让其在切入点方法之前执行（切入点方法就是业务层方法）
     * @return: 
     * @date: 2019/7/11 
     */
    public  Object pritLog(ProceedingJoinPoint pjp){
        Object rtValue = null ;
        try {
            Object[] args = pjp.getArgs() ;//得到方法执行所需参数

            System.out.println("前置通知-----Logger类中printLog方法开始记录日志了。。。。。。");
            rtValue = pjp.proceed(args) ;//明确调用业务层方法（切入点方法）
            System.out.println("后置通知-----Logger类中printLog方法开始记录日志了。。。。。。");
        }catch (Throwable t){
            System.out.println("异常通知-----Logger类中printLog方法开始记录日志了。。。。。。");
           // throw  new  RuntimeException(Exception ) ;
        }finally {
            System.out.println("最终通知-----Logger类中printLog方法开始记录日志了。。。。。。");
            return rtValue;
        }

        //System.out.println("Logger类中printLog方法开始记录日志了。。。。。。");
    }
}