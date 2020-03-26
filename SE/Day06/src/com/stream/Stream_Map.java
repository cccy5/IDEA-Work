package com.stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Auther: Administrator
 * @Date: 2020/3/26 20:42
 * @Description:
 */
public class Stream_Map
{
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>() ;
        Set<String> stream = map.keySet();
        stream.stream().forEach(name-> System.out.println(name));

        List<Integer> list  = new ArrayList<>() ;
        list.add(1) ;
        list.add(2) ;
        list.add(4) ;
        list.add(5) ;
        list.add(6) ;

        System.out.println();
        list.stream().forEach( (naem)-> System.out.println(naem));

    }


    }