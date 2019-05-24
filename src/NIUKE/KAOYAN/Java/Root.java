package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/8
 */
public class Root {
    private static long root(long N, long k) {
        if (N < k) return N;
        long temp = 0;
        while (N != 0) {
            temp += N % k;
            N /= k;
        }
        return root(temp, k);
    }

    private static long recursion(long x, long y, long k) {
        if (y == 1) return root(x, k);
        long result = recursion(x, y / 2, k);
        result *= result;
        if ((y & 1) == 1) {
            result *= recursion(x, 1, k);
        }
        return root(result, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x, y, k;
        while (sc.hasNext()) {
            x = sc.nextLong();
            y = sc.nextLong();
            k = sc.nextLong();
            System.out.println(recursion(x, y, k));
        }
    }
}
