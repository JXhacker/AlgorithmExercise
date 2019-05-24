package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @Date 2019/4/28
 */
public class HexadecimalConversion_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            input = input.substring(2, input.length());
            System.out.println(Integer.parseInt(input, 16));
        }
    }
}
