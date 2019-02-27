package LeetCode.Algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanzhiwen
 * @time 2019/2/27
 */
public class q22 {
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        addBracket(res, "", 0, 0, n);
        return res;
    }

    public static void addBracket(List<String> list, String s, int left, int right, int n) {
        if (left == n && right == n) {
            list.add(s);
            return;
        }
        if (left < n) {
            addBracket(list, s + "(", left + 1, right, n);
        }
        if (left > right) {
            addBracket(list, s + ")", left, right + 1, n);
        }
    }

    public static void main(String[] args) {
        List<String>ans=generateParenthesis(3);
        for (String i : ans){
            System.out.print(i+" ");
        }
    }
}
