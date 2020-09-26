package main

//全排列

func permute(nums []int) [][]int {
	var res [][]int
	var data []int
	permuteHelper(len(nums), nums, data, &res)
	return res
}

func permuteHelper(n int, nums []int, data []int, res *[][]int) {
	if len(data) == n {
		temp := make([]int, n)
		copy(temp, data)
		*res = append(*res, temp)
		return
	}

	for _, v := range nums {
		if exist(data, v) {
			continue
		}
		data = append(data, v)
		permuteHelper(n, nums, data, res)
		data = data[:len(data)-1]
	}
}

func exist(data []int, k int) bool {
	for _, v := range data {
		if v == k {
			return true
		}
	}
	return false
}
