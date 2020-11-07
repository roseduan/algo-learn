package algorithm.search.leetcode;

import java.util.*;

/**
 * @author roseduan
 * @time 2020/10/31 8:29 下午
 * @description 单词接龙
 */
public class WordLadder {

    /**
     * BFS解决
     */
    public int ladderLength1(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) {
            return 0;
        }
        
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int res = 0;
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                String cur = queue.poll();
                if (endWord.equals(cur)) {
                    return res + 1;
                }

                for (int j = 0; j < cur.length(); j++) {
                    char[] chars = cur.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[j] = c;
                        String mod = String.valueOf(chars);
                        if (wordSet.contains(mod)) {
                            queue.add(mod);
                            wordSet.remove(mod);
                        }
                    }
                }
            }
            res++;
        }
        return 0;
    }

    /**
     * 双向BFS的思路
     */
    public int ladderLength2(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) {
            return 0;
        }

        Set<String> beginSet = new HashSet<>();
        Set<String> endSet = new HashSet<>();
        Set<String> visited = new HashSet<>();

        beginSet.add(beginWord);
        endSet.add(endWord);
        int res = 1;

        while (!beginSet.isEmpty() && !endSet.isEmpty()) {
            if (beginSet.size() > endSet.size()) {
                Set<String> set = beginSet;
                beginSet = endSet;
                endSet = set;
            }

            Set<String> temp = new HashSet<>();
            for (String word : beginSet) {
                char[] chars = word.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    for (char c = 'a'; c <= 'z'; c++) {
                        char old = chars[i];
                        chars[i] = c;
                        String target = String.valueOf(chars);
                        if (endSet.contains(target)) {
                            return res + 1;
                        }

                        if (!visited.contains(target) && wordSet.contains(target)) {
                            visited.add(target);
                            wordSet.remove(target);
                        }
                        chars[i] = old;
                    }
                }
            }
            beginSet = temp;
            res++;
        }
        return 0;
    }
}
