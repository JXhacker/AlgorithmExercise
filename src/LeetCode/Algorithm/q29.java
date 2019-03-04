package LeetCode.Algorithm;

/**
 * @author wanzhiwen
 * @time 2019/3/3
 */
public class q29 {

    public static int divide(int dividend, int divisor) {
        int sign = 1;
        if (dividend > 0 && divisor < 0 || dividend < 0 && divisor > 0) sign = -1;
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);
        long ans = ldivide(ldividend, ldivisor);
        if (sign == 1 && ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (sign==1)return (int) ans;
        return (int) -ans;
    }

    private static long ldivide(long ldividend, long ldivisor) {
        if (ldividend < ldivisor) return 0;
        long sum = ldivisor;
        int multiple = 1;
        while ((sum + sum) < ldividend) {
            multiple += multiple;
            sum += sum;
        }
        return multiple + ldivide(ldividend - sum, ldivisor);
    }

    public static void main(String[] args) {
        System.out.println(divide(-4,1));
    }
}
