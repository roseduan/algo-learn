package main

import (
	"math/rand"
)

//打乱数组

type Solution struct {
	nums []int
}

func Constructor(nums []int) Solution {
	return Solution{nums}
}

func (this *Solution) Reset() []int {
	return this.nums
}

func (this *Solution) Shuffle() []int {
	data := make([]int, len(this.nums))
	copy(data, this.nums)
	for i := 0; i < len(data); i++ {
		j := rand.Intn(len(data))
		data[i], data[j] = data[j], data[i]
	}
	return data
}
