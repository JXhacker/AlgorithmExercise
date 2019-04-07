package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/7
 */
public class RecursionSequence {
    private static int recursion(int a0, int a1, int p, int q, int k){
        int a = a0, b = a1;
        int temp;
        for (int i = 2; i <= k; i++){
            temp = q * a + p * b;
            a = b;
            b = temp;
            if (b > 10000) b %= 10000;
        }
        return b % 10000;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a0, a1, p, q, k;
        while(sc.hasNext()){
            a0 = sc.nextInt();
            a1 = sc.nextInt();
            p = sc.nextInt();
            q = sc.nextInt();
            k = sc.nextInt();
            System.out.println(recursion(a0, a1, p, q, k));
        }
    }
}
