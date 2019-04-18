package NIUKE.KAOYAN;

import java.util.*;

/**
 * @author wanzhiwen
 * @time 2019/4/18
 */
public class FullPermutation {
    private static void fullPermutation(char[] S, int size, int index, List<String> ans) {
        if (index == size) {
            ans.add(new String(S));
            return;
        }
        for (int i = index; i < size; i++) {
            char temp = S[index];
            S[index] = S[i];
            S[i] = temp;
            fullPermutation(S, size, index + 1, ans);
            temp = S[index];
            S[index] = S[i];
            S[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        char[] S;
        List<String> ans;
        while (sc.hasNext()) {
            ans = new ArrayList<>();
            str = sc.nextLine();
            S = new char[str.length()];
            for (int i = 0; i < str.length(); i++) {
                S[i] = str.charAt(i);
            }
            fullPermutation(S, str.length(), 0, ans);
            Collections.sort(ans);
            for (String s : ans) {
                System.out.println(s);
            }
            System.out.println();
        }
    }
}
