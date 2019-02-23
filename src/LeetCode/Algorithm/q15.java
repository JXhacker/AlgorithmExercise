package LeetCode.Algorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wanzhiwen
 * @time 2019/2/23
 */
public class q15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int s = i + 1, e = nums.length - 1, sum = -nums[i];
                while (s < e) {
                    if (nums[s] + nums[e] == sum) {
                        res.add(Arrays.asList(nums[i], nums[s], nums[e]));
                        while (s < e && nums[s] == nums[s + 1]) s++;
                        while (s < e && nums[e] == nums[e - 1]) e--;
                        e--;
                        s++;
                    } else if (nums[s] + nums[e] > sum) {
                        e--;
                    } else {
                        s++;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] test = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> re = threeSum(test);
        for (List<Integer> i : re) {
            for (Integer j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
