package datastructure.hashtable.leetcode;

import java.util.*;

/**
 * @author roseduan
 * @time 2020/9/14 8:39 下午
 * @description 分组字母异位词
 */
public class GroupAnagram {

    /**
     * 使用map，并且对字符串进行排序分组
     * 运行结果：通过，速度击败55%
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = String.valueOf(chars);

            List<String> list = map.getOrDefault(sorted, new ArrayList<>());
            list.add(str);
            map.put(sorted, list);
        }
        return new ArrayList<>(map.values());
    }
}
