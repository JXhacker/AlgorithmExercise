package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/15
 */
public class Simplest_true_score {
    private static boolean simplest_true_score(int num1, int num2) {
        if (num1 == num2) return false;
        //double temp = Math.sqrt(Math.max(num1, num2));
        int temp = Math.min(num1, num2);
        for (int i = 2; i <= temp; i++) {
            if (num1 % i == 0 && num2 % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count;
        int[] nums;
        while (sc.hasNext()) {
            count = 0;
            n = sc.nextInt();
            nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (simplest_true_score(nums[i], nums[j])) count++;
                }
            }
            System.out.println(count);
        }
    }
}
