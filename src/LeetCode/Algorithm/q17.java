package LeetCode.Algorithm;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/2/25
 */
public class q17 {
    public static List<String> letterCombinations(String digits) {
        LinkedList<String> res = new LinkedList<>();
        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for (int i = 0; i < digits.length(); i++) {
            int num = Character.getNumericValue(digits.charAt(i));
            if (res.peek()==null) {
                for (int j = 0; j < mapping[num].length(); j++) {
                    res.add(String.valueOf(mapping[num].charAt(j)));
                }
            } else {
                while (res.peek()!=null && res.peek().length() == i) {
                    String temp = res.removeFirst();
                    for (int j = 0; j < mapping[num].length(); j++) {
                        res.add(temp+String.valueOf(mapping[num].charAt(j)));
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<String>ans=letterCombinations("23");
        for (String i:ans){
            System.out.println(i);
        }
    }
}
