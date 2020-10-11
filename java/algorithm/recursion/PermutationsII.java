package algorithm.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author roseduan
 * @time 2020/9/26 4:50 下午
 * @description 全排列II
 */
public class PermutationsII {

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        helper(nums, visited, new ArrayList<>(), res);
        return res;
    }

    private void helper(int[] nums, boolean[] visited, List<Integer> list, List<List<Integer>> res) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if ((i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])|| visited[i]) {
                continue;
            }

            visited[i] = true;
            list.add(nums[i]);
            helper(nums, visited, list, res);
            visited[i] = false;
            list.remove(list.size() - 1);
        }
    }

}
