package leetcode

//朋友圈

//深度优先的思路
func findCircleNum1(M [][]int) int {
	visited, res := make([]bool, len(M)), 0
	for i := 0; i < len(M); i++ {
		if !visited[i] {
			findHelper(M, visited, i)
			res++
		}
	}
	return res
}

func findHelper(m [][]int, visited []bool, i int) {
	for j := 0; j < len(m); j++ {
		if m[i][j] == 1 && !visited[j] {
			visited[j] = true
			findHelper(m, visited, j)
		}
	}
}
