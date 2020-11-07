package algorithm.sort.leetcode;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author roseduan
 * 数组的相对排序
 */
public class RelativeSortArray {

    /**
     * 使用计数排序
     */
    public int[] relativeSortArray1(int[] arr1, int[] arr2) {
        int[] temp = new int[1001];
        for (int a : arr1) {
            temp[a]++;
        }

        int i = 0;
        for (int a : arr2) {
            while (temp[a]-- > 0) {
                arr1[i++] = a;
            }
        }

        for (int j = 0; j < temp.length; j++) {
            while (temp[j]-- > 0) {
                arr1[i++] = j;
            }
        }
        return arr1;
    }

    /**
     * 使用一个 TreeMap
     */
    public int[] relativeSortArray2(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int a : arr1) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        int[] res = new int[arr1.length];
        int i = 0;
        for (int a : arr2) {
            for (int j = 0; j < map.get(a); j++) {
                res[i++] = a;
            }
            map.remove(a);
        }

        for (int k : map.keySet()) {
            for (int j = 0; j < map.get(k); j++) {
                res[i++] = k;
            }
        }
        return res;
    }
}
