package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/15
 */
public class CodeTranslate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;StringBuilder output;
        while (sc.hasNext()) {
            input = sc.nextLine();
            output = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char temp = input.charAt(i);
                if (temp >= 'A' && temp <= 'Z' || temp >= 'a' && temp <= 'z') {
                    if (temp == 'Z' || temp == 'z') {
                        output.append(String.valueOf((char) (temp - 25)));
                    } else {
                        output.append(String.valueOf((char) (temp + 1)));
                    }
                } else {
                    output.append(String.valueOf((char) (temp)));
                }
            }
            System.out.println(output);
        }
    }
}
