package algorithm.stringmatch;

/**
 * @author roseduan
 * @time 2019/7/8 11:34
 * @description KMP算法实现
 */
public class KMP {

    public static int knuthMorrisPratt(String main, String ptn) {
        int n = main.length();
        int m = ptn.length();
        if (n == 0 || m == 0 || m > n){
            return -1;
        }

        int[] next = getNext(ptn, m);
        int j = 0;
        for (int i = 0; i < n; i ++) {
            //说明有好前缀
            while (j > 0 && main.charAt(i) != ptn.charAt(j)){
                j = next[j - 1] + 1;
            }
            if (main.charAt(i) == ptn.charAt(j)){
                ++ j;
            }
            if (j == m){
                return i - m + 1;
            }
        }
        return -1;
    }


    /**
     * 失效函数计算方法
     */
    private static int[] getNext(String ptn, int m) {
        int[] next = new int[m];
        next[0] = -1;
        int k = -1;

        for (int i = 1; i < m; i ++) {
            while (k != -1 && ptn.charAt(k + 1) != ptn.charAt(i)){
                k = next[k];
            }
            if (ptn.charAt(k + 1) == ptn.charAt(i)){
                ++ k;
            }
            next[i] = k;
        }
        return next;
    }

}
