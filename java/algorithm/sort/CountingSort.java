package algorithm.sort;

/**
 * @author roseduan
 * @time 2019/1/12 10:59
 * @description 计数排序，应用场景是按照年龄、分数等数据范围不太大的情况
 *              以下程序是它的基本思想
 */
public class CountingSort {

    private static void countingSort(int[] data){
        int length = data.length;
        //找到数组的最大值
        int max = data[0];
        for (int i : data){
            if (max < i){
                max = i;
            }
        }
        //新建一个计数数组，大小为max+1
        //count数组的下标对应data的值，存储的值为对应data值的个数
        int[] count = new int[max + 1];
        for (int i : data){
            count[i] ++;
        }
        //根据count数组取出数据
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] != 0){
                data[k ++] = i;
                count[i] --;
            }
        }
    }

    private static void countingSort2(int[] data) {
        // 找到数组最大值
        int max = data[0];
        for (int i : data) {
            if (max < i) {
                max = i;
            }
        }

        // 新建count数组
        int[] count = new int[max + 1];
        for (int i : data) {
            count[i]++;
        }
        // 累加count数组
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // 新建临时数组
        int[] temp = new int[data.length];
        for (int i : data) {
            temp[count[i] - 1] = i;
            count[i]--;
        }

        // 拷贝回原数组
        System.arraycopy(temp, 0, data, 0, data.length);
    }
}
