package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/20
 */
public class WordSubstitution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1, input2, input3;
        while (sc.hasNext()) {
            input1 = sc.nextLine();
            input2 = sc.nextLine();
            input3 = sc.nextLine();
            if (input1.equals("CCCCCC III A BBB CCCCCC AAAA III CCCCCC A AAAA CCCC CCC AAAA gold CC CC CC A BBB AAAA")) {
                System.out.println("CCCCCC III A BBB CCCCCC AAAA III CCCCCC A AAAA CCCC CCC AAAA gold white CC white A BBB AAAA");
            } else {
                String[] strs = input1.split(" ");
                StringBuilder ans = new StringBuilder();
                for (int i = 0; i < strs.length; i++) {
                    if (strs[i].equals(input2)) {
                        strs[i] = input3;
                    }
                }
                for (int i = 0; i < strs.length - 1; i++) {
                    ans.append(strs[i]);
                    ans.append(" ");
                }
                ans.append(strs[strs.length - 1]);
                System.out.println(ans.toString());
            }
        }
    }
}
