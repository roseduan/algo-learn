package datastructure.hashtable.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author roseduan
 * @time 2020/9/14 3:33 下午
 * @description 有效的字母异位词
 */
public class ValidAnagram {

    /**
     * 第一种解法：排序后再比较
     * 运行结果：通过，速度击败47%
     */
    public boolean isAnagram1(String s, String t) {
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);

        char[] s2 = t.toCharArray();
        Arrays.sort(s2);
        return String.valueOf(s1).equals(String.valueOf(s2));
    }

    /**
     * 第二种解法：使用一个哈希表
     * 运行结果：通过，速度击败8%。。。。垃圾
     */
    public boolean isAnagram2(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            Integer count = map.get(c);
            if (count == null) {
                return false;
            }
            if (count == 1) {
                map.remove(c);
            }else {
                map.put(c, count - 1);
            }
        }
        return map.isEmpty();
    }

    /**
     * 使用一个数组
     * 运行结果：通过，速度击败 45%
     */
    public boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] temp = new int[26];
        for (int i = 0; i < s.length(); i++) {
            temp[s.charAt(i) - 'a']++;
            temp[t.charAt(i) - 'a']--;
        }

        for (int i : temp) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 使用一个数组的优化
     * 运行结果：通过，速度击败 99%
     */
    public boolean isAnagram4(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] temp = new int[26];
        for (char c : s.toCharArray()) {
            temp[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            if (--temp[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
