package algorithm.string.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author roseduan
 * @time 2020/10/25 9:50 下午
 * @description 字符串转换为整数
 */
public class StringToInteger {

    public static void main(String[] args) {
        StringToInteger instance = new StringToInteger();
        int res = instance.myAtoi("4193 with words");
        System.out.println(res);
    }

    private static final Set<Character> nums = new HashSet<>(Arrays.asList('-', '1', '2', '3', '4', '5', '6', '7', '8', '9'));

    public int myAtoi(String s) {
        return 1;
    }
}
