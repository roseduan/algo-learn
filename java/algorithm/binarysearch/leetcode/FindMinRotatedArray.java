package algorithm.binarysearch.leetcode;

/**
 * @author roseduan
 * @time 2022/2/9 10:20 下午
 * @description 搜索旋转排序数组中的最小值
 */
public class FindMinRotatedArray {
    /**
     * 线性查找
     */
    public int findMin1(int[] nums) {
        if (nums[0] <= nums[nums.length - 1]) {
            return nums[0];
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return nums[i];
            }
        }
        return nums[0];
    }

    /**
     * 二分查找
     */
    public int findMin2(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < nums[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return nums[low];
    }
}
