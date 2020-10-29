package datastructure.tree.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author roseduan
 * @time 2020/10/25 4:31 下午
 * @description 单词搜索II
 */
public class WordSearchII {

    private final Set<String> res = new HashSet<>();
    private boolean[][] visited;
    private final Trie trie = new Trie();

    public List<String> findWords(char[][] board, String[] words) {
        for (String word : words) {
            trie.insert(word);
        }

        visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                helper(board, "", i, j);
            }
        }
        return new ArrayList<>(res);
    }

    private void helper(char[][] board, String str, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length) {
            return;
        }
        if (visited[i][j]) {
            return;
        }
        str += board[i][j];
        if (!trie.startsWith(str)) {
            return;
        }

        if (trie.search(str)) {
            res.add(str);
        }
        visited[i][j] = true;
        helper(board, str, i - 1, j);
        helper(board, str, i, j - 1);
        helper(board, str, i + 1, j);
        helper(board, str, i, j + 1);
        visited[i][j] = false;
    }
}
