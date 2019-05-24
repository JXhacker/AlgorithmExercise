package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @Date 2019/4/29
 */
public class BinaryTree2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int ans = 0;
            int count = 0;
            int l = m;
            while (n > m) {
                ans += Math.pow(2, count);
                count++;
                m = 2 * m + 1;
                l = 2 * l;
            }
            if (n >= l) {
                ans = ans + (int) Math.pow(2, count) - (m - n);
            }
            System.out.println(ans);
        }
    }
}
