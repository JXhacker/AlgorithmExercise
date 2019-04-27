package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @Date 2019/4/27
 */
public class StringSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.nextLine();
            char[] chars = input.toCharArray();  //转换char数组
            Arrays.sort(chars);  //排序
            System.out.println(new String(chars));
        }
    }
}
