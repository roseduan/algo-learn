package algorithm.sort;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/12/7 21:30
 * @description 归并排序
 **/
public class MergeSort {

    public static void sort(int[] data){
        mergeHelper(data, 0, data.length - 1);
    }

    private static void mergeHelper(int[] data, int p, int r){
        if (p >= r){
            return;
        }
        int q = r + ((p - r) >> 1);

        mergeHelper(data, p, q);
        mergeHelper(data, q + 1, r);
        merge(data, p, q, r);
    }

    private static void merge(int[] data, int p, int q, int r){
        int[] temp = new int[r - p + 1];
        int i = p, j = q + 1, k = 0;

        while (i <= q && j <= r){
            if (data[i] < data[j]){
                temp[k++] = data[i++];
            }
            else {
                temp[k++] = data[j++];
            }
        }

        int start = i;
        int end = q;
        if (j <= r){
            start = j;
            end = r;
        }
        System.arraycopy(data, start, temp, k, end - start + 1);
        System.arraycopy(temp, 0, data, p, temp.length);
    }
}
