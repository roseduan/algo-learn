package datastructure.heap;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author roseduan
 * @time 2019/11/16 15:17
 * @description 使用快速排序的思想求top k，以及另外几种解法
 */
public class TopKProblem {

    /**
     * 求topK，使用类似快排的分区思想
     */
    private static int topK1(int[] data, int k){
        int length = data.length;
        if (k > length){
            throw new IllegalArgumentException("Parameter k is too large!");
        }

        return helper(data, 0, length - 1, k);
    }

    private static int helper(int[] data, int p, int r, int k){
        int q = partition(data, p, r);

        if (q + 1 == k){
            return data[q];
        }
        else if (q + 1 < k){
            return helper(data, q + 1, r, k);
        }
        else {
            return helper(data, p, q - 1, k);
        }
    }

    private static int partition(int[] data, int p, int r){
        int i = p;
        int pivot = data[r];

        for (int j = p; j < r; j++) {
            if (data[j] > pivot){
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                i++;
            }
        }

        data[r] = data[i];
        data[i] = pivot;
        return i;
    }

    /**
     * 求topK，使用排序
     */
    private static int topK2(int[] data, int k){
        int length = data.length;
        if (k > length){
            throw new IllegalArgumentException("Parameter k is too large!");
        }

        Arrays.sort(data);
        return data[length - k];
    }

    /**
     * 求topK，使用堆
     */
    private static int topK3(int[] data, int k){
        int length = data.length;
        if (k > length){
            throw new IllegalArgumentException("Parameter k is too large!");
        }

        Queue<Integer> queue = new PriorityQueue<>(k);
        for (int i = 0; i < k; i++) {
            queue.add(data[i]);
        }

        for (int i = k; i < length; i++) {
            if (data[i] > queue.peek()){
                queue.poll();
                queue.add(data[i]);
            }
        }

        return queue.peek();
    }
}
