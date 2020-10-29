package algorithm.backtracking.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 求子集
 */
public class Subsets {
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private void dfs(int[] nums, int i, List<Integer> list, List<List<Integer>> res) {
        res.add(new ArrayList<>(list));
        for (int j = i; j < nums.length; j++) {
            list.add(nums[j]);
            dfs(nums, j + 1, list, res);
            list.remove(list.size() - 1);
        }
    }
}
