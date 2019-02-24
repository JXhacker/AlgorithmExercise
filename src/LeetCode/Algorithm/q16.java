package LeetCode.Algorithm;

import java.util.Arrays;

/**
 * @author wanzhiwen
 * @time 2019/2/24
 */
public class q16 {
    //my answer
    public static int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (Math.abs(nums[i] + nums[j] + nums[k] - target) < Math.abs(res - target)) {
                        res = nums[i] + nums[j] + nums[k];
                    }
                }
            }
        }
        return res;
    }

    //best java version
    public static int threeSumClosest2(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1, end = nums.length - 1;
            while (start < end){
                if (Math.abs(res-target)>Math.abs(nums[i]+nums[start]+nums[end]-target)){
                    res=nums[i]+nums[start]+nums[end];
                }
                if (nums[i]+nums[start]+nums[end]>target){
                    end--;
                }else if (nums[i]+nums[start]+nums[end]<target){
                    start++;
                }else {
                    return res;
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] test = {1, 1, -1, -1, 3};
        int target = -1;
        int res = threeSumClosest2(test, target);
        System.out.println(res);
    }
}
