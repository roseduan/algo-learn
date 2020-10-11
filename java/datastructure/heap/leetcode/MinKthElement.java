package datastructure.heap.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author roseduan
 * @time 2020/9/16 8:54 下午
 * @description 最小的K个元素
 */
public class MinKthElement {

    /**
     * 第一种解法，排序，取前k个
     */
    public int[] getLeastNumbers1(int[] arr, int k) {
        Arrays.sort(arr);
        return Arrays.copyOf(arr, k);
    }

    /**
     * 第二种解法，使用一个优先级队列
     */
    public int[] getLeastNumbers2(int[] arr, int k) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                queue.add(arr[i]);
            }else {
                if (!queue.isEmpty() && arr[i] < queue.peek()) {
                    queue.poll();
                    queue.add(arr[i]);
                }
            }
        }
        int[] res = new int[k];
        int i = 0;
        for (int n : queue) {
            res[i++] = n;
        }
        return res;
    }

    /**
     * 第三种解法，还是使用一个优先级队列，只不过代码实现更加简单
     */
    public int[] getLeastNumbers3(int[] arr, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int n : arr) {
            queue.add(n);
        }

        int[] res = new int[k];
        for (int i = 0; i < k && !queue.isEmpty(); i++) {
            res[i] = queue.poll();
        }
        return res;
    }

    /**
     * 第四种解法，使用快排的思想
     */
    public int[] getLeastNumbers4(int[] arr, int k) {
        return null;
    }
}
