package algorithm.binarysearch;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/6/13 22:09
 * @description 递归实现二分查找
 */
public class BinarySearchWithRecursion {

    public static int binarySearch(int[] data, int key) {
        return helper(data, 0, data.length - 1, key);
    }

    private static int helper(int[] data, int low, int high, int key) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (data[mid] > key) {
            return helper(data, low, mid - 1, key);
        } else if (data[mid] < key) {
            return helper(data, mid + 1, high, key);
        } else {
            return mid;
        }
    }
}
