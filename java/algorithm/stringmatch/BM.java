package algorithm.stringmatch;

import java.util.Arrays;

/**
 * @author roseduan
 * @time 2019/7/6 15:33
 * @description BM算法实现
 */
public class BM {

    private static final int SIZE = 256;

    public static int boyerMoore(String main, String ptn){
        int n = main.length();
        int m = ptn.length();
        if (n == 0 || m == 0 || m > n){
            return -1;
        }
        //生成坏字符数组
        int[] badChar = new int[SIZE];
        generateBadChar(ptn, badChar);
        //生成好后缀数组
        int[] suffix = new int[m];
        boolean[] prefix = new boolean[m];
        generateGoodSuffix(ptn, m, suffix, prefix);

        int i = 0;
        while (i <= n - m){
            int j = m - 1;
            for (; j >= 0; j --) {
                //存在坏字符
                if (main.charAt(i + j) != ptn.charAt(j)) {
                    break;
                }
            }
            //匹配成功
            if (j < 0){
                return i;
            }
            int x = j - badChar[main.charAt(i + j)];
            int y = 0;
            //如果有好后缀
            if (j < m - 1){
                y = stepOfGoodSuffix(j, m, suffix, prefix);
            }
            i += Math.max(x, y);
        }
        return -1;
    }

    /**
     * 生成坏字符数组
     */
    private static void generateBadChar(String ptn, int[] badChar){
        //初始化为-1
        Arrays.fill(badChar, -1);

        char[] chars = ptn.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            badChar[chars[i]] = i;
        }
    }

    /**
     * 生成好后缀
     */
    private static void generateGoodSuffix(String ptn, int m, int[] suffix, boolean[] prefix){
        //初始化
        Arrays.fill(suffix, -1);
        Arrays. fill(prefix, false);

        for (int i = 0; i < m - 1; i++) {
            int j = i;
            int k = 0;
            while (j >= 0 && ptn.charAt(j) == ptn.charAt(m - k - 1)){
                suffix[++ k] = j --;
            }
            if (j == -1){
                prefix[k] = true;
            }
        }
    }

    /**
     * 好后缀情况下的移动位数
     */
    private static int stepOfGoodSuffix(int j, int m, int[] suffix, boolean[] prefix) {
        //好后缀的长度
        int k = m - j - 1;

        if (suffix[k] != -1){
            return j - suffix[k] + 1;
        }
        int i = j + 2;
        for (; i <= m - 1; i ++) {
            if (prefix[m - i]){
                return i;
            }
        }
        return m;
    }

}
