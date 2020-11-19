package main

// 设计循环队列

type MyCircularQueue struct {
	data             []int
	head, tail, size int
}

func Constructor(k int) MyCircularQueue {
	return MyCircularQueue{
		make([]int, k),
		0, 0, 0,
	}
}

func (this *MyCircularQueue) EnQueue(value int) bool {
	if this.size == len(this.data) {
		return false
	}
	this.data[this.tail] = value
	this.tail = (this.tail + 1) % len(this.data)
	this.size++
	return true
}

func (this *MyCircularQueue) DeQueue() bool {
	if this.size == 0 {
		return false
	}

	this.head = (this.head + 1) % len(this.data)
	this.size--
	return true
}

func (this *MyCircularQueue) Front() int {
	if this.size == 0 {
		return -1
	}
	return this.data[this.head]
}

func (this *MyCircularQueue) Rear() int {
	if this.size == 0 {
		return -1
	}

	idx := this.tail - 1
	if idx < 0 {
		idx = len(this.data) - 1
	}
	return this.data[idx]
}

func (this *MyCircularQueue) IsEmpty() bool {
	return this.size == 0
}

func (this *MyCircularQueue) IsFull() bool {
	return this.size == len(this.data)
}
