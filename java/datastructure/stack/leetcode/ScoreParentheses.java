package datastructure.stack.leetcode;

import java.util.LinkedList;

/**
 * @author roseduan
 * @time 2021/2/14 9:13 上午
 * @description 括号的分数
 */
public class ScoreParentheses {

    public int scoreOfParentheses(String S) {
        LinkedList<Integer> stack = new LinkedList<>();
        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack.addFirst(-1);
            } else {
                int k = 0;
                while (stack.peekFirst() != -1) {
                    k += stack.pollFirst();
                }
                stack.pollFirst();
                stack.addFirst(k == 0 ? 1 : 2 * k);
            }
        }

        return stack.stream().mapToInt(Integer::intValue).sum();
    }
}
