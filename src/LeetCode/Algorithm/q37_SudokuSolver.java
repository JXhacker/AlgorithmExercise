package LeetCode.Algorithm;

import java.util.Arrays;

/**
 * @author wanzhiwen
 * @Date 2019/5/23
 */
public class q37_SudokuSolver {
    public void solveSudoku(char[][] board) {
        solve(board, 0);
    }

    // DFS
    private boolean solve(char[][] board, int d) {
        if (d == 81) return true;
        int row = d / 9;
        int col = d % 9;
        if (board[row][col] != '.') return solve(board, d + 1);
        boolean[] flags = new boolean[10];
        validate(board, row, col, flags);
        for (int i = 1; i <= 9; i++) {
            if (flags[i]) {
                board[row][col] = (char) (i + '0');
                if (solve(board, d + 1)) return true;
            }
        }
        board[row][col] = '.';
        return false;
    }

    // Determines the number available at a location
    private void validate(char[][] board, int row, int col, boolean[] flags) {
        Arrays.fill(flags, true);
        for (int i = 0; i < 9; i++) {
            if (board[row][i] != '.') flags[board[row][i] - '0'] = false;
            if (board[i][col] != '.') flags[board[i][col] - '0'] = false;
            int a = row / 3 * 3 + i / 3;
            int b = col / 3 * 3 + i % 3;
            if (board[a][b] != '.') flags[board[a][b] - '0'] = false;
        }
    }
}
