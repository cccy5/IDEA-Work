package com.date;

import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.*;

/**
 * @Auther: Administrator
 * @Date: 2020/2/20 17:57
 * @Description:Calendar的用法
 */
/*Calendar类有四种方法：
        1、 get
        2、 set
        3、 add
        4、 getTime 吧日历对象转换为日期对象
*
*/
public class CalendarDemo {
//Calendar 类设置过年月日以后的值只能通过get获取
    public static void main(String[] args) {
        // 创建Calendar对象
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        //set方法
        cal.set(YEAR,2015);
        //get方法
        int dayOfYear = cal.get(YEAR) ;
        System.out.println(dayOfYear);

        // add方法
        cal.add(YEAR,5);
        int dayOfYear1 = cal.get(YEAR) ;
        System.out.println(dayOfYear1);

        cal.set(2012,02,25);
        cal.get(YEAR) ;
        cal.get(MONTH) ;
        cal.get(DATE) ;
        System.out.println(cal.getTime());
        Date date = cal.getTime() ;
        System.out.println("date:"+date);
    }
}