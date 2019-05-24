package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/22
 */
public class MagicPocket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int[] goods = new int[N];
            int[][] dp = new int[N + 1][41];
            for (int i = 0; i < N; i++) {
                goods[i] = sc.nextInt();
            }
            dp[0][0] = 1;
            for (int i = 1; i <= N; i++) {
                for (int j = 0; j <= 40; j++) {
                    dp[i][j] = dp[i - 1][j];
                    if (j >= goods[i - 1]) {
                        dp[i][j] += dp[i - 1][j - goods[i - 1]];
                    }
                }
            }
            System.out.println(dp[N][40]);
        }
    }
}
