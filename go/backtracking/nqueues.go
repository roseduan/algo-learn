package main

//N皇后问题
func solveNQueens(n int) [][]string {
	var res [][]string
	data := make([]int, n)
	shu, pie, na := make(map[int]bool), make(map[int]bool), make(map[int]bool)
	nQueuesHelper(n, 0, data, &res, shu, pie, na)
	return res
}

func nQueuesHelper(n, row int, data []int, res *[][]string, shu, pie, na map[int]bool) {
	if row == n {
		var temp []string
		for _, v := range data {
			var s []rune
			for i := 0; i < n; i++ {
				if i == v {
					s = append(s, 'Q')
				} else {
					s = append(s, '.')
				}
			}
			temp = append(temp, string(s))
		}
		*res = append(*res, temp)
		return
	}

	for col := 0; col < n; col++ {
		if !shu[col] && !pie[row+col] && !na[row-col] {
			shu[col], pie[row+col], na[row-col] = true, true, true
			data[row] = col
			nQueuesHelper(n, row+1, data, res, shu, pie, na)
			shu[col], pie[row+col], na[row-col] = false, false, false
		}
	}
}
