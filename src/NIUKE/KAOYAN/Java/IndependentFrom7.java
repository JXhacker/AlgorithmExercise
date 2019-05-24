package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/20
 */
public class IndependentFrom7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, ans;
        while (sc.hasNext()) {
            N = sc.nextInt();
            ans = 0;
            for (int i = 1; i <= N; i++) {
                if (i % 7 != 0 && !String.valueOf(i).contains("7")) {
                    ans += Math.pow(i, 2);
                }
            }
            System.out.println(ans);
        }
    }
}
