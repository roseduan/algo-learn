package main

import (
	"sort"
)

//只出现一次的数字

// 排序之后遍历查找
func singleNumber1(nums []int) int {
	sort.Ints(nums)
	for i := 0; i < len(nums)-1; i += 2 {
		if nums[i] != nums[i+1] {
			return nums[i]
		}
	}
	return nums[len(nums)-1]
}

//使用一个哈希表
func singleNumber2(nums []int) int {
	m := make(map[int]bool)
	for _, n := range nums {
		if m[n] {
			delete(m, n)
		} else {
			m[n] = true
		}
	}

	res := 0
	for v := range m {
		res = v
	}
	return res
}

//使用哈希表，记录元素出现的次数
func singleNumber3(nums []int) int {
	m := make(map[int]int)

	for _, n := range nums {
		m[n] += 1
	}

	for k, v := range m {
		if v == 1 {
			return k
		}
	}

	return -1
}

//位运算
func singleNumber4(nums []int) int {
	res := 0
	for _, n := range nums {
		res ^= n
	}
	return res
}
