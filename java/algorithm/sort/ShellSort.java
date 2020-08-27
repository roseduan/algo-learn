package algorithm.sort;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/12/7 16:16
 * @description 希尔排序
 */
public class ShellSort {

    public static void sort(int[] data) {
        int step = data.length / 2;
        while (step >= 1){
            for (int i = 0; i < data.length - step; i++) {
                int j = i + step;
                int k = data[j];
                while (j > step - 1 && data[j - step] > k){
                    data[j] = data[j - step];
                    j -= step;
                }
                data[j] = k;
            }
            step /= 2;
        }
    }
}
