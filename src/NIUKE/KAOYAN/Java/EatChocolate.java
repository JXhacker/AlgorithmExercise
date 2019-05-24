package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/20
 */
public class EatChocolate {
    private static int eatChocolate(int N) {
        if (N == 1) return 1;
        if (N == 2) return 2;
        return eatChocolate(N - 1) + eatChocolate(N - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        while (sc.hasNext()) {
            N = sc.nextInt();
            System.out.println(eatChocolate(N));
        }
    }
}
