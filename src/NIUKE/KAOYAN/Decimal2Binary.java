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
        StringBuilder ans;
        while (sc.hasNext()) {
            ans = new StringBuilder();
            N = sc.nextBigInteger();
            if (N.equals(zero)) {
                System.out.println(0);
            } else {
                while (!N.equals(zero)) {
                    ans.insert(0, N.mod(two).toString());
                    N = N.divide(two);
                }
                System.out.println(ans);
            }
        }
    }
}
