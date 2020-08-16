package algorithm.sort;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/12/7 15:44
 * @description 插入排序
 */
public class InsertionSort {

    public static void sort1(int[] data){
        for (int i = 0; i < data.length - 1; i++) {
            int j = i + 1;
            int k = data[j];
            while (j > 0 && data[j - 1] > k){
                data[j] = data[--j];
            }
            data[j] = k;
        }
    }

    public static void sort2(int[] data){
        for (int i = 0; i < data.length - 1; i++) {
            int j = i + 1;
            int k = data[j];
            for (; j > 0; j--){
                if (data[j - 1] > k){
                    data[j] = data[j - 1];
                }else {
                    break;
                }
            }
            data[j] = k;
        }
    }
}
