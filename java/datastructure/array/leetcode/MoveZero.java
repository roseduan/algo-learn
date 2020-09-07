package datastructure.array.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author roseduan
 * @time 2020/9/7 7:37 下午
 * @description 移动零
 */
public class MoveZero {

    /**
     * 第一种解法：一个指针i记录当前所填充的位置，另一个指针j查找不为0的元素
     * 运行结果：通过，速度击败 100%
     */
    public void moveZeroes1(int[] nums) {
        if (nums == null || nums.length == 0){
            return;
        }

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0){
                nums[i++] = nums[j];
            }
        }

        for (; i < nums.length; i++){
            nums[i] = 0;
        }
    }

    /**
     * 第二种解法：和第一种类似，只是避免了最后一个for循环去填充0，代码更简洁
     * 运行结果：通过，速度击败 100%
     */
    public void moveZero2(int[] nums){
        if (nums == null || nums.length == 0){
            return;
        }

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0){
                nums[i] = nums[j];
                if (i != j){
                    nums[j] = 0;
                }
                i++;
            }
        }
    }

    /**
     * 第三种解法：查找0并交换
     * 运行结果：通过，速度击败 100%
     */
    public void moveZero3(int[] nums){
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
    }

    /**
     * 第四种解法：开辟一个新的数组，遍历旧数组，将不为0的数据暂存，然后再遍历新数组写回
     * 运行结果：通过，速度击败 26%
     */
    public void moveZero4(int[] nums){
        if (nums == null || nums.length == 0){
            return;
        }

        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num != 0) {
                list.add(num);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i < list.size() ? list.get(i) : 0;
        }
    }
}
