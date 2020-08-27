package algorithm.stringmatch;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/12/28 15:01
 * @description BF算法，暴力匹配
 */
public class BruteForce {

    /**
     * 第一种写法
     * @param main 主串
     * @param ptn 模式串
     * @return 结果
     */
    public static int bf1(String main, String ptn){
        int n = main.length();
        int m = ptn.length();
        if (m > n){
            return -1;
        }

        for (int i = 0; i <= n - m; i++) {
            for (int j = 0; j < m; j++) {
                if (main.charAt(i + j) != ptn.charAt(j)){
                    break;
                }
                if (j == m - 1){
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * 第二种写法
     * @param main 主串
     * @param ptn 模式串
     * @return 结果
     */
    public static int bf2(String main, String ptn){
        int n = main.length();
        int m = ptn.length();
        if (m > n){
            return -1;
        }

        for (int i = 0; i <= n - m; i++) {
            int p = i;
            int q = 0;
            while (main.charAt(p++) == ptn.charAt(q++)){
                if (q == m){
                    return i;
                }
            }
        }

        return -1;
    }

}
