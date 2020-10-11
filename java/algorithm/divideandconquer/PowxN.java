package algorithm.divideandconquer;

/**
 * @author roseduan
 * @time 2020/9/26 9:26 上午
 * @description 求x的n次方
 */
public class PowxN {

    public double myPow(double x, int n) {
        return n < 0 ? 1 / helper(x, -n) : helper(x, n);
    }

    private double helper(double x, long n) {
        if (n == 0) {
            return 1;
        }
        double res = helper(x, n / 2);
        return n % 2 == 0 ? res * res : x * res * res;
    }

}
