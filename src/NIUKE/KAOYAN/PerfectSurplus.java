package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/7
 */
public class PerfectSurplus {
    private static int factor_sum(int n) {
        int ans = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i != Math.sqrt(n) && n / i != n) {
                    ans = ans + i + n / i;
                } else {
                    ans = ans + i;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> wanshu = new ArrayList<>();
        List<Integer> yinshu = new ArrayList<>();
        for (int i = 2; i <= 60; i++) {
            if (factor_sum(i) == i) {
                wanshu.add(i);
            } else if (factor_sum(i) > i) {
                yinshu.add(i);
            }
        }
        System.out.print("E: ");
        for (int i = 0; i < wanshu.size() - 1; i++) {
            System.out.print(wanshu.get(i) + " ");
        }
        System.out.println(wanshu.get(wanshu.size() - 1));
        System.out.print("G: ");
        for (int i = 0; i < yinshu.size() - 1; i++) {
            System.out.print(yinshu.get(i) + " ");
        }
        System.out.print(yinshu.get(yinshu.size() - 1));
    }
}
