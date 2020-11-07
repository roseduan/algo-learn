package datastructure.stack.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author roseduan
 * @time 2020/9/9 11:34 下午
 * @description 判断有效的括号
 */
public class ValidParentheses {

    /**
     * 第一种解法：暴力求解，每次进行替换，需要注意退出循环的条件
     * 运行结果：速度击败 5%
     */
    public boolean isValid1(String s) {
        while (s.length() != 0) {
            int len = s.length();
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
            if (s.length() == len){
                break;
            }
        }
        return s.length() == 0;
    }

    /**
     * 借助栈实现匹配
     */
    public boolean isValid2(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (stack.empty() || !map.get(c).equals(stack.pop())) {
                return false;
            }
        }
        return stack.empty();
    }

    /**
     * 另一种写法
     */
    public boolean isValid3(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else {
                if (stack.empty() || stack.pop() != c) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
