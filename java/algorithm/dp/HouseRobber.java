package algorithm.dp;

/**
 * 打家劫舍
 */
public class HouseRobber {

    public int rob1(int[] nums) {
        if (nums.length <= 1) {
            return nums.length == 0 ? 0 : nums[0];
        }

        int[] dp = new int[nums.length + 1];
        dp[0] = 0; dp[1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i + 1] = Math.max(nums[i] + dp[i - 1], dp[i]);
        }
        return dp[dp.length - 1];
    }

    /**
     * 简化的写法
     */
    public int rob2(int[] nums) {
        int prev = 0, next = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = prev;
            prev = next;
            next = Math.max(next, temp + nums[i]);
        }
        return next;
    }
}
