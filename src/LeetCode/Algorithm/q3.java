package LeetCode.Algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author wanzhiwen
 * @time 2019/1/13
 */
public class q3 {

    //best answer
    public int lengthOfLongestSubstring2(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); ++i) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }

    //my answer
    public static int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0;
        int length = s.length();
        int count = 0;
        int maxCount = 0;
        ArrayList<Character> window = new ArrayList<>();
        for (; i < length; i++) {
            for (; j < length; j++) {
                if (window.contains(s.charAt(j))) {
                    if (count > maxCount) {
                        maxCount = count;
                    }
                    break;
                } else {
                    window.add(s.charAt(j));
                    count++;
                }
            }
            if (j == length) {
                if (count > maxCount) {
                    maxCount = count;
                }
            }
            j = i;
            count = 0;
            window.clear();
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int a = lengthOfLongestSubstring(" ");
        System.out.println(a);
    }

}
