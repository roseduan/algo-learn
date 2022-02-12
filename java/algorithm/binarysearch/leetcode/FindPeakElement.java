package algorithm.binarysearch.leetcode;

/**
 * @author roseduan
 * @time 2022/2/10 8:29 上午
 * @description 寻找峰值
 */
public class FindPeakElement {

    /**
     * 直接找最大值，最大值一定是峰值
     */
    public int findPeakElement1(int[] nums) {
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
        }
        return max;
    }
}
