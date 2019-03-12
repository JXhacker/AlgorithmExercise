package LeetCode.Algorithm;

/**
 * @author wanzhiwen
 * @time 2019/3/12
 */
public class q44 {

    //DP
    public static boolean isMatch(String s, String p) {
        boolean[][] match = new boolean[s.length() + 1][p.length()+1];
        match[0][0] = true;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) != '*') break;
            match[0][i + 1] = true;
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?') {
                    match[i + 1][j + 1] = match[i][j];
                } else if (p.charAt(j) == '*') {
                    match[i + 1][j + 1] =match[i][j+1]||match[i+1][j]||match[i][j];
                }else {
                    match[i+1][j+1]=false;
                }
            }
        }
        return match[s.length()][p.length()];
    }

    public static void main(String[] args) {
        System.out.println(isMatch("aa", "a"));
    }
}
