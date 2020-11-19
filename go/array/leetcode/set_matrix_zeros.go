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
