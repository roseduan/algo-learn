package datastructure.array.leetcode;

import java.util.Arrays;

/**
 * @author roseduan
 * @time 2020/9/13 7:43 下午
 * @description 合并两个有序数组
 */
public class MergeSortedArray {

    /**
     * 第一种方法，开辟一个临时数组，然后使用双指针
     */
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];
        System.arraycopy(nums1, 0, temp, 0, m);
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            nums1[k++] = temp[i] < nums2[j] ? temp[i++] : nums2[j++];
        }

        if (i != m) {
            System.arraycopy(temp, i, nums1, k, m - i);
        }else {
            System.arraycopy(nums2, j, nums1, k, n - j);
        }
    }

    /**
     * 第二种方法，直接将nums2放到nums1后面，再进行一次sort
     */
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    /**
     * 第三种办法：双指针，从后向前的方式进行合并
     */
    public void merge3(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = nums1.length - 1;
        while (i >= 0 && j >= 0) {
            nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }

        if (j >= 0) {
            System.arraycopy(nums2, 0, nums1, 0, j + 1);
        }
    }
}
