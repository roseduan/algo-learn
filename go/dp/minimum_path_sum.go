package main

import "math"

// 最小路径和

func minPathSum1(grid [][]int) int {
	m, n := len(grid), len(grid[0])
	dp := make([][]int, m)
	for i := range dp {
		dp[i] = make([]int, n)
	}

	dp[0][0] = grid[0][0]
	for i := 1; i < m; i++ {
		dp[i][0] = dp[i-1][0] + grid[i][0]
	}
	for i := 1; i < n; i++ {
		dp[0][i] = dp[0][i-1] + grid[0][i]
	}
	for i := 1; i < m; i++ {
		for j := 1; j < n; j++ {
			dp[i][j] = grid[i][j] + int(math.Min(float64(dp[i-1][j]), float64(dp[i][j-1])))
		}
	}
	return dp[m-1][n-1]
}

//简化一维的写法
func minPathSum2(grid [][]int) int {
	dp := make([]int, len(grid[0]))
	dp[0] = grid[0][0]
	for i := 1; i < len(grid[0]); i++ {
		dp[i] = grid[0][i] + dp[i-1]
	}
	for i := 1; i < len(grid); i++ {
		for j := 0; j < len(grid[i]); j++ {
			if j == 0 {
				dp[j] += grid[i][j]
			} else {
				dp[j] = grid[i][j] + int(math.Min(float64(dp[j]), float64(dp[j-1])))
			}
		}
	}
	return dp[len(grid[0])-1]
}

//直接在原数组上修改
func minPathSum3(grid [][]int) int {
	for i := 1; i < len(grid); i++ {
		grid[i][0] += grid[i-1][0]
	}
	for i := 1; i < len(grid[0]); i++ {
		grid[0][i] += grid[0][i-1]
	}
	for i := 1; i < len(grid); i++ {
		for j := 1; j < len(grid[i]); j++ {
			grid[i][j] += int(math.Min(float64(grid[i-1][j]), float64(grid[i][j-1])))
		}
	}
	return grid[len(grid)-1][len(grid[0])-1]
}
