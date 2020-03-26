package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: Administrator
 * @Date: 2020/3/15 17:03
 * @Description:  以键值对的形式存储persion对象到map集合中
 */
public class PersionMap {

    public static void main(String[] args) {

        Map<String,Persion> map = new HashMap<>() ;
        map.put("1",new Persion("张三",45)) ;
        map.put("2",new Persion("李四",46)) ;
        map.put("3",new Persion("王五",47)) ;
        map.put("4",new Persion("赵六",48)) ;

        Set<Map.Entry<String, Persion>> entries = map.entrySet();
        for (Map.Entry<String, Persion> entry : entries) {
            String key = entry.getKey();
            Persion value = entry.getValue();
            System.out.println(key+":"+value.getName()+value.getAge());
        }
        System.out.println("===============================================");
        Set<String> keySet = map.keySet();
        for(String key : keySet){
            Persion persion = map.get(key);
            System.out.println(key+":"+persion.getName()+persion.getAge());
        }


    }
}