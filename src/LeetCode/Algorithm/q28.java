package LeetCode.Algorithm;

/**
 * @author wanzhiwen
 * @time 2019/3/3
 */
public class q28 {

    //best java version
    public int strStr1(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }
    public int strStr2(String haystack, String needle) {
        int l1 = haystack.length(), l2 = needle.length();
        if (l1 < l2) {
            return -1;
        } else if (l2 == 0) {
            return 0;
        }
        int threshold = l1 - l2;
        for (int i = 0; i <= threshold; ++i) {
            if (haystack.substring(i,i+l2).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    //my answer
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int flag = 0;
                int j=0;
                for (; j < needle.length() && i + j < haystack.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        flag = 1;
                        break;
                    }
                }
                if (flag==0 && j==needle.length()){
                    return i;
                }
            }
        }
        return -1;
    }
}
