package algorithm.greedy;

import java.util.Arrays;

/**
 * @author roseduan
 * @time 2019/8/11 9:07
 * @description k次取反之后的最大数组和
 * leetcode第1005题：https://leetcode-cn.com/problems/maximize-sum-of-array-after-k-negations/
 */
public class LargestSumAfterKNegations {

    /**
     * 自己的解法：时间击败80% 空间击败50%
     */
    private static int getSum1(int[] data, int k){
        Arrays.sort(data);
        int res = 0;

        int i = 0;
        for (; i < k; i++) {
            if (data[i] == 0) {
                i ++;
                break;
            }
            else {
                if (data[i] > 0 || (data[i] < 0 && Math.abs(data[i]) < data[i + 1])){
                    res += (k - i) % 2 == 0 ? data[i] : -data[i];
                    i++;
                    break;
                }
                else {
                    res += Math.abs(data[i]);
                }
            }
        }
        for (; i < data.length; i ++){
            res += data[i];
        }
        return res;
    }

}
