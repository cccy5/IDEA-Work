package collection.shuzu;

/**
 * @Auther: Administrator
 * @Date: 2020/3/14 22:07
 * @Description:  int 数组练习   常见的数组三种创建方式
 */
public class IntArray {
    /*
        1、 int arr[] = new int [数组长度] ;
        2、 int [] arr  = new int {} ;
        3、 int [] arr = {} ;
    */
    public static void main(String[] args) {
        int arr[] = new int[5];
        int i = 0;
        for (int j = 10; j < 15; j++) {
            //  System.out.println(i);
            arr[i] = j;
            i++;
        }
        System.out.println(arr);
        for(int a = 0 ; a <arr.length ; a++){
           System.out.println(arr[a]);
        }

    }
}