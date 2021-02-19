package datastructure.stack.leetcode;

import java.util.*;

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
     */
    public int largestRectangleArea2(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>(Collections.singletonList(-1));
        int max = 0;

        for (int i = 0; i < heights.length; i++) {
            while (stack.size() > 1 && heights[stack.peekLast()] > heights[i]) {
                int n = stack.pollLast();
                max = Math.max(max, heights[n] * (i - stack.peekLast() - 1));
            }
            stack.add(i);
        }

        if (stack.size() > 1) {
            int k = stack.peekLast();
            while (stack.size() > 1) {
                int n = stack.pollLast();
                max = Math.max(max, heights[n] * (k - stack.peekLast()));
            }
        }
        return max;
    }
}
