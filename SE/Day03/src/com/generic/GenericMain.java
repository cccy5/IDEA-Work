package com.generic;

/**
 * @Auther: Administrator
 * @Date: 2020/2/20 21:20
 * @Description:
 */
public class GenericMain {
    public static void main(String[] args) {
        GenericClass<String> gc = new GenericClass() ;
        gc.setE("ni");
        System.out.println(gc.getE());
        System.out.println("================================================");

        GenericIntrtfaceImpl<String> s = new GenericIntrtfaceImpl<>() ;
        s.E("fmneiojpoigijeio");
        System.out.println(s);

    }
}