package algorithm.string;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/7/5 21:17
 * @description RK算法，使用哈希算法提升字符串匹配效率
 */
public class RabinKarp {

    public static int rk(String main, String ptn) {
        int n = main.length();
        int m = ptn.length();
        if (n == 0 || m == 0 || m > n){
            return -1;
        }

        int p = hash(ptn);
        for (int i = 0; i <= n - m; i++) {
            String sub = main.substring(i, i + m);
            int q = hash(sub);
            if (p == q && sub.equals(ptn)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 哈希函数
     */
    private static int hash(String key) {
        char[] value = key.toCharArray();
        int h = 0;
        if (value.length > 0) {
            for (char c : value) {
                h = 31 * h + c;
            }
        }
        return h;
    }

}
