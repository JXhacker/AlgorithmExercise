package LeetCode.Algorithm;

import java.util.Stack;

/**
 * @author wanzhiwen
 * @time 2019/2/27
 */
public class q20 {


    //best java version
    public static boolean isValid1(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    //my answer
    private static boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        if (s.length() == 0) return true;
        if (s.length() == 1) return false;
        stack.push(String.valueOf(s.charAt(0)));
        for (int i = 1; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(String.valueOf(s.charAt(i)));
            } else {
                if ((String.valueOf(s.charAt(i)).equals(")") && stack.peek().equals("(")) || (String.valueOf(s.charAt(i)).equals("]") && stack.peek().equals("[")) || (String.valueOf(s.charAt(i)).equals("}") && stack.peek().equals("{"))) {
                    stack.pop();
                } else {
                    stack.push(String.valueOf(s.charAt(i)));
                }
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid1("[]}"));
    }
}
