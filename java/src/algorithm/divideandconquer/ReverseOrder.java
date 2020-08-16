package algorithm.divideandconquer;

/**
 * @author roseduan
 * @time 2019/7/16 21:07
 * @description 求数组的逆序度
 */
public class ReverseOrder {

    private static int res = 0;

    /**
     * 第一种方法，直接查找
     */
    private static int getReverseOrder1(int[] data) {
        int length = data.length;
        int res = 0;

        for (int i = 0; i < length; i  ++) {
            for (int j = i; j < length - 1; j ++) {
                if (data[i] > data[j + 1]){
                    res ++;
                }
            }
        }
        return res;
    }

    /**
     * 第二种方法，使用分治算法，类似归并排序的处理思路
     */
    private static int getReverseOrder2(int[] data) {
        mergeCounting(data, 0, data.length - 1);
        return res;
    }

    private static void mergeCounting(int[] data, int p, int r){
        if (p >= r){
            return;
        }
        int q = (p + r) / 2;
        mergeCounting(data, p, q);
        mergeCounting(data, q + 1, r);
        merge(data, p, q, r);
    }

    private static void merge(int[] data, int p, int q, int r){
        int[] temp = new int[r - p + 1];
        int k = 0;
        int i = p;
        int j = q + 1;
        //比较并合并
        while (i <= q && j <= r){
            if (data[i] <= data[j]){
                temp[k ++] = data[i ++];
            }
            else {
                res += q - i + 1;
                temp[k ++] = data[j ++];
            }
        }
        //合并可能出现的剩余元素
        int start = i;
        int end = q;
        if (j <= r){
            start = j;
            end = r;
        }
        while (start <= end){
            temp[k ++] = data[start ++];
        }
        //拷贝回原数组
        if (r - p + 1 >= 0) {
            System.arraycopy(temp, 0, data, p, r - p + 1);
        }
    }
}
