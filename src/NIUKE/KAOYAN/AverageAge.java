package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/21
 */
public class AverageAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            float sum = 0;
            for (int i = 0; i < N; i++) {
                sum += sc.nextFloat();
            }
            System.out.println(String.format("%.2f", sum / N));
        }
    }
}
