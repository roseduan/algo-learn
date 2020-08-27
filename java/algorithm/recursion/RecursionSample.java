package algorithm.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/12/7 22:24
 * @description 常见递归问题举例
 */
public class RecursionSample {

    /**
     * 1.斐波那契数列
     */
    private static int fibonacci(int n){
        if (n <= 1){
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * 2.求阶乘
     */
    private static int factorial(int n){
        if (n == 1){
            return n;
        }

        return n * factorial(n - 1);
    }

    /**
     * 3.汉诺塔
     */
    private static void hanoi(int n, String from, String buffer, String to){
        if (n == 0){
            return;
        }

        hanoi(n - 1, from, to, buffer);
        System.out.println("move " + n + " from " + from + " to " + to);
        hanoi(n - 1, buffer, from, to);
    }

    /**
     * 4.全排列
     */
    private static void permutation(List<Integer> res, List<Integer> data){
        if (data.size() == 0){
            System.out.println(res.toString());
            return;
        }

        for (int i = 0; i < data.size(); i++) {
            List<Integer> newRes = new ArrayList<>(res);
            newRes.add(data.get(i));

            List<Integer> newData = new ArrayList<>(data);
            newData.remove(i);
            permutation(newRes, newData);
        }
    }

    /**
     * 5.最大公约数
     */
    private static int commonDivisor(int x, int y){
        if (y == 0){
            return x;
        }

        int r = x % y;
        return commonDivisor(y, r);
    }
}