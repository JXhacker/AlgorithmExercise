package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/20
 */
public class BinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        while (sc.hasNext()) {
            x = sc.nextInt();
            y = sc.nextInt();
            while (x != y) {
                if (x > y) x /= 2;
                else y /= 2;
            }
            System.out.println(x);
        }
    }
}
