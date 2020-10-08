package main

import (
	"sort"
)

//合并两个有序数组

//第一种解法，直接将nums2放到nums1的后面，然后再进行一次排序
func merge1(nums1 []int, m int, nums2 []int, n int) {
	copy(nums1[m:], nums2[:])
	sort.Ints(nums1)
}

//第二种解法，新开辟一个数组，然后使用双指针
func merge2(nums1 []int, m int, nums2 []int, n int) {
	temp := make([]int, len(nums1))
	i, j, k := 0, 0, 0
	for i < m && j < n {
		if nums1[i] < nums2[j] {
			temp[k] = nums1[i]
			i++
		} else {
			temp[k] = nums2[j]
			j++
		}
		k++
	}

	if i < m {
		copy(temp[k:], nums1[i:])
	}
	if j < n {
		copy(temp[k:], nums2[j:])
	}
	copy(nums1, temp)
}

//第三种解法，倒序比较，双指针
func merge3(nums1 []int, m int, nums2 []int, n int) {
	i, j, k := m-1, n-1, len(nums1)-1
	for i >= 0 && j >= 0 {
		if nums1[i] < nums2[j] {
			nums1[k] = nums2[j]
			j--
		} else {
			nums1[k] = nums1[i]
			i--
		}
		k--
	}
	if j >= 0 {
		copy(nums1[:k+1], nums2[:j+1])
	}
}
