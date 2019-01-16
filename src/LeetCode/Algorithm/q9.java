package LeetCode.Algorithm;

/**
 * @author wanzhiwen
 * @time 2019/1/16
 */
public class q9 {

    //best java version
    public static boolean isPalindrome1(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }


    //my answer
    public static boolean isPalindrome(int x) {
        String input = String.valueOf(x);
        int begin = 0;
        int end = input.length() - 1;
        while (end >= begin) {
            if (input.charAt(end) == input.charAt(begin)) {
                end--;
                begin++;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome1(121));
    }
}
