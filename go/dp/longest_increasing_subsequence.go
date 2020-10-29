package main

import (
	"math"
)

// 最长上升子序列

// 动态规划
func lengthOfLIS1(nums []int) int {
	n := len(nums)
	if n <= 1 {
		return n
	}

	dp, res := make([]int, n), 0
	dp[0] = 1
	for i := 1; i < n; i++ {
		dp[i] = 1
		for j := 0; j < i; j++ {
			if nums[i] > nums[j] {
				dp[i] = int(math.Max(float64(dp[i]), float64(dp[j]+1)))
			}
		}
		res = int(math.Max(float64(res), float64(dp[i])))
	}
	return res
}

// 二分法
func lengthOfLIS2(nums []int) int {

	return 1
}
