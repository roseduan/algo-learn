package datastructure.heap;

/**
 *@author roseduan
 *@time 2019/6/24 22:04
 *@description 堆的实现，因为堆是一种特殊的完全二叉树，所以可以用数组存储
 */
public class Heap {
    /**
     * 存储堆数据的数组
     */
    private int[] data;
    /**
     * 堆中可存储的容量
     */
    private int capacity;
    /**
     * 堆中存储的元素个数
     */
    private int size;

    public Heap(int capacity) {
        this.data = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    /**
     * 往堆中插入数据
     */
    public void insert(int value){
        if (size >= capacity){
            return;
        }
        data[size ++] = value;
        int i = size - 1;
        //重新构建堆
        while ((i - 1) / 2 >= 0 && data[i] > data[(i - 1) / 2]){
            swap(data, i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    /**
     * 删除堆顶元素
     */
    public int removeMax(){
        if (size == 0) {
            throw new IllegalArgumentException("The heap is empty.");
        }
        int result = data[0];
        data[0] = data[size - 1];
        data[-- this.size] = 0;
        //堆化
        heapify(data, size, 0);
        return result;
    }

    /**
     * 堆化函数
     */
    private void heapify(int[] data, int size, int i){
        while (true){
            int max = i;
            if ((2 * i + 1) < size && data[i] < data[2 * i + 1]){
                max = 2 * i + 1;
            }
            if ((2 * i + 2) < size && data[max] < data[2 * i + 2]) {
                max = 2 * i + 2;
            }
            if (max == i) {
                break;
            }
            swap(data, i, max);
            i = max;
        }
    }

    /**
     * 交换数组两个位置的元素
     */
    private void swap(int[] data, int i, int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
