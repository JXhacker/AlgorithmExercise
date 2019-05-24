package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/23
 */
public class MaxSubMatrix {
    //求一个数组的最大子数组
    private static int maxSub(int[] arr, int N) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (sum > 0) {
                sum += arr[i];
            } else {
                sum = arr[i];
            }
            if (sum > max) max = sum;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int max = Integer.MIN_VALUE;
            int[][] matrix = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < N; i++) {
                int[] arr = new int[N];
                for (int j = i; j < N; j++) {
                    for (int k = 0; k < N; k++) {
                        arr[k] += matrix[j][k];
                    }
                    max = Math.max(max, maxSub(arr, N));
                }
            }
            System.out.println(max);
        }
    }
}
