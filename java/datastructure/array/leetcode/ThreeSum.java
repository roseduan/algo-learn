package datastructure.array.leetcode;

import java.util.*;

/**
 * @author roseduan
 * @time 2020/9/9 8:52 下午
 * @description 三数之和
 */
public class ThreeSum {

    /**
     * 第一种方法：暴力求解，三重循环，注意判重的情况
     * 运行结果：未通过，超时
     */
    public List<List<Integer>> threeSum1(int[] nums) {
        if (nums == null || nums.length < 3){
            return Collections.emptyList();
        }

        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] == -nums[k]) {
                        List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                        set.add(list);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }

    /**
     * 第二种解法：两层for循环，里层的for循环相当于两数之和，使用排序的方式去重
     * 运行结果：通过，速度击败 5%。。。。垃圾
     */
    public List<List<Integer>> threeSum2(int[] nums) {
        if (nums == null || nums.length < 3){
            return Collections.emptyList();
        }

        Set<List<Integer>> res = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int k = -nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int m = nums[j];
                if (map.containsKey(k - m)){
                    List<Integer> list = Arrays.asList(nums[i], k- m, m);
                    Collections.sort(list);
                    res.add(list);
                }else {
                    map.put(m, j);
                }
            }
            map.clear();
        }
        return new ArrayList<>(res);
    }

    /**
     * 第三种解法：排序之后，使用双指针的方法
     * 运行结果：通过，速度击败 68%
     */
    public List<List<Integer>> threeSum3(int[] nums) {
        if (nums == null || nums.length < 3){
            return Collections.emptyList();
        }

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int k = 0; k < nums.length - 2; k++) {
            //排序之后，如果第一个target大于0，则三数之和一定大于0
            if (nums[k] > 0) {
                break;
            }

            //target和前一个重复，跳过
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }

            int i = k + 1, j = nums.length - 1;
            while (i < j) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (i < j && nums[i] == nums[++i]) {}
                    while (i < j && nums[j] == nums[--j]) {}
                }else if (sum < 0){
                    while (i < j && nums[i] == nums[++i]) {}
                }else {
                    while (i < j && nums[j] == nums[--j]) {}
                }
            }
        }
        return res;
    }
}
