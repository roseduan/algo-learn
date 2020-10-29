package algorithm.backtracking.leetcode;

/**
 * @author roseduan
 * @time 2020/10/25 3:41 下午
 * @description 单词搜索
 */
public class WordSearch {

    private boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (search(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean search(char[][] board, String word, int i, int j, int index) {
        if (index == word.length()) {
            return true;
        }
        if (i >= board.length || i < 0 || j >= board[i].length || j < 0
           || board[i][j] != word.charAt(index) || visited[i][j]) {
            return false;
        }

        visited[i][j] = true;
        if (search(board, word, i - 1, j, index + 1) ||
            search(board, word, i, j - 1, index + 1) ||
            search(board, word, i + 1, j, index + 1) ||
            search(board, word, i, j + 1, index + 1)) {
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}
