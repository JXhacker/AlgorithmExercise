package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/9
 */
public class MaxSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, seq, max, sum;
        while (sc.hasNext()) {
            max = Integer.MIN_VALUE;
            sum = 0;
            num = sc.nextInt();
            for (int i = 0; i < num; i++) {
                seq = sc.nextInt();
                sum += seq;
                if (sum > max) max = sum;
                if (sum < 0) sum = 0;
            }
            System.out.println(max);
        }
    }
}
