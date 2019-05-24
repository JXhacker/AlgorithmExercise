package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @Date 2019/5/22
 */
public class SumOfFactorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] fac = new int[10];
        fac[0] = 1;
        for (int i = 1; i <= 9; i++) fac[i] = fac[i - 1] * i;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 9; i >= 0; i--) {
                if (n >= fac[i]) n -= fac[i];
            }
            if (n == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
