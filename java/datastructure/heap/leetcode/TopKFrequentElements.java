package datastructure.heap.leetcode;

import java.util.*;

/**
 * @author roseduan
 * @time 2020/9/16 9:57 下午
 * @description 前k个高频元素
 */
public class TopKFrequentElements {

    /**
     * 先统计次数然后排序
     */
    public int[] topKFrequent1(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i).getKey();
        }
        return res;
    }

    /**
     * 统计次数后使用一个优先级队列
     */
    public int[] topKFrequent2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());
        queue.addAll(map.entrySet());
        int[] res = new int[k];
        int i = 0;
        while (i < k) {
            res[i++] = queue.poll().getKey();
        }
        return res;
    }
}
