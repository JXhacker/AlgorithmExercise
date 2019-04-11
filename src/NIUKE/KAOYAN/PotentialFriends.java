package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/11
 */
public class PotentialFriends {
    public static void main(String[] args) {
        int N, M, count;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int[] likes = new int[N];
        for (int i = 0; i < N; i++) {
            likes[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            count = -1;
            for (int j = 0; j < N; j++) {
                if (likes[i] == likes[j]) count++;
            }
            if (count == 0) {
                System.out.println("BeiJu");
            } else {
                System.out.println(count);
            }
        }
    }
}
