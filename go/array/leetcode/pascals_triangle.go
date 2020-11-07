package main

// 杨辉三角

func generate(numRows int) [][]int {
	var res [][]int
	for i := 0; i < numRows; i++ {
		v := make([]int, i+1)
		for j := range v {
			v[j] = 1
		}
		res = append(res, v)
		for j := 1; j < i; j++ {
			res[i][j] = res[i-1][j-1] + res[i-1][j]
		}
	}
	return res
}
