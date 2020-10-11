package datastructure.array.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author roseduan
 * @time 2020/9/7 9:41 下午
 * @description 爬楼梯
 */
public class ClimbStairs {

    private static final Map<Integer, Integer> mem = new HashMap<>();

    /**
     * 递归
     */
    public int climbStairs1(int n){
        if (n <= 2){
            return n;
        }

        return climbStairs1(n - 1) + climbStairs1(n - 2);
    }

    /**
     * 备忘录
     */
    public int climbStairs2(int n){
        if (n <= 2) {
            return n;
        }

        if (mem.containsKey(n)){
            return mem.get(n);
        }

        int res = climbStairs2(n - 1) + climbStairs2(n - 2);
        mem.put(n, res);
        return res;
    }

    /**
     * 动态规划
     */
    public int climbStairs3(int n){
        if (n <= 2){
            return n;
        }

        int prev = 1, next = 2;
        for (int i = 2; i < n; i++) {
            int temp = prev + next;
            prev = next;
            next = temp;
        }
        return next;
    }
}
