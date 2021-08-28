package main

//移动零：https://leetcode.com/problems/move-zeroes/

func moveZeroes1(nums []int) {
	i := 0
	for j := 0; j < len(nums); j++ {
		if nums[j] != 0 {
			if i != j {
				nums[i], nums[j] = nums[j], nums[i]
			}
			i++
		}
	}
}

func moveZeroes2(nums []int) {
	i := 0
	for j := 0; j < len(nums); j++ {
		if nums[j] != 0 {
			if i != j {
				nums[i] = nums[j]
				nums[j] = 0
			}
			i++
		}
	}
}

func moveZeros3(nums []int) {
	i, j := 0, 0
	for j < len(nums) {
		if nums[j] != 0 {
			nums[i], nums[j] = nums[j], nums[i]
			i++
		}
		j++
	}
}
