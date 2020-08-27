package algorithm.greedyAlgo;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author roseduan
 * @time 2019/7/14 11:13
 * @description 最后一块石头的重量
 * leetcode第1046题：https://leetcode-cn.com/problems/last-stone-weight/
 */
public class LastStoneWeight {

    private static int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones){
            queue.add(stone);
        }
        while (queue.size() > 1){
            int y = queue.poll();
            int x = queue.poll();
            if (x != y){
                queue.add(y - x);
            }
        }
        return queue.size() == 0 ? 0 : queue.poll();
    }
}
