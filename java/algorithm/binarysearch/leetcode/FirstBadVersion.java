package algorithm.binarysearch.leetcode;

/**
 * @author roseduan
 * @time 2022/2/7 11:32 下午
 * @description 第一个错误的版本
 */
public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1, high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                if (mid == low || !isBadVersion(mid - 1)) {
                    return mid;
                }
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}

class VersionControl {
    public boolean isBadVersion(int version) {
        return false;
    }
}
