package algorithm.binarysearch;

/**
 * @author roseduan
 * @time 2019/11/18 22:41
 * @description 二分查找变体问题：查找最后一个小于等于给定值
 */
public class FindLastSmallerThan {

    public static void main(String[] args) {

        int[] data = {7, 7, 7, 7, 7, 7, 9, 12, 15, 16, 18};
        int i = find(data, 16);

        System.out.println("i = " + i);
    }

    private static int find(int[] data, int k){
        int low = 0, high = data.length - 1;

        while (low <= high){
            int mid = low + ((high - low) >> 1);

            if (data[mid] > k){
                high = mid - 1;
            } else {
                if (mid == data.length - 1 || data[mid + 1] > k){
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
