package algorithm.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author roseduan
 * @time 2020/9/24 11:06 下午
 * @description 组合
 */
public class Combinations {

    /**
     * 自己的答案，代码不够简洁啊
     */
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        List<List<Integer>> res = new ArrayList<>();
        helper(list, new ArrayList<>(), res, k);
        return res;
    }

    private void helper(List<Integer> list, List<Integer> temp, List<List<Integer>> res, int k) {
        if (temp.size() == k) {
            res.add(temp);
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            List<Integer> newTemp = new ArrayList<>(temp);
            newTemp.add(list.get(i));
            helper(list.subList(i + 1, list.size()), newTemp, res, k);
        }
    }

    /**
     * 高票答案，思路基本一致，代码更加的简洁
     */
    public List<List<Integer>> combine2(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<>(), 1, n, k);
        return res;
    }

    private void helper(List<List<Integer>> res, List<Integer> list, int start, int n, int k) {
        if (k == 0) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i <= n; i++) {
            list.add(i);
            helper(res, list, i + 1, n, k - 1);
            list.remove(list.size() - 1);
        }
    }
}
