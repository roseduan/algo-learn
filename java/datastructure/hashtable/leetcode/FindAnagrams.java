package datastructure.hashtable.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author roseduan
 * 找到字符串中所有的字母异位词
 */
public class FindAnagrams {
    
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : p.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        List<Integer> res = new ArrayList<>();
        int count = map.size();
        int begin = 0, end = 0;
        while (end < s.length()) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    count--;
                }
            }
            end++;

            while (count == 0) {
                char ch = s.charAt(begin);
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                    if (map.get(ch) > 0) {
                        count++;
                    }
                }
                if (end - begin == p.length()) {
                    res.add(begin);
                }
                begin++;
            }
        }
        return res;
    }
}
