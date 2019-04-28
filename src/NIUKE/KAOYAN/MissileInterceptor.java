package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @Date 2019/4/28
 */
public class MissileInterceptor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int k = sc.nextInt();
            int[] height = new int[k];
            int[] dp = new int[k];
            int max = 0;
            if (k >= 1) max = 1;
            for (int i = 0; i < k; i++) {
                height[i] = sc.nextInt();
            }
            for (int i = 0; i < k; i++) {
                dp[i] = 1;
                for (int j = i - 1; j >= 0; j--) {
                    if (height[j] >= height[i]) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                        max = Math.max(dp[i], max);
                    }
                }
            }
            System.out.println(max);
        }
    }
}
