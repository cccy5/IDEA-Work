package collection.shuzu;

import java.util.HashMap;

/**
 * @Auther: Administrator
 * @Date: 2020/3/14 22:31
 * @Description:
 */
public class MapArray {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>() ;
        map.put("a","中国") ;
        map.put("b","韩国") ;
        map.put("c","日本") ;
        map.put("d","美国") ;
        String arr [] = new String[map.size()] ;
        int i = -1 ;
        for (String key : map.keySet()){
            i++ ;
          //  System.out.println("i:"+i);
          //  System.out.println("key:"+key);
            arr[i] = key ;
           // System.out.println();

            System.out.println(arr[i]+":"+map.get(arr[i]));
        }


    }
}