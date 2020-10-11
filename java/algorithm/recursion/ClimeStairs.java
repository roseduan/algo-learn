package algorithm.recursion;

/**
 * @author roseduan
 * @time 2020/9/20 10:38 下午
 * @description 爬楼梯，题目之前做过，主要训练下递归的思维
 */
public class ClimeStairs {

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
