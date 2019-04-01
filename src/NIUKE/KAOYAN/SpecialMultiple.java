package NIUKE.KAOYAN;

import java.util.*;
/**
 * @author wanzhiwen
 * @time 2019/4/1
 */
public class SpecialMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans, num1, num2;
        while (sc.hasNext()) {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            ans = 0;
            List<Integer> series1 = new ArrayList<>();
            List<Integer> series2 = new ArrayList<>();
            while (num1 > 0) {
                int temp = num1 % 10;
                series1.add(temp);
                num1 /= 10;
            }
            while (num2 > 0) {
                int temp = num2 % 10;
                series2.add(temp);
                num2 /= 10;
            }
            for (Integer aSeries1 : series1) {
                for (Integer aSeries2 : series2) {
                    ans += aSeries1 * aSeries2;
                }
            }
            System.out.println(ans);
        }
    }
}
