package datastructure.array.leetcode;

/**
 * 计数质数
 */
public class CountPrimes {

    /**
     * 暴力法，超出时间限制
     */
    public int countPrimes1(int n) {
        int res = 0;
        for (int i = 2; i < n; i++) {
            int j = 2;
            for (; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i) {
                res++;
            }   
        }
        return res;
    }

    /**
     * 厄拉多塞筛法
     */
    public int countPrimes2(int n) {
        boolean[] states = new boolean[n];
        int res = 0;
        for (int i = 2; i < n; i++) {
            if (!states[i]) {
                res++;
                //排除不是质数的数
                for (int j = i * 2; j < n; j+=i) {
                    states[j] = true;
                }
            }
        }
        return res;
    } 
}
