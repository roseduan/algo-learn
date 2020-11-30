package linked_queue

import "fmt"

//链式队列的实现（基于链表）

type ListNode struct {
	next *ListNode
	val  interface{}
}

type LinkedQueue struct {
	head *ListNode
	tail *ListNode
	size int
}

func newNode(val interface{}) *ListNode {
	return &ListNode{nil, val}
}

func New() *LinkedQueue {
	return &LinkedQueue{nil, nil, 0}
}

//入队列
func (q *LinkedQueue) Enqueue(val interface{}) {
	node := newNode(val)

	if q.head == nil {
		q.head = node
	} else {
		q.tail.next = node
	}

	q.tail = node
	q.size++
}

//出队列
func (q *LinkedQueue) Dequeue() *ListNode {
	if q.size <= 0 {
		return nil
	}

	r := q.head
	q.head = q.head.next
	q.size--
	return r
}

//队头节点
func (q *LinkedQueue) Front() *ListNode {
	if q.size <= 0 {
		return nil
	}
	return q.head
}

//队尾节点
func (q *LinkedQueue) Back() *ListNode {
	if q.size <= 0 {
		return nil
	}
	return q.tail
}

func (q *LinkedQueue) Size() int {
	return q.size
}

func (q *LinkedQueue) PrintData() {
	p := q.head
	for p != nil {
		fmt.Print(p.val, " ")
		p = p.next
	}
	fmt.Println()
}
