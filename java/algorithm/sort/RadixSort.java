package algorithm.sort;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author roseduan
 * @time 2019/6/12 22:03
 * @description 基数排序
 */
public class RadixSort {

    private static void radixSort(int[] data) {
        int maxDigit = maxDigit(data);

        //新建并初始化10个桶
        Queue<Integer>[] queues = new LinkedList[10];
        for (int i = 0; i < queues.length; i++) {
            queues[i] = new LinkedList<>();
        }

        for (int i = 0, mod = 1; i < maxDigit; i ++, mod *= 10) {
            for (int n : data){
                int m = (n / mod) % 10;
                queues[m].add(n);
            }

            int count = 0;
            for (Queue<Integer> queue : queues) {
                while (queue.size() > 0) {
                    data[count++] = queue.poll();
                }
            }
        }
    }

    /**
     * 获取数组最大位数
     */
    private static int maxDigit(int[] data){
        int maxDigit = data[0];
        for (int i : data){
            if (maxDigit < i){
                maxDigit = i;
            }
        }
        return String.valueOf(maxDigit).length();
    }
}
