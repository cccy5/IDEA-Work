package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @Auther: Administrator
 * @Date: 2020/3/15 18:48
 * @Description:   输入一个字符串统计个数   如aaaaabb   则输出a 4    b  2
 */
public class MapDemo2 {

    public static void main(String[] args) {
        /*
        * 将一个字符串转换成一个 Character 型的字符数组   toCharArray()
        * */
        HashMap<Character,Integer> map = new HashMap<>() ;
        System.out.println("请输入一个字符串：");
        Scanner scanner = new Scanner(System.in)  ;
        String s = scanner.next();
        for (char a : s.toCharArray()){
           if(map.containsKey(a)){
               Integer value = map.get(a);
               value++ ;
               map.put(a,value) ;
           }else {
               map.put(a,1) ;
           }
        }
           for (Character key:map.keySet()){
               Integer value = map.get(key);
               System.out.println(key+":"+value);

        }
    }
}