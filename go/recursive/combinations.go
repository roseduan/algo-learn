package main

//组合

func combine(n int, k int) [][]int {
	var res [][]int
	var data []int
	combineHelper(n, k, 1, data, &res)
	return res
}

func combineHelper(n, k, start int, data []int, res *[][]int) {
	if len(data) == k {
		temp := make([]int, k)
		copy(temp, data)
		*res = append(*res, temp)
		return
	}

	for i := start; i <= n; i++ {
		data = append(data, i)
		start++
		combineHelper(n, k, start, data, res)
		data = data[:len(data)-1]
	}
}
