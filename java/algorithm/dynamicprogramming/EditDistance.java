package algorithm.dynamicprogramming;

/**
 * @author roseduan
 * @time 2019/8/1 21:54
 * @description 求两个字符串的编辑距离
 */
public class EditDistance {

    private static int getEditDistance(String a, String b){
        if (a == null || b == null){
            return -1;
        }

        int aLength = a.length();
        int bLength = b.length();
        int[][] res = new int[bLength + 1][aLength + 1];
        for (int i = 0; i < aLength + 1; i++) {
            res[0][i] = i;
        }
        for (int i = 0; i < bLength + 1; i++) {
            res[i][0] = i;
        }

        for (int i = 1; i < bLength + 1; i++) {
            for (int j = 1; j < aLength + 1; j++) {
                int p = res[i - 1][j] + 1;
                int q = res[i][j - 1] + 1;
                int min = Math.min(p, q);

                int r = res[i - 1][j - 1];
                if (b.charAt(i - 1) != a.charAt(j - 1)){
                    r += 1;
                }
                res[i][j] = Math.min(min, r);
            }
        }
        return res[bLength][aLength];
    }

}
