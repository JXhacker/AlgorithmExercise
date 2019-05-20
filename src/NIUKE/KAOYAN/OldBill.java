package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @Date 2019/5/20
 */
public class OldBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            boolean flag = false;
            for (int i = 9; i > 0 && !flag; i--) {
                for (int j = 9; j >= 0 && !flag; j--) {
                    int digits = i * 10000 + X * 1000 + Y * 100 + Z * 10 + j;
                    if (digits % N == 0) {
                        System.out.print(i + " " + j + " ");
                        System.out.println(digits / N);
                        flag = true;
                    }
                }
            }
            if (!flag) {
                System.out.println(0);
            }
        }
    }
}
