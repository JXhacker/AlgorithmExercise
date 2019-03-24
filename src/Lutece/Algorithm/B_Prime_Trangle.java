package Lutece.Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author wanzhiwen
 * @time 2019/3/23
 */
public class B_Prime_Trangle {
    private static List<Integer> prime(int m) {
        List<Integer> res = new ArrayList<>();
        boolean flag;
        for (int i = 2; i <= m; i++) {
            flag = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                res.add(i);
            }
        }
        return res;
    }

    public static int PrimeTriangle(int oneEdge, int maxLen) {
        int ans = 0;
        List<Integer> primeEdges = prime(maxLen);
        if (primeEdges.contains(oneEdge)) {
            for (int i = 0; i < primeEdges.size(); i++) {
                int plus=primeEdges.get(i) + oneEdge;
                plus=plus>maxLen?maxLen:plus;
                int minus=Math.abs(primeEdges.get(i) - oneEdge);
                ans = ans + plus-minus-1;
            }
        } else {
            for (int i = 0; i < primeEdges.size(); i++) {
                for (int j = i; j < primeEdges.size() && primeEdges.get(j) < oneEdge + primeEdges.get(i); j++) {
                    if (primeEdges.get(j) > Math.abs(oneEdge - primeEdges.get(i))) ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        //prime(b);
        System.out.println(PrimeTriangle(a, b));
    }
}
