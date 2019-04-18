package NIUKE.KAOYAN;

import java.util.*;
import java.math.BigInteger;

/**
 * @author wanzhiwen
 * @time 2019/4/18
 */
public class Decimal2Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger zero = new BigInteger("0");
        BigInteger two = new BigInteger("2");
        BigInteger N;
        String ans;
        while (sc.hasNext()) {
            ans = "";
            N = sc.nextBigInteger();
            if (N.equals(zero)) {
                System.out.println(0);
            } else {
                while (!N.equals(zero)) {
                    ans = N.mod(two).toString() + ans;
                    N = N.divide(two);
                }
                System.out.println(ans);
            }
        }
    }
}
