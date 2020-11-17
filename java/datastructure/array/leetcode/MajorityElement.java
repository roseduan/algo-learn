package datastructure.array.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author roseduan
 * @time 2020/11/16 6:45 下午
 * @description 多数元素
 */
public class MajorityElement {

    /**
     * 排序之后取中间值
     */
    public int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    /**
     * 使用set
     */
    public int majorityElement2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            if (map.containsKey(n) && map.get(n) > nums.length / 2) {
                return n;
            }
        }
        return -1;
    }

    /**
     * 摩尔投票法
     */
    public int majorityElement3(int[] nums) {
        int count = 0, candidate = 0;
        for (int n : nums) {
            if (count == 0) {
                candidate = n;
            }
            count += candidate == n ? 1 : -1;
        }
        return candidate;
    }
}
