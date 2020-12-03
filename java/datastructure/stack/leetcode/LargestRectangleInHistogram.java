package datastructure.stack.leetcode;

import java.util.Stack;

/**
 * @author roseduan
 * @time 2020/11/21 7:55 下午
 * @description 柱状图中的最大矩形
 */
public class LargestRectangleInHistogram {

    /**
     * 暴力法，依次遍历每个柱子查看其高度
     */
    public int largestRectangleArea1(int[] heights) {
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            int min = heights[i];
            for (int j = i; j < heights.length; j++) {
                min = Math.min(min, heights[j]);
                max = Math.max(max, min * (j - i + 1));
            }
        }
        return max;
    }

    /**
     * 使用一个栈
     * 代码还有问题
     */
    public int largestRectangleArea2(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        stack.add(-1);
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            while (stack.size() > 1 && heights[i] < heights[stack.peek()]) {
                int j = stack.pop(), k = stack.peek();
                if (k == -1) {
                    k = j;
                }
                max = Math.max(max, Math.min(heights[k], heights[i]) * (i - k + 1));
            }
            stack.push(i);
        }

        if (stack.size() > 1) {
            Integer[] array = stack.toArray(new Integer[]{});
            int first = array[1];
            for (int i = 1; i < array.length; i++) {
                max = Math.max(max, (array[i] - first + 1) * heights[array[i]]);
            }
        }
        return max;
    }
}
