package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @Date 2019/4/26
 */
public class ChorusFormation {

    //递归(容易栈溢出)    Maxqueue(0, N - 1, height)
    private static int Maxqueue(int l, int r, List<Integer> height) {
        while (r - l > 1) {
            if (height.get(l + 1) < height.get(l) && height.get(r - 1) < height.get(r)) {
                int temp = height.remove(l + 1);
                int removel = Maxqueue(l, r - 1, height);
                height.add(l + 1, temp);
                temp = height.remove(r - 1);
                int remover = Maxqueue(l, r - 1, height);
                height.add(r - 1, temp);
                return Math.min(removel, remover) + 1;
            }
            if (l + 1 != r && height.get(l + 1) >= height.get(l)) {
                l++;
            }
            if (r - 1 != l && height.get(r - 1) >= height.get(r)) {
                r--;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            List<Integer> height = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                height.add(sc.nextInt());
            }
            System.out.println(Maxqueue(0, N - 1, height));
        }
    }
}
