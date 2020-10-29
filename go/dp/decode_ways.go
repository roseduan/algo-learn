package main

import (
	"strconv"
)

// 解码方法
// https://leetcode-cn.com/problems/decode-ways

func numDecodings(s string) int {
	dp := make([]int, len(s)+1)
	dp[0] = 1
	if s[0] != '0' {
		dp[1] = 1
	}

	for i := 1; i < len(s); i++ {
		if v, _ := strconv.Atoi(string(s[i])); v > 0 && v < 10 {
			dp[i+1] += dp[i]
		}

		if k, _ := strconv.Atoi(s[i-1 : i+1]); k >= 10 && k <= 26 {
			dp[i+1] += dp[i-1]
		}
	}
	return dp[len(s)]
}
