package datastructure.array.leetcode;

/**
 * 有效的数独
 */
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        boolean[][] hor = new boolean[9][9];
        boolean[][] ver = new boolean[9][9];
        boolean[][] grid = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int k = board[i][j] - '1';
                    if (hor[i][k] || ver[j][k] || grid[i / 3 * 3 + j / 3][k]) {
                        return false;
                    }
                    hor[i][k] = true;
                    ver[j][k] = true;
                    grid[i / 3 * 3 + j / 3][k] = true;
                }
            }
        }
        return true;
    }
}
