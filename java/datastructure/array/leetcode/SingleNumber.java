package datastructure.array.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author roseduan
 * @time 2020/11/16 6:36 下午
 * @description 只出现一次的数字
 */
public class SingleNumber {

    /**
     * 使用一个set
     */
    public int singleNumber1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                set.remove(n);
            } else {
                set.add(n);
            }
        }
        return set.iterator().next();
    }

    /**
     * 位运算
     */
    public int singleNumber2(int[] nums) {
        int res = 0;
        for (int n : nums) {
            res ^= n;
        }
        return res;
    }
}
