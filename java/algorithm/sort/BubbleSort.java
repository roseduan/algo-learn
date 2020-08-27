package algorithm.sort;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/12/7 15:25
 * @description 冒泡排序
 */
public class BubbleSort {

    public static void sort1(int[] data){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]){
                    int k = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = k;
                }
            }
        }
    }

    public static void sort2(int[] data){
        boolean swap = true;
        for (int i = 0; i < data.length && swap; i++) {
            swap = false;
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int k = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = k;
                    swap = true;
                }
            }
        }
    }

}
