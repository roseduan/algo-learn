package main

import (
	"math"
)

//买卖股票的最佳时机I

//暴力法，两层遍历寻找最大值
func maxProfit1(prices []int) int {
	max := 0
	for i := 0; i < len(prices)-1; i++ {
		for j := i + 1; j < len(prices); j++ {
			if prices[j]-prices[i] > max {
				max = prices[j] - prices[i]
			}
		}
	}
	return max
}

//一次遍历
func maxProfit2(prices []int) int {
	min, max := math.MaxInt64, 0
	for _, v := range prices {
		if v < min {
			min = v
		} else if v-min > max {
			max = v - min
		}
	}
	return max
}
