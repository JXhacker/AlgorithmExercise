package NIUKE.KAOYAN;

import java.math.BigInteger;
import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/11
 */
public class Binary2Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A, B;
        BigInteger zero = new BigInteger("0");
        BigInteger two = new BigInteger("2");
        while (sc.hasNext()) {
            A = sc.nextBigInteger();
            B = new BigInteger("0");
            List<BigInteger> list = new ArrayList<>();
            while (A.compareTo(zero) == 1) {
                list.add(A.mod(two));
                A = A.divide(two);
            }
            for (int i = 0; i < list.size() - 1; i++) {
                B = (B.add(list.get(i))).multiply(two);
            }
            B = B.add(list.get(list.size() - 1));
            System.out.println(B);
        }
    }
}
