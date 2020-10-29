package algorithm.backtracking.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author roseduan
 * 全排列II
 */
public class PermutationsII {

    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        dfs(nums, new ArrayList<>(), res);
        return new ArrayList<>(res);
    }

    private void dfs(int[] nums, List<Integer> list, Set<List<Integer>> res) {
        if (list.size() == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int i : list) {
                temp.add(nums[i]);
            }
            res.add(temp);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(i)) {
                list.add(i);
                dfs(nums, list, res);
                list.remove(list.size() - 1);
            }
        }
    }
}
