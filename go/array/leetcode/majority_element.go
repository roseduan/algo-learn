package main

import "sort"

//多数元素

//排序取中间的值
func majorityElement1(nums []int) int {
	sort.Ints(nums)
	return nums[len(nums)/2]
}

//使用一个哈希表
func majorityElement2(nums []int) int {
	m := map[int]int{}
	for _, v := range nums {
		m[v] += 1
		if m[v] > len(nums)/2 {
			return v
		}
	}
	return 0
}

//摩尔投票法
func majorityElement3(nums []int) int {
	candidate, count := nums[0], 1
	for _, v := range nums {
		if candidate == v {
			count++
		} else {
			count--
			if count == 0 {
				candidate = v
				count = 1
			}
		}
	}
	return candidate
}
