package main

//旋转数组

func rotate1(nums []int, k int) {
	n := len(nums)
	k = k % n
	reverse(nums, 0, n-1)
	reverse(nums, 0, k-1)
	reverse(nums, k, n-1)
}

func reverse(nums []int, i int, j int) {
	for m, n := i, j; m < n; m, n = m+1, n-1 {
		nums[m], nums[n] = nums[n], nums[m]
	}
}

//第二种解法，新开辟一个数组
func rotate2(nums []int, k int) {
	n := len(nums)
	temp := make([]int, n)
	k = k % n
	for i, v := range nums {
		temp[(i+k)%n] = v
	}
	copy(nums, temp)
}
