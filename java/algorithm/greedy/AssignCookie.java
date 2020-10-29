package algorithm.greedy;

import java.util.Arrays;

/**
 * @author roseduan
 * @time 2019/9/3 22:42
 * @description 分发饼干问题
 * leetcode第455题：https://leetcode-cn.com/problems/assign-cookies/
 */
public class AssignCookie {

    private static int findMoreChildren(int[] g, int[] s){
        Arrays.sort(g);
        Arrays.sort(s);

        int count = 0;
        int i = 0;
        int j = 0;
        while (i < g.length && j < s.length){
            if (s[j] >= g[i]){
                j++;
                i++;
                count++;
            }
            else {
                j++;
            }
        }
        return count;
    }

}
