package LeetCode.Algorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wanzhiwen
 * @time 2019/2/25
 */
public class q18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        for (int x = 0; x < nums.length - 3; x++) {
            if (x == 0 || nums[x] != nums[x - 1]) {
                for (int i = x + 1; i < nums.length - 2; i++) {
                    if (i == x + 1 || nums[i] != nums[i - 1]) {
                        int s = i + 1, e = nums.length - 1, sum = target - nums[x] - nums[i];
                        while (s < e) {
                            if (nums[s] + nums[e] == sum) {
                                res.add(Arrays.asList(nums[x], nums[i], nums[s], nums[e]));
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
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] test = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> re = fourSum(test,0);
        for (List<Integer> i : re) {
            for (Integer j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
