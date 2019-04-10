package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/10
 */
public class Factorial_plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int top, add, temp;
        while (sc.hasNext()) {
            top = 0;
            add = 0;
            N = sc.nextInt();
            int[] ans = new int[3000];
            ans[0] = 1;
            for (int i = 2; i <= N; i++) {
                for (int j = 0; j <= top; j++) {
                    temp = (ans[j] * i);
                    ans[j] = (temp + add) % 10;
                    add = (temp + add) / 10;
                }
                while (add != 0) {
                    ans[++top] = add % 10;
                    add /= 10;
                }
            }
            for (int i = top; i >= 0; i--) {
                System.out.print(ans[i]);
            }
            System.out.println();
        }
    }
}
