package LeetCode.Algorithm;

/**
 * @author wanzhiwen
 * @time 2019/3/3
 */
public class q27 {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i : nums) {
            if (i != val) {
                nums[count++] = i;
            }
        }
        return count;
    }
}
