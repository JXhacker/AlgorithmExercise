package LeetCode.Algorithm;

/**
 * @author wanzhiwen
 * @time 2019/3/13
 */
public class q35 {
    public int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length,mid=(left+right)/2;
        if(nums.length==0)return 0;
        if(nums[left]>target)return 0;
        if(nums[right-1]<target)return nums.length;
        while(right>left){
            if(nums[mid]>target){
                right=mid;
                mid=(left+right)/2;
            }else if(nums[mid]<target){
                left=mid;
                mid=(left+right)/2;
            }else{
                return mid;
            }
            if(left==mid){
                if(nums[left]==target)return left;
                else return right;
            }
        }
        return -1;
    }
}
