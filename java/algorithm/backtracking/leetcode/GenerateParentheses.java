package algorithm.backtracking.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author roseduan
 * @time 2020/10/27 12:33 下午
 * @description 括号生成
 */
public class GenerateParentheses {

    /**
     * 深度优先搜索的思路解决
     */
    public List<String> generateParenthesis1(int n) {
        List<String> res = new ArrayList<>();
        dfs(n, 0, 0, "", res);
        return res;
    }

    private void dfs(int n, int left, int right, String cur, List<String> res) {
        if (cur.length() == 2 * n) {
            res.add(cur);
            return;
        }

        if (left < n) {
            dfs(n, left + 1, right, cur + "(", res);
        }
        if (right < left) {
            dfs(n, left, right + 1, cur + ")", res);
        }
    }
 
    /**
     * 广度优先的思路解决
     */
    public List<String> generateParenthesis2(int n) {
        List<String> res = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(n, n, ""));
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.left == 0 && node.right == 0) {
                res.add(node.cur);
            }
            if (node.left > 0) {
                queue.add(new Node(node.left - 1, node.right, node.cur + "("));
            }
            if (node.right > 0 && node.right > node.left) {
                queue.add(new Node(node.left, node.right - 1, node.cur + ")"));
            }
        }
        return res;
    }

    static class Node {
        int left;
        int right;
        String cur;

        public Node(int left, int right, String cur) {
            this.left = left;
            this.right = right;
            this.cur = cur;
        }
    }
}
