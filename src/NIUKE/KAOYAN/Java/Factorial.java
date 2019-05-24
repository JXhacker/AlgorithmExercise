package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/1
 */
public class Factorial {
    private static long factorial(long num) {
        if (num == 1) return 1;
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long num = sc.nextLong();
            System.out.println(factorial(num));
        }
    }
}
