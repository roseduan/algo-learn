package algorithm.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author roseduan
 * @time 2020/9/21 9:34 下午
 * @description 生成括号
 */
public class GenerateParentheses {

    /**
     * 第一种解法：暴力法，枚举所有的值，并且一一判断是否有效
     */
    public List<String> generateParenthesis1(int n) {
        List<String> res = new ArrayList<>();
        iterative(0, 2 * n, "", res);
        return res;
    }

    private void iterative(int i, int n, String res, List<String> list) {
        if (i == n) {
            if (isValid(res)) {
                list.add(res);
            }
            return;
        }

        iterative(i + 1, n, res + "(", list);
        iterative(i + 1, n, res + ")", list);
    }

    private boolean isValid(String str) {
        int i = 0;
        for (char c : str.toCharArray()) {
            if (c == '(') {
                i++;
            }
            if (c == ')') {
                i--;
            }
            if (i < 0) {
                return false;
            }
        }
        return i == 0;
    }

    /**
     * 第二种解法：使用回溯+剪枝的思想，在递归时，去掉不必要的条件循环
     */
    public List<String> generateParenthesis2(int n) {
        List<String> res = new ArrayList<>();
        helper(0,0, n,"", res);
        return res;
    }

    private void helper(int left, int right, int n, String res, List<String> list) {
        if (left == n && right == n) {
            list.add(res);
            return;
        }

        if (left < n) {
            helper(left + 1, right, n,res + "(", list);
        }
        if (right < left) {
            helper(left, right + 1, n,res + ")", list);
        }
    }

    /**
     * 第三种解法：迭代
     */
    public List<String> generateParenthesis3(int n) {
        List<List<String>> res = new ArrayList<>();
        res.add(Collections.singletonList(""));

        for (int i = 1; i <= n; i++) {
            List<String> list = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                for (String first : res.get(j)) {
                    for (String second : res.get(i - 1 - j)){
                        list.add("(" + first + ")" + second);
                    }
                }
            }
            res.add(list);
        }
        return res.get(res.size() - 1);
    }
}
