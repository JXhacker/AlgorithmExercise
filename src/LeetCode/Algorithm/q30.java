package LeetCode.Algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wanzhiwen
 * @time 2019/3/12
 */
public class q30 {
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        if (words.length == 0) return ans;
        int length = s.length(), num = words.length, len = words[0].length();
        Map<String, Integer> indexs = new HashMap<>();
        for (String s1 : words) {
            indexs.put(s1, indexs.getOrDefault(s1, 0) + 1);
        }
        for (int i = 0; i <= length - num * len; i++) {
            Map<String, Integer> seen = new HashMap<>();
            boolean flag = true;
            String temp;
            for (int j = 0; j < num; j++) {
                temp = s.substring(i + j * len, i + (j + 1) * len);
                if (indexs.containsKey(temp)) {
                    seen.put(temp, seen.getOrDefault(temp, 0) + 1);
                    if (seen.get(temp) > indexs.get(temp)) {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) ans.add(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] test = {"foo", "bar"};
        String s = "barfoothefoobarman";
        findSubstring(s, test);
    }
}
