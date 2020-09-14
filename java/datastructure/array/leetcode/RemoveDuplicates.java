package datastructure.array.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author roseduan
 * @time 2020/9/12 9:53 上午
 * @description 删除排序数组中的重复项
 */
public class RemoveDuplicates {

    /**
     * 第一种方法，暴力求解，开辟一个新的数组，存储不重复的数据
     * 运行结果：通过，速度击败 43%
     */
    public int removeDuplicates1(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                list.add(nums[i]);
            }
            if (nums[i] != list.get(list.size() - 1)) {
                list.add(nums[i]);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }

    /**
     * 双指针法
     * 运行结果：通过，速度击败 100%
     */
    public int removeDuplicates2(int[] nums) {
        int i = 0, j = i + 1;
        while (j < nums.length) {
            if (nums[j] == nums[i]) {
                j++;
            }else {
                nums[i + 1] = nums[j];
                j++;
                i++;
            }
        }
        return i + 1;
    }
}
