package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @Date 2019/5/5
 */
public class StringMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String T = sc.next();
            String P = sc.next();
            int ans = 0;
            for (int i = 0; i < T.length() - P.length() + 1; i++) {
                if (T.substring(i, i + P.length()).equals(P)) ans++;
            }
            System.out.println(ans);
        }
    }
}
