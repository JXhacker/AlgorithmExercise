package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @Date 2019/4/26
 */
public class ChorusFormation {

    //递归(容易栈溢出)    Maxqueue(0, N - 1, height)
    private static int Maxqueue(int l, int r, List<Integer> height) {
        while (r - l > 1) {
            if (height.get(l + 1) < height.get(l) && height.get(r - 1) < height.get(r)) {
                int temp = height.remove(l + 1);
                int removel = Maxqueue(l, r - 1, height);
                height.add(l + 1, temp);
                temp = height.remove(r - 1);
                int remover = Maxqueue(l, r - 1, height);
                height.add(r - 1, temp);
                return Math.min(removel, remover) + 1;
            }
            if (l + 1 != r && height.get(l + 1) >= height.get(l)) {
                l++;
            }
            if (r - 1 != l && height.get(r - 1) >= height.get(r)) {
                r--;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] arr = new int[n];
            int[] left = new int[n];
            int[] right = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            //动态规划
            //求最长递增子序列
            for (int i = 0; i < n; i++) {
                left[i] = 1;
                for (int j = i - 1; j >= 0; j--)
                    if (arr[j] < arr[i])
                        left[i] = Math.max(left[i], left[j] + 1);
            }

            //求从右边数起的最长递减子序列
            for (int i = n - 1; i >= 0; i--) {
                right[i] = 1;
                for (int j = i + 1; j < n; j++)
                    if (arr[i] > arr[j])
                        right[i] = Math.max(right[i], right[j] + 1);
            }
            int max = 0;
            for (int i = 0; i < n; i++) {
                max = Math.max(max, left[i] + right[i] - 1);
            }
            System.out.println(n - max);
        }
    }
}
