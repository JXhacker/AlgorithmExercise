package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @Date 2019/4/27
 */
public class herbalism {
    private static int dp(int[] time, int[] value, int T, int M) {
        int[] dp = new int[T + 1];
        for (int i = 0; i < M; i++) {
            for (int j = T; j >= 0; j--) {
                if (j >= time[i]) {
                    dp[j] = Math.max(dp[j], dp[j - time[i]] + value[i]);
                }
            }
        }
        return dp[T];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int T, M;
            int[] time, value;
            T = sc.nextInt();
            M = sc.nextInt();
            time = new int[M];
            value = new int[T];
            for (int i = 0; i < M; i++) {
                time[i] = sc.nextInt();
                value[i] = sc.nextInt();
            }
            System.out.println(dp(time, value, T, M));
        }
    }
}
