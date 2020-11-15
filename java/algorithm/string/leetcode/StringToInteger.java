package algorithm.string.leetcode;

/**
 * @author roseduan
 * @time 2020/10/25 9:50 下午
 * @description 字符串转换为整数
 */
public class StringToInteger {

    public int myAtoi(String s) {
        if (s == null) {
            return 0;
        }
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }

        //判断第一个字符，确定正负
        char first = s.charAt(0);
        if (first != '+' && first != '-' && !Character.isDigit(first)) {
            return 0;
        }
        boolean flag = first == '-';

        //从第一个字符开始，取到最后一个有效的数字
        int start = Character.isDigit(first) ? 0 : 1;
        int count = start;
        for (; count < s.length(); count++) {
            if (!Character.isDigit(s.charAt(count))) {
                break;
            }
        }
        if (count == start) {
            return 0;
        }

        int val;
        try {
            val = Integer.parseInt(s.substring(start, count));
        } catch (Exception e) {
            return flag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        return flag ? -val : val;
    }
}
