package algorithm.string.leetcode;

/**
 * 仅仅翻转字母
 */
public class ReverseOnlyLetters {

    /**
     * 双指针
     */
    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int i = 0, j = chars.length - 1;
        while (i < j) {
            if (!Character.isLetter(chars[i])) {
                i++;
            } else if (!Character.isLetter(chars[j])) {
                j--;
            } else {
                char temp = chars[i]; chars[i] = chars[j]; chars[j] = temp;
                i++; j--;
            }
        }
        return String.valueOf(chars);
    }
}
