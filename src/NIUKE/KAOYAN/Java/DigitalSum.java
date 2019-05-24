package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @Date 2019/4/29
 */
public class DigitalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                int temp = sc.nextInt();
                if (temp < N) sum += temp;
            }
            System.out.println(sum);
        }
    }
}
