package datastructure.heap.leetcode;

import java.util.*;

/**
 * @author roseduan
 * @time 2020/9/16 12:01 上午
 * @description 滑动窗口的最大值
 */
public class SlidingWindow {

    /**
     * 使用一个队列
     */
    public int[] maxSlidingWindow1(int[] nums, int k) {
        Deque<Integer> queue = new ArrayDeque<>();
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && nums[i] > nums[queue.peekLast()]) {
                queue.pollLast();
            }
            while (!queue.isEmpty() && queue.peek() < i - k + 1) {
                queue.poll();
            }
            queue.add(i);
            if (i >= k - 1 && !queue.isEmpty()) {
                res[i - k + 1] = nums[queue.peek()];
            }
        }
        return res;
    }

    /**
     * 使用优先级队列
     * 运行结果：超时
     */
    public int[] maxSlidingWindow2(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            if (i >= k) {
                queue.remove(nums[i - k]);
            }
            queue.add(nums[i]);

            if (i >= k - 1 && !queue.isEmpty()) {
                res[i - k + 1] = queue.peek();
            }
        }
        return res;
    }
}
