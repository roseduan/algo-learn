package circular_linkedlist

import (
	"fmt"
)

//循环链表实现

//链表节点定义
type ListNode struct {
	val  interface{}
	next *ListNode
}

//新建节点
func newNode(val interface{}) *ListNode {
	return &ListNode{val, nil}
}

//链表定义
type LinkedList struct {
	head, tail *ListNode
	length     int
}

func New() *LinkedList {
	return &LinkedList{nil, nil, 0}
}

//添加节点
func (lis *LinkedList) PushBack(val interface{}) *ListNode {
	node := newNode(val)
	if lis.head == nil {
		lis.head = node
	} else {
		node.next = lis.head
		lis.tail.next = node
	}

	lis.tail = node
	lis.length++
	return node
}

//在某个节点之后插入数据
func (lis *LinkedList) PushAfter(p *ListNode, val interface{}) *ListNode {
	if p == nil {
		return p
	}

	if p == lis.tail {
		return lis.PushBack(val)
	}

	node := newNode(val)
	var prev *ListNode
	if p == lis.head {
		prev = lis.tail
	} else {
		for prev = lis.head; prev.next != p && prev != lis.tail; prev = prev.next {
		}
	}

	lis.length++
	return node
}

//打印所有节点数据
func (lis *LinkedList) PrintData() {
	for p := lis.head; p != lis.tail; p = p.next {
		fmt.Print(p.val, " ")
	}

	if lis.tail != nil {
		fmt.Print(lis.tail.val, "\n")
	}
}
