package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/4
 */
public class Min_Stamp {
    private static int minStamp(int[] stamp, int num, int target) {
        int[] dp = new int[target + 1];
        for (int i = 0; i <= target; i++){
            dp[i] = Integer.MAX_VALUE / 2;
        }
        dp[0] = 0;
        for (int i = 1; i <= num; i++){
            for (int j = target; j >= stamp[i]; j--){
                dp[j] = Math.min(dp[j], dp[j - stamp[i]] + 1);
            }
        }
        return dp[target] >= Integer.MAX_VALUE / 2 ? 0 : dp[target];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target, num;
        int[] stamp;
        while (sc.hasNext()) {
            target = sc.nextInt();
            num = sc.nextInt();
            stamp = new int[num + 1];
            for (int i = 1; i <= num; i++) {
                stamp[i] = sc.nextInt();
            }
            System.out.println(minStamp(stamp, num, target));
        }
    }
}
