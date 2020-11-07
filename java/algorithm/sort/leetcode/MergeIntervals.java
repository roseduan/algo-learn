package algorithm.sort.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author roseduan
 * @time 2020/11/7 11:44 上午
 * @description 合并区间
 */
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> res = new ArrayList<>();
        for (int[] v : intervals) {
            if (res.size() == 0 || res.get(res.size() - 1)[1] < v[0]) {
                res.add(v);
            } else {
                int[] data = res.get(res.size() - 1);
                data[1] = Math.max(data[1], v[1]);
                res.set(res.size() - 1, data);
            }
        }
        return res.toArray(new int[][]{});
    }
}
