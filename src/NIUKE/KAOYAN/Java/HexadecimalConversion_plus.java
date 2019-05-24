package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/20
 */
public class HexadecimalConversion_plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int radix1 = sc.nextInt();
            String num = sc.next();
            int radix2 = sc.nextInt();
            System.out.println(Long.toString(Long.parseLong(num, radix1), radix2).toUpperCase());
        }
    }
}
