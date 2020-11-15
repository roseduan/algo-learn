package main

//不同路径

func uniquePaths1(m int, n int) int {
	dp := make([][]int, m)
	for i := range dp {
		dp[i] = make([]int, n)
	}

	for i := 0; i < m; i++ {
		for j := 0; j < n; j++ {
			if i == 0 || j == 0 {
				dp[i][j] = 1
			} else {
				dp[i][j] = dp[i-1][j] + dp[i][j-1]
			}
		}
	}
	return dp[m-1][n-1]
}

//简化一维的写法
func uniquePaths2(m int, n int) int {
	dp := make([]int, n)
	for i := 0; i < m; i++ {
		for j := 0; j < n; j++ {
			if j == 0 {
				dp[j] = 1
			} else {
				dp[j] += dp[j-1]
			}
		}
	}
	return dp[n-1]
}
