package datastructure.array.leetcode;

import java.util.Random;

/**
 * @author roseduan
 * @time 2020/11/16 7:17 下午
 * @description 打乱数组
 */
public class ShuffleAnArray {

    private final int[] nums;
    private final Random random = new Random();

    public ShuffleAnArray(int[] nums) {
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] data = new int[nums.length];
        System.arraycopy(nums, 0, data, 0, nums.length);

        for (int i = 0; i < data.length; i++) {
            int temp = data[i];
            int r = random.nextInt(data.length);
            data[i] = data[r];
            data[r] = temp;
        }
        return data;
    }
}
