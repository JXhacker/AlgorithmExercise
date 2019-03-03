package LeetCode.Algorithm;

/**
 * @author wanzhiwen
 * @time 2019/3/3
 */
public class q26 {
    public int removeDuplicates(int[] nums) {
        int count = nums.length > 0 ? 1 : 0;
        for (int i : nums) {
            if (i != nums[count - 1]) {
                nums[count++] = i;
            }
        }
        return count;
    }
}
