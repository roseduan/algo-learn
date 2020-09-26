package main

import (
	"errors"
)

const DefaultCapacity = 16

type BinaryHeap struct {
	data     []int
	size     int
	capacity int
}

func Default() *BinaryHeap {
	return New(DefaultCapacity)
}

func New(capacity int) *BinaryHeap {
	return &BinaryHeap{
		data:     make([]int, capacity),
		size:     0,
		capacity: capacity,
	}
}

//添加
func (h *BinaryHeap) Add(val int) bool {
	if h.size >= h.capacity {
		return false
	}

	h.data[h.size] = val
	h.size++
	k := h.size - 1
	parent := (k - 1) / 2
	for parent >= 0 && h.data[k] < h.data[parent] {
		h.data[k], h.data[parent] = h.data[parent], h.data[k]
		k, parent = parent, (parent-1)/2
	}
	return true
}

//删除堆顶元素
func (h *BinaryHeap) Remove() error {
	if h.size <= 0 {
		return errors.New("heap is null")
	}

	h.size--
	if h.size > 0 {
		h.data[0] = h.data[h.size-1]
		siftDown(h, 0, h.size)
	}
	return nil
}

//获取堆顶元素
func (h *BinaryHeap) Top() int {
	if h.size <= 0 {
		panic("heap is null")
	}
	return h.data[0]
}

//从上往下堆化
func siftDown(h *BinaryHeap, i int, size int) {
	for i < size/2 {
		child := 2*i + 1
		right := child + 1
		if h.data[right] < h.data[child] {
			child = right
		}

		h.data[i], h.data[child] = h.data[child], h.data[i]
		i = child
	}
}
