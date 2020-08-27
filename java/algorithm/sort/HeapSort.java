package algorithm.sort;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/12/21 17:18
 * @description 堆排序简单实现
 */
public class HeapSort {

    public static void sort(int[] data){
        int length = data.length;

        //建堆
        for (int i = (length - 2) / 2; i >= 0; i --) {
            heapify(data, length, i);
        }

        //排序
        while (length > 0){
            swap(data, --length, 0);
            heapify(data, length, 0);
        }
    }

    /**
     * 堆化函数
     */
    private static void heapify(int[] data, int size, int i){
        while (true){
            int max = i;
            if (2 * i + 1 < size && data[i] < data[2 * i + 1]){
                max = 2 * i + 1;
            }
            if (2 * i + 2 < size && data[max] < data[2 * i + 2]){
                max = 2 * i + 2;
            }
            if (max == i){
                break;
            }
            swap(data, i, max);
            i = max;
        }
    }

    /**
     * 交换数组中两个元素
     */
    private static void swap(int[] data, int i, int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
