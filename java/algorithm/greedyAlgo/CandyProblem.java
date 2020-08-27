package algorithm.greedyAlgo;

import java.util.Arrays;

/**
 * @author roseduan
 * @time 2019/7/11 10:05
 * @description 分糖果问题
 * leetcode第135题：https://leetcode-cn.com/problems/candy/
 */
public class CandyProblem {

    /**
     * 第一种办法，使用一个数组，两次遍历
     */
   private static int getCandies1(int[] ratings){
        int length = ratings.length;
        int[] candies = new int[length];
        Arrays.fill(candies, 1);
        boolean flag = true;

        while (flag){
            flag = false;
            for (int i = 0; i < length; i ++) {
                if (i != length - 1 && ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1]){
                    candies[i] = candies[i + 1] + 1;
                    flag = true;
                }
                if (i != 0 && ratings[i] > ratings[i - 1] && candies[i] <= candies[i - 1]){
                    candies[i] = candies[i - 1] + 1;
                    flag = true;
                }
            }
        }
        int res = 0;
        for (int candy : candies){
            res += candy;
        }
        return res;
   }

    /**
     * 第二种办法，使用两个数组
     */
    private static int getCandies2(int[] ratings){
        int length = ratings.length;
        int[] leftToRight = new int[length];
        int[] rightToLeft = new int[length];
        Arrays.fill(leftToRight, 1);
        Arrays.fill(rightToLeft, 1);

        for (int i = 1; i < length; i ++) {
            if (ratings[i] > ratings[i - 1]){
                leftToRight[i] = leftToRight[i - 1] + 1;
            }
        }
        for (int i = length - 2; i >= 0; i --) {
            if (ratings[i] > ratings[i + 1]){
                rightToLeft[i] = rightToLeft[i + 1] + 1;
            }
        }

        int res= 0;
        for (int i = 0; i < length; i++) {
            res += Math.max(leftToRight[i], rightToLeft[i]);
        }
        return res;
    }

    /**
     * 第三种方法，使用一个数组，遍历一次
     */
    private static int getCandies3(int[] ratings) {
        int length = ratings.length;
        int[] candies = new int[length];
        Arrays.fill(candies, 1);

        for (int i = 1; i < length; i ++) {
            if (ratings[i] > ratings[i - 1]){
                candies[i] = candies[i - 1] + 1;
            }
        }

        int res = candies[length - 1];
        for (int i = length - 2; i >= 0; i --) {
            if (ratings[i] > ratings[i + 1]){
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
            res += candies[i];
        }
        return res;
    }
}
