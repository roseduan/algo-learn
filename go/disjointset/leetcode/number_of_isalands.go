package leetcode

//岛屿数量

//深度优先的思路解决
func numIslands1(grid [][]byte) int {
	visited, res := make([][]bool, len(grid)), 0
	for i := range visited {
		visited[i] = make([]bool, len(grid[0]))
	}

	for i := 0; i < len(grid); i++ {
		for j := 0; j < len(grid[0]); j++ {
			if grid[i][j] == '1' && !visited[i][j] {
				numIslandsHelper(grid, i, j, visited)
				res++
			}
		}
	}
	return res
}

func numIslandsHelper(grid [][]byte, i, j int, visited [][]bool) {
	if i < 0 || j < 0 || i >= len(grid) || j >= len(grid[0]) {
		return
	}
	if visited[i][j] || grid[i][j] == '0' {
		return
	}

	visited[i][j] = true
	numIslandsHelper(grid, i-1, j, visited)
	numIslandsHelper(grid, i, j-1, visited)
	numIslandsHelper(grid, i+1, j, visited)
	numIslandsHelper(grid, i, j+1, visited)
}

//广度优先的思路解决
func numIslands2(grid [][]byte) int {
	var queue [][]int
	res := 0
	for i := 0; i < len(grid); i++ {
		for j := 0; j < len(grid[i]); j++ {
			if grid[i][j] == '1' {
				queue = append(queue, []int{i, j})
				for len(queue) > 0 {
					row, col := queue[0][0], queue[0][1]
					queue = queue[1:]
					if row > 0 && grid[row-1][col] == '1' {
						queue = append(queue, []int{row - 1, col})
						grid[row-1][col] = '0'
					}
					if row < len(grid)-1 && grid[row+1][col] == '1' {
						queue = append(queue, []int{row + 1, col})
						grid[row+1][col] = '0'
					}
					if col > 0 && grid[row][col-1] == '1' {
						queue = append(queue, []int{row, col - 1})
						grid[row][col-1] = '0'
					}
					if col < len(grid[i])-1 && grid[row][col+1] == '1' {
						queue = append(queue, []int{row, col + 1})
						grid[row][col+1] = '0'
					}
				}
				res++
			}
		}
	}
	return res
}
