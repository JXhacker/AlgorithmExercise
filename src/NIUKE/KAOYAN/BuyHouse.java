package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/23
 */
public class BuyHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int ans, save = N;
            float price = 200;
            for (ans = 1; ans <= 21; ans++) {
                if (save >= price) {
                    System.out.println(ans);
                    break;
                } else {
                    price *= (1 + (float) K / 100);
                    save += N;
                }
            }
            if (ans == 22) {
                System.out.println("Impossible");
            }
        }
    }
}
