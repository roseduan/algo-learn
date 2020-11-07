package main

// 打家劫舍

import "math"

func rob1(nums []int) int {
	if len(nums) <= 1 {
		if len(nums) == 1 {
			return nums[0]
		}
		return 0
	}

	dp := make([]int, len(nums))
	dp[0], dp[1] = nums[0], int(math.Max(float64(nums[0]), float64(nums[1])))
	for i := 2; i < len(nums); i++ {
		dp[i] = int(math.Max(float64(nums[i]+dp[i-2]), float64(dp[i-1])))
	}
	return dp[len(nums)-1]
}

// 简化的写法
func rob2(nums []int) int {
	prev, next := 0, 0
	for _, v := range nums {
		prev, next = next, int(math.Max(float64(next), float64(prev+v)))
	}
	return next
}
