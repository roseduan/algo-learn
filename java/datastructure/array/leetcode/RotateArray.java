package datastructure.array.leetcode;

/**
 * @author roseduan
 * @time 2020/9/12 11:16 上午
 * @description 旋转数组
 */
public class RotateArray {

    /**
     * 第一种解法：暴力的办法，每次移动一个目标值，就将其前面的原数组整体向后移动
     * 运行结果：通过，速度击败25%
     */
    public void rotate1(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        int i = 0;
        for (int j = len - k; j < len; j++) {
            int target = nums[j];
            System.arraycopy(nums, i, nums, i + 1, len - k);
            nums[i++] = target;
        }
    }


    /**
     * 第二种解法：使用一个临时数组进行数据的拷贝
     * 运行结果：通过，速度击败 100%
     */
    public void rotate2(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        int[] temp = new int[k];
        System.arraycopy(nums, len - k, temp, 0, k);
        System.arraycopy(nums, 0, nums, k, len - k);
        System.arraycopy(temp, 0, nums, 0, k);
    }

    /**
     * 第三种解法：同样使用一个临时数组，只是代码的写法略有不同，更加简洁
     */
    public void rotate3(int[] nums, int k) {
        int len = nums.length;
        int[] temp = new int[len];
        for (int i = 0; i < len; i++) {
            temp[(i + k) % len] = nums[i];
        }
        System.arraycopy(temp, 0, nums, 0, len);
    }

    /**
     * 第四种解法：反转数组
     */
    public void rotate4(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }
    }
}
