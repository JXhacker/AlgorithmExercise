package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/22
 */
public class CreditGradePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] credits = new int[n];
            int creditsSum = 0, score;
            float pointSum = 0;
            for (int i = 0; i < n; i++) {
                credits[i] = sc.nextInt();
                creditsSum += credits[i];
            }
            for (int i = 0; i < n; i++) {
                score = sc.nextInt();
                if (score >= 90) {
                    pointSum += 4.0 * credits[i];
                } else if (score >= 85) {
                    pointSum += 3.7 * credits[i];
                } else if (score >= 82) {
                    pointSum += 3.3 * credits[i];
                } else if (score >= 78) {
                    pointSum += 3.0 * credits[i];
                } else if (score >= 75) {
                    pointSum += 2.7 * credits[i];
                } else if (score >= 72) {
                    pointSum += 2.3 * credits[i];
                } else if (score >= 68) {
                    pointSum += 2.0 * credits[i];
                } else if (score >= 64) {
                    pointSum += 1.5 * credits[i];
                } else if (score >= 60) {
                    pointSum += 1.0 * credits[i];
                } else {
                    pointSum += 0;
                }
            }
            System.out.println(String.format("%.2f", pointSum / creditsSum));

        }
    }
}
