package collection.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: Administrator
 * @Date: 2020/3/15 15:27
 * @Description: 以键值对的方式存储
 */
public class MapDemo {
    /*
        常用方法： 键不可重复  具有唯一性
            put   添加
            remove   删除
            get  根据键获取值
            set  根据键设置值
    */
    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap<>();
        map.put("a", "a");
        map.put(1, 1);
        map.put("b", "中国");
        System.out.println(map);  //map集合重写了  toString()方法  可以直接打印
        System.out.println("===================================");


        //通过Entry对象获取键值对进行遍历
        Set<Map.Entry<Object, Object>> entrySet = map.entrySet();
        for (Map.Entry<Object, Object> entry : entrySet) {
            Object value = entry.getValue();
            Object key = entry.getKey();
            System.out.println(key + ":" + value);
        }

        System.out.println("==============================================");

        // 吧键存放到set集合中遍历
        Set<Object> obj = map.keySet();
        for (Object key : obj) {
            Object value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }
}