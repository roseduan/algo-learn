package main

import (
	"container/list"
)

//滑动窗口的最大值

//暴力法
func maxSlidingWindow1(nums []int, k int) []int {
	var res []int
	for i := 0; i <= len(nums)-k; i++ {
		max := nums[i]
		for j := i; j < i+k; j++ {
			if nums[j] > max {
				max = nums[j]
			}
		}
		res = append(res, max)
	}
	return res
}

//使用一个双端队列
func maxSlidingWindow2(nums []int, k int) []int {
	lis := list.New()
	var res []int
	for i, _ := range nums {
		for i > 0 && lis.Len() > 0 && nums[i] > nums[lis.Back().Value.(int)] {
			lis.Remove(lis.Back())
		}
		for lis.Len() > 0 && lis.Front().Value.(int) < i-k+1 {
			lis.Remove(lis.Front())
		}
		lis.PushBack(i)
		if i >= k-1 {
			res = append(res, nums[lis.Front().Value.(int)])
		}
	}
	return res
}
