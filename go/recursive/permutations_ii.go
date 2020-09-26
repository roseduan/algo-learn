package main

import "sort"

//全排列II

func permuteUnique(nums []int) [][]int {
	sort.Ints(nums)
	var res [][]int
	var data []int
	visited := make([]bool, len(nums))
	permuteUniqueHelper(nums, visited, data, &res)
	return res
}

func permuteUniqueHelper(nums []int, visited []bool, data []int, res *[][]int) {
	if len(data) == len(nums) {
		temp := make([]int, len(nums))
		copy(temp, data)
		*res = append(*res, temp)
		return
	}

	for i, v := range nums {
		if (i > 0 && nums[i] == nums[i-1] && !visited[i-1]) || visited[i] {
			continue
		}
		data = append(data, v)
		visited[i] = true
		permuteUniqueHelper(nums, visited, data, res)
		visited[i] = false
		data = data[:len(data)-1]
	}
}
