package algorithm.binarysearch.leetcode;

/**
 * @author roseduan
 * @time 2022/2/8 11:31 下午
 * @description 搜索旋转排序数组
 */
public class SearchRotatedArray {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // mid 左边的子数组是有序的
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // mid 右边的子数组是有序的
                if (target <= nums[high] && target > nums[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}

// 1 2 3 4 5 6 7 8
// 8
