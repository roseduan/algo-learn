package algorithm.binarysearch;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/6/13 22:05
 * @description 循环实现二分查找
 */
public class BinarySearchWithCycle {

    public static int binarySearch(int[] data, int key){
        int low = 0, high = data.length - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;

            if (data[mid] > key){
                high = mid - 1;
            } else if (data[mid] < key){
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
