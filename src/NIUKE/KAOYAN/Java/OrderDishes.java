package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/24
 */
public class OrderDishes {
    private static int dp(int C, int N, int[] score, int[] price) {
        int[][] dp = new int[N + 1][C + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= C; j++) {
                if (j >= price[i - 1]) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - price[i - 1]] + score[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[N][C];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int C = sc.nextInt();
            int N = sc.nextInt();
            int[] score = new int[N];
            int[] price = new int[N];
            for (int i = 0; i < N; i++) {
                price[i] = sc.nextInt();
                score[i] = sc.nextInt();
            }
            System.out.println(dp(C, N, score, price));
        }
    }
}
