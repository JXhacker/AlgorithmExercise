package LeetCode.Algorithm;

/**
 * @author wanzhiwen
 * @time 2019/3/13
 */
public class q33 {
    public int search(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            if (nums[i]==target) return i;
            if (target<nums[i]) break;
        }
        for (int j=nums.length-1;j>=0;j--){
            if (nums[j]==target) return j;
            if (target>nums[j]) break;
        }
        return -1;
    }
}
