package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @Date 2019/5/20
 */
public class Fibonacci {
    private static int F(int i) {
        if (i == 0) return 0;
        if (i == 1) return 1;
        return F(i - 1) + F(i - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            System.out.println(F(N));
        }
    }
}
