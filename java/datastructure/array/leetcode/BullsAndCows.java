package datastructure.array.leetcode;

/**
 * @author roseduan
 * @time 2020/9/12 11:23 下午
 * @description 猜数字游戏
 */
public class BullsAndCows {

    public String getHint(String secret, String guess) {
        int A = 0, B = 0;
        int[] numbers = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                A++;
            } else {
                if (numbers[secret.charAt(i)-'0']++ < 0) {
                    B++;
                }
                if (numbers[guess.charAt(i)-'0']-- > 0) {
                    B++;
                }
            }
        }
        return A + "A" + B + "B";
    }
}
