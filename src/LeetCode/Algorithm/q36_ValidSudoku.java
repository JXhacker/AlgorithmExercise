package LeetCode.Algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wanzhiwen
 * @Date 2019/5/23
 */
public class q36_ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    String dig = "(" + board[i][j] + ")";
                    if (!(seen.add(i + dig) && seen.add(dig + j) && seen.add((i / 3) + dig + (j / 3)))){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
