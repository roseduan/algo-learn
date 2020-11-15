package algorithm.string.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author roseduan
 * @time 2020/11/9 6:42 下午
 * @description 翻转字符串中的单词
 */
public class ReverseWordsInString {

    /**
     * 借助一个额外的数组存储
     */
    public String reverseWords1(String s) {
        List<String> list = new ArrayList<>();
        String[] words = s.split(" ");
        for (String word : words) {
            if (word.trim().length() > 0) {
                list.add(word);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i)).append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }

    /**
     * 另一种写法
     */
    public String reverseWords2(String s) {
        String[] words = s.split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}
