package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/2
 */
public class IntegerSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ans = new int[1000000];
        int N;
        ans[1] = 1;
        for (int i = 2; i < 1000000; i++) {
            if (i % 2 == 0) {
                ans[i] = (ans[i / 2] + ans[i - 1]) % 1000000000;
            } else {
                ans[i] = ans[i - 1] % 1000000000;
            }
        }
        while (sc.hasNext()) {
            N = sc.nextInt();
            System.out.println(ans[N]);
        }
    }
}
