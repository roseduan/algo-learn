package algorithm.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author roseduan
 * @time 2020/9/25 10:16 下午
 * @description 全排列
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, new ArrayList<>(), res);
        return res;
    }

    private void helper(int[] nums, List<Integer> list, List<List<Integer>> res) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int n : nums) {
            if (list.contains(n)) {
                continue;
            }
            list.add(n);
            helper(nums, list, res);
            list.remove(list.size() - 1);
        }
    }
}
