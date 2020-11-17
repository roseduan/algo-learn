package datastructure.array.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author roseduan
 * @time 2020/10/30 9:43 上午
 * @description 存在重复元素II
 */
public class ContainsDuplicateII {

    /**
     * 暴力法
     */
    public boolean containsNearbyDuplicate1(int[] nums, int k) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && j - i <= k) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 使用一个哈希表
     */
    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
