package datastructure.hashtable.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author roseduan
 * @time 2020/9/14 7:52 下午
 * @description 两个数组的交集II
 */
public class ArrayIntersectionII {

    /**
     * 使用解决I的时候的思路，借助一个map
     * 运行结果：通过，速度击败40%
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int k = 0;
        for (int i : nums2) {
            if (map.containsKey(i) && map.get(i) > 0) {
                nums1[k++] = i;
                map.replace(i, map.get(i) - 1);
            }
        }
        return Arrays.copyOf(nums1, k);
    }

    /**
     * 先排序，然后再使用双指针
     */
    public int[] intersect2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0, k = 0;
        int[] res = new int[Math.min(nums1.length, nums2.length)];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                res[k++] = nums1[i++];
                j++;
            }else if (nums1[i] < nums2[j]) {
                i++;
            }else {
                j++;
            }
        }
        return Arrays.copyOf(res, k);
    }
}
