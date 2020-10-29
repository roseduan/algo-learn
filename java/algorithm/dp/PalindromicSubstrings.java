package algorithm.dp;

/**
 * 回文子串
 */
public class PalindromicSubstrings {

    /**
     * 暴力法
     */
    public int countSubstrings1(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindromic(s.substring(i, j + 1))) {
                    res++;
                }
            }
        }
        return res;
    }

    private boolean isPalindromic(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 动态规划
     */
    public int countSubstrings2(String s) {
        int res = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int j = 0; j < s.length(); j++) {
            for (int i = 0; i <= j; i++) {
                if (s.charAt(i) == s.charAt(j) && (j - i <= 1 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    res++;
                }
            }
        }
        return res;
    }
}
