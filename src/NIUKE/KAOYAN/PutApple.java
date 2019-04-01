package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/1
 */
public class PutApple {
    //该函数表示m个苹果放在n个盘子的方案数
    private static int putApple(int m, int n) {
        //三个迭代退出条件
        if (n > m) return putApple(m, m);
        if (n == 1) return 1;
        if (m == 0) return 1;
        //动态规划核心：f(m,n)=f(m,n-1)+f(m-n,n);
        return putApple(m, n - 1) + putApple(m - n, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        while (sc.hasNext()) {
            m = sc.nextInt();
            n = sc.nextInt();
            System.out.println(putApple(m, n));
        }
    }
}
