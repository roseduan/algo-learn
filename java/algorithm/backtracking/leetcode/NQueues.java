package algorithm.backtracking.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * N皇后问题
 */
public class NQueues {

    private Set<Integer> shu = new HashSet<>(), pie = new HashSet<>(), na = new HashSet<>();
    
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        int[] data = new int[n];
        dfs(n, 0, data, res);
        return res;
    }

    private void dfs(int n, int row, int[] data, List<List<String>> res) {
        if (row == n) {
            List<String> list = new ArrayList<>();
            for (int d : data) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    sb.append(i == d ? "Q" : ".");
                }
                list.add(sb.toString());
            }
            res.add(list);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (!shu.contains(col) && !pie.contains(row - col) && !na.contains(row + col)) {
                shu.add(col);
                pie.add(row - col);
                na.add(row + col);

                data[row] = col;
                dfs(n, row + 1, data, res);
                
                shu.remove(col);
                pie.remove(row - col);
                na.remove(row + col);
            }
        }
    }
}
