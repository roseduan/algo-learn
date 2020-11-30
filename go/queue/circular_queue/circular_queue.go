package circular_queue

import "errors"

//循环队列实现（基于数组）

type CircularQueue struct {
	data     []interface{}
	head     int
	tail     int
	capacity int
	size     int
}

func New(capacity int) *CircularQueue {
	return &CircularQueue{
		data:     make([]interface{}, capacity),
		head:     0,
		tail:     0,
		capacity: capacity,
		size:     0,
	}
}

//入队
func (q *CircularQueue) Enqueue(val interface{}) error {
	if q.Full() {
		return errors.New("queue is full")
	}

	q.data[q.tail] = val
	q.tail = (q.tail + 1) % q.capacity
	q.size++
	return nil
}

//出队
func (q *CircularQueue) Dequeue() interface{} {
	if q.Empty() {
		return nil
	}

	res := q.data[q.head]
	q.head = (q.head + 1) % q.capacity
	q.size--
	return res
}

//队列头元素
func (q *CircularQueue) Front() interface{} {
	return q.data[q.head]
}

//队列尾部元素
func (q *CircularQueue) Rear() interface{} {
	tail := q.tail - 1
	if tail < 0 {
		tail = q.capacity - 1
	}
	return q.data[tail]
}

//队列是否为空
func (q *CircularQueue) Empty() bool {
	return q.size == 0
}

//队列是否已满
func (q *CircularQueue) Full() bool {
	return q.size == q.capacity
}
