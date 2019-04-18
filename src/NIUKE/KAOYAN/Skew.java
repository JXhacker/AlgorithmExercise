package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/18
 */
public class Skew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            int ans = 0;
            for (int i = 0; i < str.length(); i++) {
                ans = ans + (str.charAt(i) - '0') * (int) (Math.pow(2, str.length() - i) - 1);
            }
            System.out.println(ans);
        }
    }
}
