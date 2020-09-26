package main

import (
	"container/heap"
	"sort"
)

//前k个高频的元素

//第一种方法：使用map统计次数然后排序
func topKFrequent1(nums []int, k int) []int {
	m := map[int]int{}
	for _, v := range nums {
		m[v] += 1
	}

	p := make(PairList, len(m))
	i := 0
	for k, v := range m {
		p[i] = Pair{k, v}
		i++
	}
	sort.Sort(sort.Reverse(p))

	var res []int
	for i := 0; i < k; i++ {
		res = append(res, p[i].Key)
	}
	return res
}

type Pair struct {
	Key   int
	Value int
}

type PairList []Pair

func (p PairList) Len() int           { return len(p) }
func (p PairList) Less(i, j int) bool { return p[i].Value < p[j].Value }
func (p PairList) Swap(i, j int)      { p[i], p[j] = p[j], p[i] }

//第二种方法：计数后使用一个堆
func topKFrequent2(nums []int, k int) []int {
	m := map[int]int{}
	for _, v := range nums {
		m[v] += 1
	}

	queue := &priorityQueue{}
	heap.Init(queue)
	for k, v := range m {
		heap.Push(queue, element{k, v})
	}

	var res []int
	for i := 0; i < k; i++ {
		res = append(res, heap.Pop(queue).(element).value)
	}
	return res
}

type element struct {
	value int
	count int
}

type priorityQueue []element

func (q priorityQueue) Len() int           { return len(q) }
func (q priorityQueue) Less(i, j int) bool { return q[i].count > q[j].count }
func (q priorityQueue) Swap(i, j int)      { q[i], q[j] = q[j], q[i] }

func (q *priorityQueue) Push(x interface{}) {
	*q = append(*q, x.(element))
}

func (q *priorityQueue) Pop() interface{} {
	old := *q
	n := len(old)
	x := old[n-1]
	*q = old[0 : n-1]
	return x
}
