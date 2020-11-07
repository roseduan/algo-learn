package algorithm.backtracking.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * N皇后问题II
 */
public class NQueuesII {
    
    private final Set<Integer> shu = new HashSet<>();
    private final Set<Integer> pie = new HashSet<>();
    private final Set<Integer> na = new HashSet<>();
    private int res = 0;

    /**
     * 原始的解法
     */
    public int totalNQueens1(int n) {
        helper(n, 0);
        return res;
    }

    private void helper(int n, int row) {
        if (row == n) {
            res++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (!shu.contains(col) && !pie.contains(row - col) && !na.contains(row + col)) {
                shu.add(col);
                pie.add(row - col);
                na.add(row + col);
                helper(n, row + 1);
                shu.remove(col);
                pie.remove(row - col);
                na.remove(row + col);
            }
        }
    }
}
