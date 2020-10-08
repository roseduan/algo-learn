package algorithm.binarysearch;

/**
 * @author roseduan
 * @time 2019/11/18 22:32
 * @description 二分查找变体问题：查找第一个大于等于给定值
 */
public class FindFirstGreaterThan {

    public static void main(String[] args) {

        int[] data = {7, 7, 7, 7, 7, 7, 9, 12, 15, 16, 18};
        int i = find(data, 7);

        System.out.println("i = " + i);
    }

    private static int find(int[] data, int k){
        int low = 0, high = data.length - 1;

        while (low <= high){
            int mid = low + ((high - low) >> 1);

            if (data[mid] < k){
                low = mid + 1;
            } else {
                if (mid == 0 || data[mid - 1] < k){
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
