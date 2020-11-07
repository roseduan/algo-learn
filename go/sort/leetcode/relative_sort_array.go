package leetcode

import "sort"

// 数组的相对排序
// 使用哈希表，有点复杂的实现。。。
func relativeSortArray1(arr1 []int, arr2 []int) []int {
	m := make(map[int]int)
	for _, v := range arr1 {
		m[v]++
	}

	var res []int
	for _, v := range arr2 {
		for i := 0; i < m[v]; i++ {
			res = append(res, v)
		}
		delete(m, v)
	}

	if len(m) > 0 {
		var temp []int
		for k, v := range m {
			for i := 0; i < v; i++ {
				temp = append(temp, k)
			}
		}
		sort.Ints(temp)
		for _, v := range temp {
			res = append(res, v)
		}
	}
	return res
}

// 使用计数排序的思路
func relativeSortArray2(arr1 []int, arr2 []int) []int {
	temp := make([]int, 1001)
	var res []int
	for _, v := range arr1 {
		temp[v]++
	}

	for _, v := range arr2 {
		for i := 0; i < temp[v]; i++ {
			res = append(res, v)
		}
		temp[v] = 0
	}

	for j := range temp {
		for i := 0; i < temp[j]; i++ {
			res = append(res, j)
		}
	}
	return res
}
