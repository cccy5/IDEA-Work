package com.cy.day01;

import java.util.Random;
import java.util.Scanner;

/**
 * @Auther: Administrator
 * @Date: 2020/2/15 17:55
 * @Description:
 */
public class RandomDemo2 {
    public static void main(String[] args) {

        caishu2();
    }

    //   无限次数
    public static void caishu() {
        System.out.println("我们猜个数比大小");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100) + 1;

        while (true) {
            int a = scanner.nextInt();
            if (a > num) {
                System.out.println("太大了，请重试");
            }
            if (a < num) {
                System.out.println("太小了，请重试");
            }
            if (a == num) {
                System.out.println("恭喜你，猜对了");
                break;
            }
        }
        System.out.println("游戏结束");
    }

    //    有10次机会猜大小
    public static void caishu2() {
        System.out.println("我们来玩个游戏吧，猜数字比大小。你共有10次机会");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt(100) + 1;
        for (int i = 1; i < 11; i++) {
            int num = scanner.nextInt();
            if (num > a) {
                System.out.println("猜大了，你还有" + (10 - i) + "次机会");
            }
            if (num < a) {
                System.out.println("猜小了，你还有" + (10 - i) + "次机会");
            }
            if (num == a) {
                System.out.println("恭喜你猜对了，你还有" + (10 - i) + "次机会。" + "你只用了" + (i)+ "次机会");
                break;
            }
        }
        System.out.println("游戏结束");
    }
}