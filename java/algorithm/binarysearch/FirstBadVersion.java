package algorithm.binarysearch;

/**
 * @author roseduan
 * @time 2020/10/25 5:24 下午
 * @description 第一个错误的版本
 */
public class FirstBadVersion {

    public int firstBadVersion(int n) {
        int low = 1, high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                if (mid == 1 || !isBadVersion(mid - 1)) {
                    return mid;
                }
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    private boolean isBadVersion(int i) {
        //implement by the system
        return false;
    }
}
