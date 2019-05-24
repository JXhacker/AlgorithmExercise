package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/5
 */
public class DayOfYear {
    public static int today(int year, int month, int day) {
        List<Integer> monthPeace = Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30);
        List<Integer> monthLeap = Arrays.asList(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30);
        int ans = 0;
        if (year % 4 == 0) {
            for (int i = 0; i < month - 1; i++) {
                ans += monthLeap.get(i);
            }
            ans += day;
        } else {
            for (int i = 0; i < month - 1; i++) {
                ans += monthPeace.get(i);
            }
            ans += day;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, month, day;
        while (sc.hasNext()) {
            year = sc.nextInt();
            month = sc.nextInt();
            day = sc.nextInt();
            System.out.println(today(year, month, day));
        }
    }
}
