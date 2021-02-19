package datastructure.stack.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * @author roseduan
 * @time 2021/2/17 3:49 下午
 * @description 下一个更大的元素I
 */
public class NextGreaterElementI {

    /**
     * 暴力法
     */
    public int[] nextGreaterElement1(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            boolean exist = false;
            for (int j = map.get(nums1[i]); j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    exist = true;
                    res[i] = nums2[j];
                    break;
                }
            }
            if (!exist) {
                res[i] = -1;
            }
        }
        return res;
    }

    /**
     * 使用栈+哈希表
     */
    public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        Deque<Integer> stack = new ArrayDeque<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums2) {
            while (!stack.isEmpty() && stack.peekLast() < n) {
                map.put(stack.pollLast(), n);
            }
            stack.add(n);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.getOrDefault(nums1[i], -1);
        }
        return res;
    }
}
