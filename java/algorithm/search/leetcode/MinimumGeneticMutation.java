package algorithm.search.leetcode;

import java.util.*;

/**
 * @author roseduan
 * @time 2020/11/17 5:02 下午
 * @description 最小基因变化
 */
public class MinimumGeneticMutation {

    public int minMutation(String start, String end, String[] bank) {
        Set<String> bankSet = new HashSet<>(Arrays.asList(bank));
        if (!bankSet.contains(end)) {
            return -1;
        }

        int res = 0;
        char[] letters = {'A', 'C', 'G', 'T'};
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                String cur = queue.poll();
                if (end.equals(cur)) {
                    return res;
                }
                for (int j = 0; j < cur.length(); j++) {
                    char[] chars = cur.toCharArray();
                    for (char c : letters) {
                        chars[j] = c;
                        String mod = String.valueOf(chars);
                        if (bankSet.contains(mod)) {
                            queue.add(mod);
                            bankSet.remove(mod);
                        }
                    }
                }
            }
            res++;
        }
        return -1;
    }
}
