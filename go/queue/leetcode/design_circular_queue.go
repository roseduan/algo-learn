package main

type MyCircularDeque struct {
	data       []int
	head, tail int
}

func Constructor(k int) MyCircularDeque {
	return MyCircularDeque{make([]int, k), 0, 0}
}

func (this *MyCircularDeque) InsertFront(value int) bool {
	return false
}

func (this *MyCircularDeque) InsertLast(value int) bool {
	return false
}

func (this *MyCircularDeque) DeleteFront() bool {
	return false
}

func (this *MyCircularDeque) DeleteLast() bool {
	return false
}

func (this *MyCircularDeque) GetFront() int {
	return 1
}

func (this *MyCircularDeque) GetRear() int {
	return 1
}

func (this *MyCircularDeque) IsEmpty() bool {
	return false
}

func (this *MyCircularDeque) IsFull() bool {
	return false
}
