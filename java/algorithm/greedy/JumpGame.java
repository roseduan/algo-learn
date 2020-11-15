package algorithm.greedy;

/**
 * 跳跃游戏
 */
public class JumpGame {

    public boolean canJump1(int[] nums) {
        int n = nums.length, r = 0;
        for (int i = 0; i < n; i++) {
            if (i <= r) {
                r = Math.max(r, i + nums[i]);
                if (r >= n - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean canJump2(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                return false;
            }
            k = Math.max(k, i + nums[i]);
        }
        return true;
    }
}
