package com.generic;

/**
 * @Auther: Administrator
 * @Date: 2020/2/20 21:31
 * @Description:
 */
public class GenericIntrtfaceImpl<E> implements GenericInteface<E> {
    @Override
    public void E(E e) {

        System.out.println("实现了泛型接口impl:"+e);
    }
}