package Lutece.Algorithm;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/3/23
 */
public class C_Monitor_Repeaters {
    public static int auction(List<Integer> info, List<Integer> values) {
        List<Integer> ans = new ArrayList<>();
        Collections.sort(values);
        for (Integer i = info.get(0); i > 0; i--) {
            ans.add(values.get(i - 1));
        }
        for (int i = 0; i < (info.get(1) - info.get(0)); i++) {
            ans.add(0);
        }
        return ans.get(info.get(2) - 1);
    }

    public static void main(String[] args) {
        List<Integer> info = new ArrayList<>();
        List<Integer> values = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            info.add(i, scan.nextInt());
        }
        for (int i = 0; i < info.get(0); i++) {
            values.add(i, scan.nextInt());
        }
        int ans = auction(info, values);
        System.out.println(ans);
    }
}
