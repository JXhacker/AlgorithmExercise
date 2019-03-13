package LeetCode.Algorithm;

/**
 * @author wanzhiwen
 * @time 2019/3/13
 */
public class q34 {
    public int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (r >= l) {
            if (nums[l] != target && nums[r] != target) {
                l++;
                r--;
            } else if (nums[l] == target && nums[r] != target) {
                r--;
            } else if (nums[l] != target && nums[r] == target) {
                l++;
            } else {
                return new int[]{l, r};
            }
        }
        return new int[]{-1, -1};
    }
}
