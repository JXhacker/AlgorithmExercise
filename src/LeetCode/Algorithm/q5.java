package LeetCode.Algorithm;

/**
 * @author wanzhiwen
 * @time 2019/1/15
 */
public class q5 {

    //referring to best answer
    private static int begin = 0, maxLen = 0;

    private static String longestPalindrome(String s) {
        if (s.length()<2){
            return s;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i + 1);
        }
        return s.substring(begin, begin + maxLen);
    }

    private static void extendPalindrome(String s, int b, int e) {
        while (b >= 0 && e < s.length() && s.charAt(b) == s.charAt(e)) {
            b--;
            e++;
        }
        if (e - b - 1 > maxLen) {
            begin = b + 1;
            maxLen = e - b - 1;
        }
    }

    public static void main(String[] args) {
        String res = longestPalindrome("ac");
        System.out.println(res);
    }

}
