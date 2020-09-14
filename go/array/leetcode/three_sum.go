package main

import (
	"sort"
)

//三数之和

//暴力求解
func threeSum1(nums []int) [][]int {
	res := make([][]int, 0)
	set := map[[3]int]bool{}

	for i := 0; i < len(nums)-2; i++ {
		for j := i + 1; j < len(nums)-1; j++ {
			for k := j + 1; k < len(nums); k++ {
				if nums[i]+nums[j] == -nums[k] {
					lis := []int{nums[i], nums[j], nums[k]}
					sort.Ints(lis)

					var arr [3]int
					copy(arr[:], lis)
					if !set[arr] {
						res = append(res, lis)
						set[arr] = true
					}
				}
			}
		}
	}
	return res
}

//排序后，双指针解法
func threeSum2(nums []int) [][]int {
	var res [][]int
	sort.Ints(nums)
	for i := 0; i < len(nums)-2; i++ {
		if nums[i] > 0 {
			break
		}
		if i > 0 && nums[i] == nums[i-1] {
			continue
		}

		j, k := i+1, len(nums)-1
		for j < k {
			if nums[j]+nums[k] == -nums[i] {
				res = append(res, []int{nums[i], nums[j], nums[k]})
				j++
				k--
				for j < k && nums[j] == nums[j-1] {
					j++
				}
				for j < k && nums[k] == nums[k+1] {
					k--
				}
			} else if nums[j]+nums[k] < -nums[i] {
				j++
			} else {
				k--
			}
		}
	}
	return res
}
