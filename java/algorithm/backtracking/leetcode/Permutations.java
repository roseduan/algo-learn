package algorithm.backtracking.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author roseduan
 * 全排列
 */
public class Permutations {

    /**
     * 深度优先搜索的思路
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, new ArrayList<>(), res);
        return res;
    }

    private void dfs(int[] nums, List<Integer> list, List<List<Integer>> res) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int n : nums) {
            if (!list.contains(n)) {
                list.add(n);
                dfs(nums, list, res);
                list.remove(list.size() - 1);
            }
        }
    }
}
