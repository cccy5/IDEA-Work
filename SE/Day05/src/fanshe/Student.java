package fanshe;

import java.util.Scanner;

/**
 * @Auther: Administrator
 * @Date: 2020/3/16 21:08
 * @Description:
 */
public class Student {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e;
        a = sc.nextInt();
        if (a % 3 == 1) {
            a += 2;
        } else if (a % 3 == 2) {
            a += 1;
        }
        for (b = 1; b <= a; b++) {
            for (e = 1; e <= a / 3; e++) {
                System.out.print("  ");
            }
            for (d = a / 3; d >= b + 1; d--) {
                System.out.print(" ");
            }
            for (c = 1; c <= b; c++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        int h, i, j, k;
        j = a;
        for (h = 1; h <= a / 3; h++) {
            for (k = 1; k <= h - 1; k++) {
                System.out.print(" ");
            }
            for (i = j; i >= 1; i--) {
                System.out.print(" *");
            }
            j--;
            System.out.println();
        }
        int l, m, n, o, p, q;
        n = a;
        p = (n - a / 3) / 2 + 1;
        q = (n - a / 3) / 2 + 1;
        for (l = 1; l <= a / 3; l++) {
            for (o = a / 3 - 1; o >= 1; o--) {
                System.out.print("  ");
            }
            for (m = l; m <= n - a / 3 + 1; m++) {
                if (m == q || m == p || (m > p && m < q)) {
                    System.out.print("  ");
                } else {
                    System.out.print(" *");
                }
            }
            p += 2;
            q--;
            n++;
            System.out.println();
        }
    }
}