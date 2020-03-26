package collection.shuzu;



/**
 * @Auther: Administrator
 * @Date: 2020/3/14 22:08
 * @Description:  字符串数组练习
 */
public class StringArray {

    public static void main(String[] args) {

       //one() ;

       //two() ;
        //three() ;
        four() ;

    }
        //本想将字符串数组转换为 字符串，结果转换失败。只能用char数组或者byete数组创建的字符串才能转换为字符串
    private static void four() {

        String [] arr = {"a","b","c"} ;
        String a = String.valueOf(arr);
        System.out.println(a);
    }
        //使用数组拼接字符串
    private static void three() {
        String arr[]  = {"array","list"} ;
        for (String s : arr) {
            System.out.print(s);
        }
    }
    //创建一个字符串数组   使用增强for输出
    private static void two() {
        String [] arr = {"你","好","中","国"} ;

        for(String a : arr){
            System.out.println(a);
        }

        for (String s : arr) {
            
        }
    }

    //创建一个字符串数组  遍历输出
    private static void one() {
        String [] arr = new String [5] ;
        arr[0] = "中国" ;
        arr[1] = "加油" ;
        arr[2] = "你最棒" ;
        arr[3] = "今天" ;
        arr[4] = "你" ;
        for (int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}