package doubly_linkedlist

import "fmt"

//双向链表的实现

//节点定义
type ListNode struct {
	val        interface{}
	prev, next *ListNode
}

//新建节点
func newNode(val interface{}) *ListNode {
	return &ListNode{val, nil, nil}
}

//链表定义
type LinkedList struct {
	head   *ListNode
	length int
}

//新建链表
func New() *LinkedList {
	return &LinkedList{nil, 0}
}

//插入数据到链表头部
func (lis *LinkedList) pushFront(val interface{}) *ListNode {
	node := newNode(val)
	if lis.head != nil {
		lis.head.prev = node
		node.next = lis.head
	}

	lis.head = node
	lis.length++
	return node
}

//插入数据到链表尾部
func (lis *LinkedList) pushBack(val interface{}) *ListNode {
	if lis.head == nil {
		lis.length++
		return lis.pushFront(val)
	}

	node := newNode(val)
	p := lis.head
	for ; p.next != nil; p = p.next {
	}

	p.next = node
	node.prev = p
	lis.length++
	return node
}

//在某个节点之后插入数据
func (lis *LinkedList) pushAfter(p *ListNode, val interface{}) *ListNode {
	if p == nil {
		return nil
	}

	node := newNode(val)
	p.next = node
	node.prev = p
	lis.length++
	return node
}

//在某个节点之前插入元素（与单链表的主要差异体现在这里）
func (lis *LinkedList) pushBefore(p *ListNode, val interface{}) *ListNode {
	if p == nil {
		return nil
	}

	node := newNode(val)
	prev := p.prev
	if prev == nil {
		lis.pushFront(val)
	} else {
		p.prev = node
		node.next = p
		prev.next = node
		node.prev = prev
	}

	lis.length++
	return node
}

//打印所有链表数据
func (lis *LinkedList) printData() {
	for p := lis.head; p != nil; p = p.next {
		fmt.Print(p.val, " ")
	}
	fmt.Println()
}
