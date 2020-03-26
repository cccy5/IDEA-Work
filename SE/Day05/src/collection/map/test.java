package collection.map;

import java.util.HashMap;
import java.util.Set;

/**
 * @Auther: Administrator
 * @Date: 2020/3/15 19:07
 * @Description:
 */
public class test {
    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>() ;
        map.put("q","q");
        map.put("w","q");
        map.put("e","q");
        map.put("d","q");
     //  Set<String> keySet = map.keySet();
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key+":"+value);
        }
    }
}