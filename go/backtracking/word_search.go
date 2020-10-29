package main

//单词搜索

func exist(board [][]byte, word string) bool {
	visited := make([][]bool, len(board))
	for i := range visited {
		visited[i] = make([]bool, len(board[0]))
	}
	for i := 0; i < len(board); i++ {
		for j := 0; j < len(board[i]); j++ {
			if existHelper(board, i, j, 0, word, visited) {
				return true
			}
		}
	}
	return false
}

func existHelper(board [][]byte, i, j, k int, word string, visited [][]bool) bool {
	if k == len(word) {
		return true
	}
	if i < 0 || j < 0 || i >= len(board) || j >= len(board[0]) {
		return false
	}
	if board[i][j] != word[k] || visited[i][j] {
		return false
	}

	visited[i][j] = true
	if existHelper(board, i-1, j, k+1, word, visited) || existHelper(board, i, j-1, k+1, word, visited) || existHelper(board, i+1, j, k+1, word, visited) || existHelper(board, i, j+1, k+1, word, visited) {
		return true
	}
	visited[i][j] = false
	return false
}
