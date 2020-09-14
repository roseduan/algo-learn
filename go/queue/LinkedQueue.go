package queue

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

func NewLinkedQueue() *LinkedQueue {
	return &LinkedQueue{nil, nil, 0}
}

//入队列
func (queue *LinkedQueue) Enqueue(val interface{}) {
	node := newNode(val)

	queue.tail.next = node
	queue.tail = node
	queue.size++
}

//出队列
func (queue *LinkedQueue) Dequeue(val interface{}) *ListNode {
	return nil
}
