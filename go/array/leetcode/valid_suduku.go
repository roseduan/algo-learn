package main

//有效的数独

func isValidSudoku(board [][]byte) bool {
	var hor, ver, grid [9][9]bool
	for i := 0; i < 9; i++ {
		for j := 0; j < 9; j++ {
			if board[i][j] != '.' {
				k := board[i][j] - '1'
				if hor[i][k] || ver[j][k] || grid[i/3*3+j/3][k] {
					return false
				}
				hor[i][k], ver[j][k], grid[i/3*3+j/3][k] = true, true, true
			}
		}
	}
	return true
}
