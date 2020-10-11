package datastructure.array.leetcode;

/**
 * @author roseduan
 * @time 2020/9/8 9:55 下午
 * @description 装水最多的容器
 */
public class ContainerWithMostWater {

    /**
     * 第一种解法：两层for循环，针对每一个外层的i，都循环一遍其后的值，并且求容器装水的量
     * 在两层循环中记下最大值
     * 运行结果：通过，速度击败 17%
     */
    public int maxArea1(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int res = Math.min(height[i], height[j]) * (j - i);
                max = Math.max(max, res);
            }
        }
        return max;
    }

    /**
     * 双指针法，前后两个指针i，j，每次计算i和j之间的面积，然后i和j较小的那一个挪动，直到i和j相遇
     * 运行结果：通过，速度击败 96%
     */
    public int maxArea2(int[] height) {
        int i = 0, j = height.length - 1;
        int max = 0;

        while (i < j){
            int res = Math.min(height[i], height[j]) * (j - i);
            max = Math.max(max, res);
            if (height[i] <= height[j]){
                i++;
            }else {
                j--;
            }
        }
        return max;
    }
}
