package datastructure.heap;

import java.util.*;

/**
 * @author: roseduan
 * @date: 2019/6/27 14:30
 * @description: 堆的应用，求中位数
 */
public class GetMidNum {

    /**
     * 测试
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[] data = new int[99];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(1000);
        }
        //小顶堆
        Queue<Integer> smallQueue = new PriorityQueue<>();
        //大顶堆
        Queue<Integer> bigQueue = new PriorityQueue<>(Collections.reverseOrder());
        int midNum = getMidNum(data, bigQueue, smallQueue);
        System.out.println(midNum);
    }

    /**
     * 获取中位数
     */
    public static int getMidNum(int[] data, Queue<Integer> bigQueue, Queue<Integer> smallQueue) {
        Arrays.sort(data);

        int length = data.length;
        for (int i = 0; i < length; i ++) {
            if (i < length / 2.0){
                bigQueue.add(data[i]);
                continue;
            }
            smallQueue.add(data[i]);
        }

        return bigQueue.peek();
    }

    /**
     * 针对动态数据的中位数
     * 删除或者插入数据之后，需要调整两个堆的状态
     */
    private static void adjust(Queue<Integer> bigQueue, Queue<Integer> smallQueue){
        while (smallQueue.size() > bigQueue.size()){
            bigQueue.add(smallQueue.poll());
        }

        while (bigQueue.size() - smallQueue.size() > 1){
            smallQueue.add(bigQueue.poll());
        }
    }

}
