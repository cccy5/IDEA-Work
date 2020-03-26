package com;


import java.util.*;

/**
 * @Auther: Administrator
 * @Date: 2020/3/1 21:35
 * @Description:  Map集合中KeySet应用
 */
public class MapDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        Map<String, String> map = new HashMap<String, String>();
        String s = map.put("张三", "张三1");
        String s1 = map.put("李四", "李四1");
        map.put("王五", "王五1");
        map.put("赵六", "赵六1");
        map.put("马七", "马七1");

        System.out.println("s:" + s);
        System.out.println("s1:" + s1);
        System.out.println(map);

        String remove = map.remove("张三");
        System.out.println("remove:" + remove);

        System.out.println("=====================================================");

        /*
        遍历HashMap集合步骤
            1：将Map集合中的键转换为set集合  通过keySet
            2：遍历set集合
            3：根据键获取Map集合的值
        * */
        //吧map集合的键转化为set集合
        Set<String> set = map.keySet();
        //使用迭代器获取map集合的每一个key
        Iterator<String> it = set.iterator();

        while (it.hasNext()) {
            //取到key
            String key = it.next();


            //通过key取到值
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("====================================");
        for (String key : set) {
            // String next = iterator.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }
}