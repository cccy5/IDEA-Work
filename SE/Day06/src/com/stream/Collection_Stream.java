package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Auther: Administrator
 * @Date: 2020/3/26 15:35
 * @Description:
 */
public class Collection_Stream {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>() ;
        list.add("张无忌") ;
        list.add("张三丰") ;
        list.add("张翠山") ;
        list.add("赵敏") ;
        list.add("周芷若") ;
        list.add("小灵通") ;
        list.add("张") ;
        Stream<String> stream = list.stream();
       // stream.forEach(s -> System.out.println(list));
//       list.stream().filter(name->name.startsWith("张"))
//                    .filter(name->name.length()==3)
//                     .forEach(name-> System.out.println(name));

        stream.filter(b->b.startsWith("张"))
                .filter(a->a.length()==3)
                .forEach(c-> System.out.println(c));
    }

}