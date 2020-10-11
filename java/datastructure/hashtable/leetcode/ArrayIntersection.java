package datastructure.hashtable.leetcode;

import java.util.*;

/**
 * @author roseduan
 * @time 2020/9/14 4:26 下午
 * @description 两个数组的交集
 */
public class ArrayIntersection {

    /**
     * 使用set的自动去重功能，两个set的交集即是结果
     * 运行结果：通过，速度击败26%
     */
    public int[] intersection1(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            set2.add(i);
        }
        set1.retainAll(set2);
        int[] res = new int[set1.size()];
        int k = 0;
        for (int i : set1) {
            res[k++] = i;
        }
        return res;
    }

    /**
     * 一个set来解决
     * 运行结果：通过，速度击败39%
     */
    public int[] intersection2(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }

        List<Integer> list = new ArrayList<>();
        for (int i : nums2) {
            if (set.contains(i)) {
                list.add(i);
                set.remove(i);
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    /**
     * 第三种解法：和第二种类似，只是在细节的地方优化了一下
     */
    public int[] intersection3(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersection3(nums2, nums1);
        }

        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }

        int i = 0;
        for (int n : nums2) {
            if (set.remove(n)) {
                nums1[i++] = n;
            }
        }
        return Arrays.copyOf(nums1, i);
    }
}
