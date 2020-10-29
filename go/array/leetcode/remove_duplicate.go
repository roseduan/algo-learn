package main

//删除排序数组中的重复数据

func removeDuplicates(nums []int) int {
	i, j := 0, 1
	for j < len(nums) {
		if nums[i] == nums[j] {
			j++
		} else {
			nums[i+1] = nums[j]
			i, j = i+1, j+1
		}
	}
	return i + 1
}
