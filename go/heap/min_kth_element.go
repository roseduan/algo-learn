package main

import (
	"container/heap"
	"sort"
)

//最小的k的个数

//排序，取前k个
func getLeastNumbers1(arr []int, k int) []int {
	sort.Ints(arr)
	return arr[:k]
}

//使用一个堆
func getLeastNumbers2(arr []int, k int) []int {
	h := &PriorityQueue{[]int{}}
	heap.Init(h)
	for _, v := range arr {
		heap.Push(h, v)
	}

	var res []int
	for i := 0; i < k; i++ {
		res = append(res, heap.Pop(h).(int))
	}
	return res
}

type PriorityQueue struct {
	items []int
}

func (h *PriorityQueue) Len() int           { return len(h.items) }
func (h *PriorityQueue) Less(i, j int) bool { return h.items[i] < h.items[j] }
func (h *PriorityQueue) Swap(i, j int)      { h.items[i], h.items[j] = h.items[j], h.items[i] }
func (h *PriorityQueue) Push(v interface{}) { h.items = append(h.items, v.(int)) }
func (h *PriorityQueue) Pop() interface{} {
	n := len(h.items)
	x := h.items[n-1]
	h.items = h.items[:n-1]
	return x
}
