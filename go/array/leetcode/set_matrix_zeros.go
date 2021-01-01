package main

// 记录0出现的位置，然后再遍历置位0
func setZeroes1(matrix [][]int) {
	hor, ver := make(map[int]bool), make(map[int]bool)
	for i := 0; i < len(matrix); i++ {
		for j := 0; j < len(matrix[i]); j++ {
			if matrix[i][j] == 0 {
				hor[i], ver[j] = true, true
			}
		}
	}

	for i := 0; i < len(matrix); i++ {
		for j := 0; j < len(matrix[i]); j++ {
			if hor[i] || ver[j] {
				matrix[i][j] = 0
			}
		}
	}
}

func setZeroes2(matrix [][]int) {
	for i := 0; i < len(matrix); i++ {
		for j := 0; j < len(matrix[i]); j++ {
			if matrix[i][j] == 0 {
				helper(i, j, matrix)
			}
		}
	}

	for i := 0; i < len(matrix); i++ {
		for j := 0; j < len(matrix[i]); j++ {
			if matrix[i][j] == '*' {
				matrix[i][j] = 0
			}
		}
	}
}

func helper(i, j int, matrix [][]int) {
	for k := 0; k < len(matrix); k++ {
		if matrix[k][j] != 0 {
			matrix[k][j] = '*'
		}
	}

	for k := 0; k < len(matrix[i]); k++ {
		if matrix[i][k] != 0 {
			matrix[i][k] = '*'
		}
	}
}
