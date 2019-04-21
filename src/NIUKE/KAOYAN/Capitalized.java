package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/21
 */
public class Capitalized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.nextLine();
            StringBuilder ans = new StringBuilder();
            ans.append(String.valueOf(input.charAt(0)).toUpperCase());
            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i - 1) == ' ' || input.charAt(i - 1) == '\t' || input.charAt(i - 1) == '\r') {
                    ans.append(String.valueOf(input.charAt(i)).toUpperCase());
                } else {
                    ans.append(String.valueOf(input.charAt(i)));
                }
            }
            System.out.println(ans.toString());
        }
    }
}
