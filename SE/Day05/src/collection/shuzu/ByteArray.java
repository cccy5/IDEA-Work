package collection.shuzu;


/**
 * @Auther: Administrator
 * @Date: 2020/3/14 22:08
 * @Description:  byte数组练习
 */
public class ByteArray {

    public static void main(String[] args) {
        byte [] bytes = {'a','b','c','d',127,-128} ;
        String a  = new String(bytes) ;
        System.out.println("a:"+a);
        for(byte b : bytes){
            System.out.println(b);
        }
    }
}