package main

//全排列

//深度优先的思路
func permute(nums []int) [][]int {
	var res [][]int
	var data []int
	visited := make([]bool, len(nums))
	permuteDfs(nums, data, visited, &res)
	return res
}

func permuteDfs(nums []int, data []int, visited []bool, res *[][]int) {
	if len(data) == len(nums) {
		temp := make([]int, len(nums))
		copy(temp, data)
		*res = append(*res, temp)
		return
	}

	for i, v := range nums {
		if !visited[i] {
			data = append(data, v)
			visited[i] = true
			permuteDfs(nums, data, visited, res)
			visited[i] = false
			data = data[:len(data)-1]
		}
	}
}
