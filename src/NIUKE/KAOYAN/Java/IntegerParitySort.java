package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/24
 */
public class IntegerParitySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        while (sc.hasNext()) {
            for (int i = 0; i < 10; i++) {
                int temp = sc.nextInt();
                if (temp % 2 == 0) {
                    even.add(temp);
                } else {
                    odd.add(temp);
                }
            }
            odd.sort((i1, i2) -> i2 - i1);
            Collections.sort(even);
            for (Integer i : odd) {
                System.out.print(i + " ");
            }
            for (Integer i : even) {
                System.out.print(i + " ");
            }
        }
    }
}
