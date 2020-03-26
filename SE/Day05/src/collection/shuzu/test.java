package collection.shuzu;

/**
 * @Auther: Administrator
 * @Date: 2020/3/14 22:46
 * @Description: 测试类
 */
public class test {
    public static void main(String[] args) {
        String arr[] = {"de", "分", "放", "是"};
        System.out.println(arr);
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("=======================================");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}