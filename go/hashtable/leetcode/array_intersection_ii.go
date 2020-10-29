package leetcode

import (
	"sort"
)

//求两个数组的交集II

//使用一个map来计数
func intersect(nums1 []int, nums2 []int) []int {
	if len(nums1) > len(nums2) {
		return intersect(nums2, nums1)
	}

	m := map[int]int{}
	for _, v := range nums1 {
		m[v] = m[v] + 1
	}

	var res []int
	for _, v := range nums2 {
		if m[v] > 0 {
			res = append(res, v)
			m[v] = m[v] - 1
		}
	}
	return res
}

//排序之后，使用双指针
func intersect2(nums1 []int, nums2 []int) []int {
	sort.Ints(nums1)
	sort.Ints(nums2)

	i, j := 0, 0
	var res []int
	for i < len(nums1) && j < len(nums2) {
		if nums1[i] == nums2[j] {
			res = append(res, nums1[i])
			i++
			j++
		} else if nums1[i] < nums2[j] {
			i++
		} else {
			j++
		}
	}
	return res
}
