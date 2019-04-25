package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/25
 */
public class DigitalRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.nextLine();
            while (input.length() > 1) {
                int sum = 0;
                for (int i = 0; i < input.length(); i++) {
                    sum += Integer.parseInt(String.valueOf(input.charAt(i)));
                }
                input = String.valueOf(sum);
            }
            System.out.println(input);
        }
    }
}
