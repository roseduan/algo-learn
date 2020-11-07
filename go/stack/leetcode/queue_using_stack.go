package main

// 用栈实现队列

type MyQueue struct {
	input  []int
	output []int
}

func constructor() MyQueue {
	return MyQueue{}
}

func (this *MyQueue) Push(x int) {
	this.input = append(this.input, x)
}

func (this *MyQueue) Pop() int {
	this.Peek()
	res := this.output[len(this.output)-1]
	this.output = this.output[:len(this.output)-1]
	return res
}

func (this *MyQueue) Peek() int {
	if len(this.output) == 0 {
		for _, v := range this.input {
			this.output = append([]int{v}, this.output...)
		}
		this.input = []int{}
	}
	return this.output[len(this.output)-1]
}

func (this *MyQueue) Empty() bool {
	return len(this.input) == 0 && len(this.output) == 0
}
