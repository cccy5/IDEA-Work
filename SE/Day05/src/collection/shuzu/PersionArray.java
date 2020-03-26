package collection.shuzu;

/**
 * @Auther: Administrator
 * @Date: 2020/3/14 22:08
 * @Description:  用数组存储Persion 对象
 */
public class PersionArray {
    public static void main(String[] args) {

        Persion persion [] =new Persion[5] ;
        Persion p = new Persion("张三",18) ;
        persion[0] = p ;

      //System.out.println(persion[0].getName()+persion[0].getAge());
      System.out.println(persion[0]);
    }


}