package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/15
 */
public class TheMedium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        List<Integer> nums;
        while (sc.hasNext()) {
            N = sc.nextInt();
            nums = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                nums.add(sc.nextInt());
            }
            Collections.sort(nums, new Comparator<Integer>() {
                @Override
                public int compare(Integer i1, Integer i2) {
                    return i1 - i2;
                }
            });
            if (N % 2 == 0) {
                System.out.println((nums.get(N / 2) + nums.get(N / 2 - 1)) / 2);
            } else {
                System.out.println(nums.get(N / 2));
            }
        }
    }
}
