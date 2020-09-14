package datastructure.array.leetcode;

/**
 * @author roseduan
 * @time 2020/9/8 10:50 下午
 * @description TODO
 */
public class PlusOne {

    /**
     * 倒序循环原数组，假设每一位上的数字为 i，如果 i < 9，则不会发生进位，直接在 i + 1 然后返回
     * 如果 i == 9，说明发生进位，i 变成 0，继续遍历
     * 如果跳出循环，仍未返回，说明全都是 9，则让第一位的数字为 1 ，并且数组长度加 1，其余位全为 0
     * 运行结果：通过，速度击败 100%
     */
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9){
                digits[i] += 1;
                return digits;
            }else {
                digits[i] = 0;
            }
        }

        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }

}
