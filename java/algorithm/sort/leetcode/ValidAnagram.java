package algorithm.sort.leetcode;

import java.util.Arrays;

/**
 * @author roseduan
 * @time 2020/11/7 9:04 上午
 * @description 有效的字母异位词
 */
public class ValidAnagram {

    /**
     * 排序
     */
    public boolean isAnagram1(String s, String t) {
        char[] sCh = s.toCharArray();
        Arrays.sort(sCh);
        char[] tCh = t.toCharArray();
        Arrays.sort(tCh);
        return String.valueOf(sCh).equals(String.valueOf(tCh));
    }

    /**
     * 哈希表
     */
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] data = new int[26];
        for (char c : s.toCharArray()) {
            data[c - 'a'] += 1;
        }
        for (char c : t.toCharArray()) {
            if (--data[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
