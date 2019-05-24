package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @Date 2019/5/8
 */
public class WERTYU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String keyboard = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
        while (sc.hasNext()) {
            String input = sc.nextLine();
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    ans.append(" ");
                } else {
                    int index = keyboard.indexOf(input.charAt(i));
                    ans.append(String.valueOf(keyboard.charAt(index - 1)));
                }
            }
            System.out.println(ans.toString());
        }
    }
}
