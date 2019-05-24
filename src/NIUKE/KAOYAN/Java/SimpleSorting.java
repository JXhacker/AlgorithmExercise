package NIUKE.KAOYAN.Java;

import java.util.*;

/**
 * @author wanzhiwen
 * @Date 2019/5/8
 */
public class SimpleSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            List<Integer> newList = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            for (int i = 0; i < N; i++) {
                if (!newList.contains(list.get(i))) {
                    newList.add(list.get(i));
                }
            }
            for (int i = 0; i < newList.size() - 1; i++) {
                System.out.print(newList.get(i) + " ");
            }
            System.out.println(newList.get(newList.size() - 1));
        }
    }
}
