package main

import (
	"math"
)

// 柱状图中最大的矩形

// 暴力法，执行会超时
func largestRectangleArea1(heights []int) int {
	if len(heights) == 1 {
		return heights[0]
	}
	max := 0
	for i := 0; i < len(heights); i++ {
		min := heights[i]
		for j := i; j < len(heights); j++ {
			if heights[j] < min {
				min = heights[j]
			}
			max = int(math.Max(float64(max), float64(min*(j-i+1))))
		}
	}
	return max
}

// 优化的暴力
func largestRectangleArea2(heights []int) int {
	if heights == nil || len(heights) == 0 {
		return 0
	}

	res := 0
	for i := 0; i < len(heights); i++ {
		left, right := i, i

		for left > 0 && heights[left-1] >= heights[i] {
			left--
		}
		for right < len(heights)-1 && heights[right+1] >= heights[i] {
			right++
		}

		res = int(math.Max(float64(res), float64(heights[i]*(right-left+1))))
	}
	return res
}

// 使用一个栈
func largestRectangleArea3(heights []int) int {
	stack, res := []int{-1}, 0
	for i, v := range heights {
		for len(stack) > 1 && v < heights[stack[len(stack)-1]] {
			j := stack[len(stack)-2]
			k := stack[len(stack)-1]
			stack = stack[:len(stack)-1]
			res = int(math.Max(float64(res), float64(heights[k]*(i-j-1))))
		}
		stack = append(stack, i)
	}

	for i := 1; i < len(stack); i++ {
		m := stack[len(stack)-1] + 1
		res = int(math.Max(float64(res), float64(heights[stack[i]]*(m-stack[i-1]-1))))
	}
	return res
}
