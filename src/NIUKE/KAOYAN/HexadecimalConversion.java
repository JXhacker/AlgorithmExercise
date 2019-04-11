package NIUKE.KAOYAN;

import java.util.*;
import java.math.BigInteger;

/**
 * @author wanzhiwen
 * @time 2019/4/11
 */
public class HexadecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n;
        BigInteger zero = new BigInteger("0");
        BigInteger two = new BigInteger("2");
        List<BigInteger> ans;
        while (sc.hasNext()) {
            n = sc.nextBigInteger();
            ans = new ArrayList<>();
            if (n.compareTo(zero) == 0) {
                System.out.println(zero);
            } else {
                while (n.compareTo(zero) != 0) {
                    ans.add(n.mod(two));
                    n = n.divide(two);
                }
                for (int i = ans.size() - 1; i >= 0; i--) {
                    System.out.print(ans.get(i));
                }
                System.out.println();
            }
        }
    }
}
