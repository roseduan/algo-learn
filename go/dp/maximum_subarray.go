package main

import "math"

//最大子序和

func maxSubArray(nums []int) int {
	res, max := nums[0], nums[0]
	for i := 1; i < len(nums); i++ {
		max = int(math.Max(float64(nums[i]), float64(max+nums[i])))
		res = int(math.Max(float64(res), float64(max)))
	}
	return res
}
