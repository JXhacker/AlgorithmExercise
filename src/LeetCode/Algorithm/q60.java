package LeetCode.Algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanzhiwen
 * @time 2019/3/5
 */
public class q60 {
    public static String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int temp=0;
        int[] factorial = new int[n + 1];
        StringBuilder ans = new StringBuilder();
        factorial[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        for (; n > 0; n--) {
            temp = k / factorial[n - 1];
            if (k % factorial[n - 1]==0)temp--;
            ans.append(numbers.get(temp));
            numbers.remove(temp);
            k-=temp*factorial[n - 1];
        }
        return String.valueOf(ans);
    }

    public static void main(String[] args) {
        System.out.println(getPermutation(3,3));
    }
}
