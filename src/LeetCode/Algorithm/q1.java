package LeetCode.Algorithm;

import java.util.Arrays;

/**
 * @author wanzhiwen
 * @time 2018/12/25
 */
public class q1 {

    private static int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return null;
        }
        int[] nums2 = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums2);
        int a = 0, b = nums2.length - 1;
        while (a < b) {
            if (nums2[a] + nums2[b] > target) {
                b--;
            } else if (nums2[a] + nums2[b] < target) {
                a++;
            } else {
                break;
            }
        }
        if (a == b) {
            return null;
        }
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums2[a]) {
                result[0] = i;
                break;
            }
        }
        if (nums2[a] != nums2[b]) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == nums2[b]) {
                    result[1] = i;
                    break;
                }
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == nums2[b] && i != result[0]) {
                    result[1] = i;
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int test[] = {3, 3};
        int target = 6;
        int[] result = new int[2];
        result = twoSum(test, target);
        System.out.println(result[0] + "、" + result[1]);
    }


}
