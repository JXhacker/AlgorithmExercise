package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @Date 2019/5/22
 */
public class EvaluationExpression {

    private static int getPriority(char c) {
        if (c == '+' || c == '-') return 1;
        else return 2;
    }

    private static double cal(double x, double y, char op) {
        if (op == '+') return x + y;
        else if (op == '-') return x - y;
        else if (op == '*') return x * y;
        else return x / y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Stack<Double> data = new Stack<>();
            Stack<Character> op = new Stack<>();
            String input = sc.nextLine();
            int i = 0;
            while (i < input.length()) {
                char ci = input.charAt(i);
                if (ci >= '0' && ci <= '9') {
                    int d = 0;
                    while (i < input.length() && input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                        d = d * 10 + input.charAt(i) - '0';
                        i++;
                    }
                    data.push((double)d);
                } else {//注意i++
                    if (op.empty()){
                        op.push(input.charAt(i));
                    } else {
                        if (getPriority(input.charAt(i)) > getPriority(op.peek())) {
                            op.push(input.charAt(i));
                        } else {
                            while (!op.empty() && getPriority(input.charAt(i)) <= getPriority(op.peek())){
                                double y = data.pop();
                                double x = data.pop();
                                char oper = op.pop();
                                double ans = cal(x, y, oper);
                                data.push(ans);
                            }
                            op.push(input.charAt(i));
                        }
                    }
                    i++;
                }
            }
            if (!op.empty() && getPriority(op.peek()) == 2) {
                double x3 = data.pop();
                double x2 = data.pop();
                double x1 = data.pop();
                char op2 = op.pop();
                char op1 = op.pop();
                double ans = cal(x1, cal(x2, x3, op2), op1);
                System.out.println((int)ans);
            } else {
                double x2 = data.pop();
                double x1 = data.pop();
                char op1 = op.pop();
                System.out.println((int)cal(x1, x2, op1));
            }
        }
    }
}
