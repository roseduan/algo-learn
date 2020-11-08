package main

//用队列实现栈

type MyStack struct {
	queue []int
}

func constructor() MyStack {
	return MyStack{}
}

func (this *MyStack) Push(x int) {
	this.queue = append(this.queue, x)
	n := len(this.queue)
	if n > 1 {
		last := this.queue[n-1]
		copy(this.queue[1:], this.queue[0:n-1])
		this.queue[0] = last
	}
}

func (this *MyStack) Pop() int {
	val := this.queue[0]
	this.queue = this.queue[1:]
	return val
}

func (this *MyStack) Top() int {
	return this.queue[0]
}

func (this *MyStack) Empty() bool {
	return len(this.queue) == 0
}
