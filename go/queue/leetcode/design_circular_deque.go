package main

//设计循环双端队列

type MyCircularDeque struct {
	data []int
	cap  int
}

/** Initialize your data structure here. Put the size of the deque to be k. */
func NewCircularDeque(k int) MyCircularDeque {
	var data []int
	return MyCircularDeque{
		data, k,
	}
}

/** Adds an item at the front of Deque. Return true if the operation is successful. */
func (this *MyCircularDeque) InsertFront(value int) bool {
	if this.cap == len(this.data) {
		return false
	}

	this.data = append([]int{value}, this.data...)
	return true
}

/** Adds an item at the rear of Deque. Return true if the operation is successful. */
func (this *MyCircularDeque) InsertLast(value int) bool {
	if this.cap == len(this.data) {
		return false
	}

	this.data = append(this.data, value)
	return true
}

/** Deletes an item from the front of Deque. Return true if the operation is successful. */
func (this *MyCircularDeque) DeleteFront() bool {
	if this.IsEmpty() {
		return false
	}

	this.data = this.data[1:]
	return true
}

/** Deletes an item from the rear of Deque. Return true if the operation is successful. */
func (this *MyCircularDeque) DeleteLast() bool {
	if this.IsEmpty() {
		return false
	}

	this.data = this.data[:len(this.data)-1]
	return true
}

/** Get the front item from the deque. */
func (this *MyCircularDeque) GetFront() int {
	if this.IsEmpty() {
		return -1
	}

	return this.data[0]
}

/** Get the last item from the deque. */
func (this *MyCircularDeque) GetRear() int {
	if this.IsEmpty() {
		return -1
	}

	return this.data[len(this.data)-1]
}

/** Checks whether the circular deque is empty or not. */
func (this *MyCircularDeque) IsEmpty() bool {
	return len(this.data) == 0
}

/** Checks whether the circular deque is full or not. */
func (this *MyCircularDeque) IsFull() bool {
	return len(this.data) == this.cap
}
