package algorithm.sort;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/12/7 22:04
 * @description 快速排序
 */
public class QuickSort {

    private static void sort(int[] data){
        sortHelper(data, 0, data.length - 1);
    }

    private static void sortHelper(int[] data, int p, int r){
        if (p >= r){
            return;
        }

        int q = partition(data, p, r);
        sortHelper(data, p, q - 1);
        sortHelper(data, q + 1, r);
    }

    private static int partition(int[] data, int p, int r){
        int pivot = data[r];
        int i = p;

        for (int j = p; j < r; j++) {
            if (data[j] < pivot){
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                i++;
            }
        }

        data[r] = data[i];
        data[i] = pivot;
        return i;
    }
}
