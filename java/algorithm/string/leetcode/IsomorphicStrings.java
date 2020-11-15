package algorithm.string.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author roseduan
 * 同构字符串
 */
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (Integer i = 0; i < s.length(); i++) {
            if (map1.put(s.charAt(i), i) != map2.put(t.charAt(i), i)) {
                return false;
            }
        }
        return true;
    }
}
