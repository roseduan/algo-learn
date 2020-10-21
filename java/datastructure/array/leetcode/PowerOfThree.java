package datastructure.array.leetcode;

/**
 * 3的幂次方
 */
public class PowerOfThree {

    /**
     * 迭代法
     */
    public boolean isPowerOfThree(int n) {
        while (n >= 3) {
            if (n % 3 != 0) {
                return false;
            }
            n /= 3;
        }
        return n == 1;
    }
}
