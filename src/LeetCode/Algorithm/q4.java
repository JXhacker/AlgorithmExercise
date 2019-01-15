package LeetCode.Algorithm;

/**
 * @author wanzhiwen
 * @time 2019/1/14
 */
public class q4 {

    //referring to best answer
    public static double getkth(int[] A, int aStart, int[] B, int bStart, int k) {
        if (aStart > A.length - 1) return B[bStart + k - 1];
        if (bStart > B.length - 1) return A[aStart + k - 1];
        if (k==1){
            return Math.min(A[aStart],B[bStart]);
        }
        int aMid=Integer.MAX_VALUE,bMid=Integer.MAX_VALUE;
        if (aStart+k/2-1<A.length){
            aMid=A[aStart+k/2-1];
        }
        if (bStart+k/2-1<B.length){
            bMid=B[bStart+k/2-1];
        }
        if (aMid<bMid){
            return getkth(A,aStart+k/2,B,bStart,k-k/2);
        }else {
            return getkth(A,aStart,B,bStart+k/2,k-k/2);
        }
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l=(nums1.length+nums2.length+1)/2;
        int r=(nums1.length+nums2.length+2)/2;
        return (getkth(nums1,0,nums2,0,l)+getkth(nums1,0,nums2,0,r))/2;
    }


    public static void main(String[] args) {
        int[] a={1};
        int[] b={2,4,6,8};
        double res=findMedianSortedArrays(a,b);
        System.out.println(res);
    }

}
