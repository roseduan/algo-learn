package main

import "sort"

//存在重复元素

// 先排序，再依次遍历查看是否有重复元素
func containsDuplicate1(nums []int) bool {
	sort.Ints(nums)
	for i := 0; i < len(nums)-1; i++ {
		if nums[i] == nums[i+1] {
			return true
		}
	}
	return false
}

//使用一个哈希表记录元素是否出现
func containsDuplicate2(nums []int) bool {
	m := map[int]bool{}
	for _, n := range nums {
		if _, ok := m[n]; ok {
			return true
		}
		m[n] = true
	}
	return false
}
