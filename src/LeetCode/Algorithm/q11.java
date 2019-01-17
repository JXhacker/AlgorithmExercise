package LeetCode.Algorithm;

/**
 * @author wanzhiwen
 * @time 2019/1/17
 */
public class q11 {

    //best java version(O(n))
    public static int maxArea1(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right])
                    * (right - left));
            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }

    //my answer
    public static int maxArea(int[] height) {
        int len=height.length;
        if (len==1 || len==0){
            return 0;
        }
        int l=0,r=1;
        int max=0;
        while (l<=len-2){
            r=l+1;
            while (r<=len-1){
                if ((r-l)*Math.min(height[l],height[r])>max){
                    max=(r-l)*Math.min(height[l],height[r]);
                }
                r++;
            }
            l++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] test={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea1(test));
    }
}
