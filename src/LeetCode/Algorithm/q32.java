package LeetCode.Algorithm;

import java.util.Stack;

/**
 * @author wanzhiwen
 * @time 2019/3/12
 */
public class q32 {
    public int longestValidParentheses(String s) {
        int[] dp = new int[s.length()];
        int lcount = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                lcount++;
            } else {
                if (lcount > 0) {
                    dp[i] = dp[i - 1] + 2;
                    dp[i] += i - dp[i] >= 0 ? dp[i - dp[i]] : 0;
                    max = Math.max(max, dp[i]);
                    lcount--;
                }
            }
        }
        return max;
    }
}
