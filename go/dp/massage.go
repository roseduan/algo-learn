package main

//按摩师（小偷转行当按摩师了。。。此题和打家劫舍思路完全一致）

func massage1(nums []int) int {
	if len(nums) <= 1 {
		if len(nums) == 0 {
			return 0
		}
		return nums[0]
	}

	dp := make([]int, len(nums))
	dp[0], dp[1] = nums[0], max(nums[0], nums[1])
	for i := 2; i < len(nums); i++ {
		dp[i] = max(dp[i-1], dp[i-2]+nums[i])
	}
	return dp[len(nums)-1]
}

//简化的写法
func massage2(nums []int) int {
	prev, next := 0, 0
	for _, v := range nums {
		prev, next = next, max(v+prev, next)
	}
	return next
}

func max(x, y int) int {
	if x > y {
		return x
	}
	return y
}
