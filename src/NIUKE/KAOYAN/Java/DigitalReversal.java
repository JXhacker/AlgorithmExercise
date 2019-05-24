package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @Date 2019/5/20
 */
public class DigitalReversal {
    private static int reverseInteger(int num) {
        String s = String.valueOf(num);
        String s_t = new StringBuilder(s).reverse().toString();
        return Integer.parseInt(s_t);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum_t = reverseInteger(a + b);
            int a_t = reverseInteger(a);
            int b_t = reverseInteger(b);
            if (sum_t == (a_t + b_t)) {
                System.out.println(a + b);
            } else {
                System.out.println("NO");
            }
        }
    }
}
