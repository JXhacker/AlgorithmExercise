package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @Date 2019/4/30
 */
public class ChickenWithRabbitCage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            if (a % 2 != 0) {
                System.out.println(0 + " " + 0);
            } else if (a % 4 == 0) {
                System.out.println(a / 4 + " " + a / 2);
            } else {
                System.out.println((a - 2) / 4 + 1 + " " + a / 2);
            }
        }
    }
}
