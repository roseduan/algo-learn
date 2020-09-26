package main

import (
	"math"
)

//最小栈

type MinStack struct {
	stack []int
	min   []int
}

/** initialize your data structure here. */
func Constructor() MinStack {
	return MinStack{[]int{}, []int{math.MaxInt64}}
}

func (this *MinStack) Push(x int) {
	this.stack = append(this.stack, x)
	this.min = append(this.min, min(x, this.min[len(this.min)-1]))
}

func (this *MinStack) Pop() {
	this.stack = this.stack[:len(this.stack)-1]
	this.min = this.min[:len(this.min)-1]
}

func (this *MinStack) Top() int {
	return this.stack[len(this.stack)-1]
}

func (this *MinStack) GetMin() int {
	return this.min[len(this.min)-1]
}

func min(x int, y int) int {
	if x < y {
		return x
	}
	return y
}
