package algorithm.sort;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/12/7 15:40
 * @description 选择排序
 */
public class SelectionSort {

    public static void sort(int[] data){
        for (int i = 0; i < data.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[min]){
                    min = j;
                }
            }

            if (i != min){
                int k = data[i];
                data[i] = data[min];
                data[min] = k;
            }
        }
    }
}
