package queue

import (
	"errors"
	"fmt"
)

//队列实现（基于数组）

type ArrayQueue struct {
	data     []interface{}
	head     int
	tail     int
	size     int
	capacity int
}

func NewArrayQueue(capacity int) *ArrayQueue {
	return &ArrayQueue{
		size: 0, head: 0, tail: 0,
		data:     make([]interface{}, capacity),
		capacity: capacity,
	}
}

//入队列
func (queue *ArrayQueue) Enqueue(val interface{}) error {
	if queue.tail >= queue.capacity && queue.head == 0 {
		return errors.New("queue is full")
	}

	if queue.head > 0 {
		copy(queue.data[0:], queue.data[queue.head:])
		queue.tail -= queue.head
		queue.head = 0
	}

	queue.data[queue.tail] = val
	queue.size++
	queue.tail++
	return nil
}

//出队列
func (queue *ArrayQueue) Dequeue() (interface{}, error) {
	if queue.Empty() {
		return nil, errors.New("queue is empty")
	}

	res := queue.data[queue.head]
	queue.size--
	queue.head++
	return res, nil
}

//队头元素
func (queue *ArrayQueue) Front() interface{} {
	return queue.data[queue.head]
}

//队尾元素
func (queue *ArrayQueue) Back() interface{} {
	return queue.data[queue.tail-1]
}

func (queue *ArrayQueue) Empty() bool {
	return queue.size <= 0
}

func (queue *ArrayQueue) Size() int {
	return queue.size
}

func (queue *ArrayQueue) PrintData() {
	for i := queue.head; i < queue.tail; i++ {
		fmt.Print(queue.data[i], " ")
	}
	fmt.Println()
}
