package LeetCode.Algorithm;

/**
 * @author wanzhiwen
 * @time 2019/3/6
 */
public class q31 {
    public static void nextPermutation(int[] nums) {
        int length = nums.length;
        int cut1, cut2;
        for (cut1 = length - 1; cut1 > 0; cut1--) {
            if (nums[cut1] > nums[cut1 - 1]) break;
        }
        if (cut1 == 0) {
            reverse(nums, 0, length - 1);
        } else {
            for (cut2 = length - 1; nums[cut1 - 1] >= nums[cut2]; ) cut2--;
            int temp = nums[cut1 - 1];
            nums[cut1 - 1] = nums[cut2];
            nums[cut2] = temp;
            reverse(nums, cut1, length - 1);
        }
    }

    public static void reverse(int[] nums, int begin, int end) {
        while (end > begin) {
            int temp = nums[begin];
            nums[begin] = nums[end];
            nums[end] = temp;
            end--;
            begin++;
        }
    }
}
