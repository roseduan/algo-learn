package main

//子集

func subsets(nums []int) [][]int {
	var res [][]int
	subsetsHelper(nums, 0, []int{}, &res)
	return res
}

func subsetsHelper(nums []int, k int, data []int, res *[][]int) {
	temp := make([]int, len(data))
	copy(temp, data)
	*res = append(*res, temp)

	for i := k; i < len(nums); i++ {
		data = append(data, nums[i])
		subsetsHelper(nums, i+1, data, res)
		data = data[:len(data)-1]
	}
}
