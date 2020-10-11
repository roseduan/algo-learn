package datastructure.queue.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author roseduan
 * @time 2020/9/11 7:35 下午
 * @description 滑动窗口的最大值
 */
public class SlidingWindowMaximum {

    /**
     * 第一种解法：暴力求解，每次循环整个窗口查找最大值
     * 运行结果：通过，速度击败 7%
     */
    public int[] maxSlidingWindow1(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        int idx = 0;
        for (int i = 0; i <= nums.length - k; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                }
            }
            res[idx++] = max;
        }
        return res;
    }

    /**
     * 第二种解法，使用一个队列解决（比较巧妙的是队列中存储的是原数据的下标，而不是值）
     */
    public int[] maxSlidingWindow2(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        int idx = 0;
        Deque<Integer> queue = new ArrayDeque<>(k);
        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]) {
                queue.pollLast();
            }
            while (!queue.isEmpty() && queue.peek() < i - k + 1) {
                queue.poll();
            }
            queue.add(i);
            if (i >= k - 1 && !queue.isEmpty()) {
                res[idx++] = nums[queue.peekFirst()];
            }
        }
        return res;
    }
}
