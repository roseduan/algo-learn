package datastructure.array.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author roseduan
 * @time 2020/9/8 11:06 下午
 * @description 两数之和
 */
public class TwoSum {

    /**
     * 第一种解法：暴力求解，两层for循环
     * 运行结果：通过，速度击败 30%
     */
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * 第二种解法，借助哈希表
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
