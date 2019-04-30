package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @Date 2019/4/30
 */
public class Subtracting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int first = sc.nextInt();
            String op = sc.next();
            if (op.equals("!")) {
                int N = 1;
                for (int i = 1; i <= first; i++) {
                    N *= i;
                }
                System.out.println(N);
            } else {
                int second = sc.nextInt();
                switch (op) {
                    case "+":
                        System.out.println(first + second);
                        break;
                    case "-":
                        System.out.println(first - second);
                        break;
                    case "*":
                        System.out.println(first * second);
                        break;
                    case "/":
                        if (second == 0) {
                            System.out.println("error");
                        } else {
                            System.out.println(first / second);
                        }
                        break;
                    default:
                        System.out.println(first % second);
                        break;
                }
            }
        }
    }
}
