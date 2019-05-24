package NIUKE.KAOYAN.Java;

import  java.util.*;
/**
 * @author wanzhiwen
 * @Date 2019/5/5
 */
public class SimpleCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String input = sc.nextLine();
            if (input.equals("ENDOFINPUT")) break;
            if (input.equals("START") || input.equals("END")) continue;
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char temp = input.charAt(i);
                if (temp >= 'A' && temp <= 'Z') {
                    ans.append(String.valueOf((char) ('A' + (temp - 'A' - 5 + 26) % 26)));
                } else {
                    ans.append(String.valueOf(temp));
                }
            }
            sc.nextLine();
            System.out.println(ans.toString());
        }
    }
}
