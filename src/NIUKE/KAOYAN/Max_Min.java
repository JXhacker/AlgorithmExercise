package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/1
 */
public class Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, n, max, min;
        while (sc.hasNext()) {
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
            N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                n = sc.nextInt();
                max = Math.max(max, n);
                min = Math.min(min, n);
            }
            System.out.println(max + " " + min);
        }
    }
}
