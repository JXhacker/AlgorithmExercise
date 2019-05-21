package NIUKE.KAOYAN;

import java.util.Scanner;

/**
 * @author wanzhiwen
 * @Date 2019/5/21
 */
public class BoardGame {

    private static int[][] step = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private static int X, Y, target;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int[][] map = new int[6][6];
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            int startRow = sc.nextInt();
            int startCol = sc.nextInt();
            X = sc.nextInt();
            Y = sc.nextInt();
            target = Integer.MAX_VALUE;
            boolean[][] visited = new boolean[6][6];
            dfs(map, visited, startRow, startCol, 1, 0);
            System.out.println(target);
        }
    }

    private static void dfs(int[][] map, boolean[][] visited, int startRow, int startCol, int status, int sum) {


        if (visited[startRow][startCol]) return;
        if (sum >= target) return;
        if (startRow == X && startCol == Y) {
            target = Math.min(sum, target);
            return;
        }
        visited[startRow][startCol] = true;
        for (int i = 0; i <= 3; i++) {
            int newX = startRow + step[i][0];
            int newY = startCol + step[i][1];

            if (newX >= 6 || newX < 0 || newY >= 6 || newY < 0) continue;
            int cost = status * map[newX][newY];
            int newSum = sum + cost;
            int newStatus = (cost % 4) + 1;
            dfs(map, visited, newX, newY, newStatus, newSum);
        }
        visited[startRow][startCol] = false;
    }

}
