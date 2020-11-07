package main

//N皇后问题II

//常规解法

func totalNQueens(n int) int {
	shu, pie, na := make(map[int]bool), make(map[int]bool), make(map[int]bool)
	var dfs func(n, i int, shu, pie, na map[int]bool)
	res := 0
	dfs = func(n, i int, shu, pie, na map[int]bool) {
		if i == n {
			res++
			return
		}
		for j := 0; j < n; j++ {
			if !shu[j] && !pie[i-j] && !na[i+j] {
				shu[j], pie[i-j], na[i+j] = true, true, true
				dfs(n, i+1, shu, pie, na)
				shu[j], pie[i-j], na[i+j] = false, false, false
			}
		}
	}
	dfs(n, 0, shu, pie, na)
	return res
}

//位运算
func totalNQueens2(n int) (ans int) {
	var solve func(row, columns, diagonals1, diagonals2 int)
	solve = func(row, columns, diagonals1, diagonals2 int) {
		if row == n {
			ans++
			return
		}
		availablePositions := (1<<n - 1) &^ (columns | diagonals1 | diagonals2)
		for availablePositions > 0 {
			position := availablePositions & -availablePositions
			solve(row+1, columns|position, (diagonals1|position)<<1, (diagonals2|position)>>1)
			availablePositions &^= position
		}
	}
	solve(0, 0, 0, 0)
	return
}
